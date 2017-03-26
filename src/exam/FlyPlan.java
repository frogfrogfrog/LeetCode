package exam;

import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/24.
 */
public class FlyPlan {
    class Node {
        int number;
        Node next;

        public Node(int num) {
            number = num;
        }
    }

    int[][] distances = new int[][]{
            {0, 2, 10, 5, 3, 1000}, {1000, 0, 12, 1000, 1000, 10}, {1000, 1000, 0, 1000, 7, 1000},
            {2, 1000, 1000, 0, 2, 1000}, {4, 1000, 1000, 1, 0, 1000}, {3, 1000, 1, 1000, 2, 0},
    };
    Node[] paths = new Node[6];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int to = in.nextInt();
        int smog = in.nextInt();
        new FlyPlan().getShortestDist(to, smog);
    }

    public String getShortestDist(int to, int smog) {
        String res = "[";
        boolean[] visited = new boolean[6];
        for (int i = 0; i < 6; i++) {
            paths[i] = new Node(5);
        }
        int[] shortest = new int[6];
        visited[5 - 1] = true;
        if (smog == 5 || smog == to) {
            System.out.println(1000);
            System.out.print(res + "]");
            return res + "]";
        }
        if (smog >= 1 && smog <= 6) {
            for (int i = 0; i < 6; i++) {
                distances[smog - 1][i] = 1000;
                distances[i][smog - 1] = 1000;
            }
        }
        for (int i = 0; i < 6; i++) {
            shortest[i] = distances[5 - 1][i];
        }
        while (!isDone(visited)) {
            int ss = 1000;
            int next = 0;
            for (int i = 0; i < 6; i++) {
                if (visited[i] == false && shortest[i] < ss) {
                    next = i;
                    ss = shortest[i];
                }
            }
            if (ss == 1000)
                break;
            visited[next] = true;
            for (int i = 0; i < 6; i++) {
                if (i != next && distances[next][i] + shortest[next] < shortest[i]) {
                    shortest[i] = distances[next][i] + shortest[next];
                    Node cur = paths[next];
                    cur = cur.next;
                    Node cur1 = paths[i];
                    while (cur != null) {
                        cur1.next = new Node(cur.number);
                        cur1 = cur1.next;
                        cur = cur.next;
                    }
                    cur1.next = new Node(next + 1);
                }
            }
        }
        Node node = paths[to - 1];
        while (node != null) {
            res = res + node.number + ",";
            node = node.next;
        }
        res += to;
        System.out.println(shortest[to - 1]);
        System.out.print(res + "]");
        return res + "]";
    }

    public boolean isDone(boolean[] flags) {
        for (boolean flag : flags) {
            if (flag == false)
                return false;
        }
        return true;
    }
}
