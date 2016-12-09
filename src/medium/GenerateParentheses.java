package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private List<String> res = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        this.generate("", n, 0);
        return this.res;
    }

    public void generate(String tmp, int left, int right) {
        if (left == 0 && right == 0)
            res.add(tmp);
        if (left > 0)
            generate(tmp + "(", left - 1, right + 1);
        if (right > 0)
            generate(tmp + ")", left, right - 1);
    }

    public static void main(String[] args) {
        new GenerateParentheses().generateParenthesis(3);
    }
}
