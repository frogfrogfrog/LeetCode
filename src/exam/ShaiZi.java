package exam;

import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/24.
 */
public class ShaiZi {
    class Cube {
        int left;
        int right;
        int front;
        int back;
        int up;
        int down;

        public Cube() {
            left = 1;
            right = 2;
            front = 3;
            back = 4;
            up = 5;
            down = 6;
        }

        public void rotate(char op) {
            if (op == 'L') {
                int tmp = up;
                up = right;
                right = down;
                down = left;
                left = tmp;
            } else if (op == 'R') {
                int tmp = up;
                up = left;
                left = down;
                down = right;
                right = tmp;
            } else if (op == 'F') {
                int tmp = up;
                up = back;
                back = down;
                down = front;
                front = tmp;
            } else if (op == 'B') {
                int tmp = up;
                up = front;
                front = down;
                down = back;
                back = tmp;
            } else if (op == 'A') {
                int tmp = front;
                front = left;
                left = back;
                back = right;
                right = tmp;
            } else if (op == 'C') {
                int tmp = front;
                front = right;
                right = back;
                back = left;
                left = tmp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int len = str.length();
        int i = 0;
        ShaiZi si = new ShaiZi();
        Cube cube = si.new Cube();
        while (i < len) {
            cube.rotate(str.charAt(i));
            i++;
        }
        System.out.print(cube.left);
        System.out.print(cube.right);
        System.out.print(cube.front);
        System.out.print(cube.back);
        System.out.print(cube.up);
        System.out.print(cube.down);
    }

}
