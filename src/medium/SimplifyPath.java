package medium;

import java.util.Stack;

/**
 * Created by 42160 on 2016/12/17.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String res = "";
        Stack<String> stack = new Stack<String>();
        String[] paths = path.split("/");
        for (String dir : paths) {
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!dir.equals("") && !dir.equals(".") && !dir.equals("..")) {
                stack.push(dir);
            }
        }
        for (String dir : stack) {
            res = res + "/" + dir;
        }
        return res == "" ? "/" : res;
    }

    public static void main(String[] args) {
        printPath("//.");
        String a = "123";
        System.out.println(a == "123");
    }

    public static void printPath(String str) {
        String[] s = str.split("/");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
            System.out.println(s[i] == ".");
        }

    }
}
