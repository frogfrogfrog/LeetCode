package medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by 42160 on 2016/12/25.
 */
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int eval = 0;
        int size = tokens.length;
        Deque<Integer> operands = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            if (isOperator(tokens[i])) {
                int operand2 = operands.pop();
                int operand1 = operands.pop();
                operands.push(doCalculate(tokens[i].charAt(0), operand1, operand2));
            } else
                operands.push(Integer.parseInt(tokens[i]));
        }
        if (!operands.isEmpty())
            return operands.pop();
        return eval;
    }

    public int doCalculate(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                return 0;
        }
    }

    public boolean isOperator(String s) {
        if (s.length() != 1)
            return false;
        char c = s.charAt(0);
        if (c == '+' || c == '-' || c == '*' || c == '/')
            return true;
        else
            return false;
    }
}
