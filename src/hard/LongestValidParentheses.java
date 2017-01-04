package hard;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by 42160 on 2017/1/4.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0, curMax = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                    int lastPos = -1;
                    if (!stack.isEmpty())
                        lastPos = stack.peek();
                    curMax = i - lastPos;
                    max = Math.max(max, curMax);
                } else {
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new LongestValidParentheses().longestValidParentheses("(()");
    }
}
