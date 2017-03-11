package exam;

import easy.IntegerBreak;

import java.util.Map;

/**
 * Created by 42160 on 2017/3/11.
 */
public class Mahjong {
    public static void main(String[] args) {
        int[] test1 = new int[]{4, 1, 1, 0, 2, 0, 0, 0, 0};
        int[] test2 = new int[]{4, 1, 1, 0, 0, 0, 0, 0, 0};
        int[] test3 = new int[]{0, 2, 2, 2, 0, 0, 0, 0, 2};
        int[] test4 = new int[]{0, 2, 0, 0, 0, 0, 0, 0, 0};
        int[] test5 = new int[]{0, 1, 1, 2, 1, 1, 0, 3, 2};
        System.out.println(canWin(test1));
//        for (int i:test1) {
//            System.out.print(i+",");
//        }
        System.out.println(canWin(test2));
        System.out.println(canWin(test3));
        System.out.println(canWin(test4));
        System.out.println(canWin(test5));

    }

    public static boolean canWin(int[] cards) {
        int length = cards.length;
        int cardsNum = 0;
        for (int i = 0; i < length; i++) {
            cardsNum += cards[i];
        }
        if (cardsNum == 2) {
            for (int i = 0; i < length; i++) {
                if (cards[i] == 2)
                    return true;
            }
            return false;
        }
        cardsNum -= 2;
        for (int i = 0; i < length; i++) {
            if (cards[i] >= 2) {
                cards[i] -= 2;
                if (isTriples(cards, cardsNum, 0)) {
                    cards[i] += 2;
                    return true;
                }
                cards[i] += 2;
            }
        }
        return false;
    }

    public static boolean isTriples(int[] cards, int cardsNum, int index) {
        if (cardsNum == 0)
            return true;
        if (cardsNum % 3 != 0)
            return false;
        int length = cards.length;
        while (index < length && cards[index] == 0)
            index++;
        if (cards[index] != 3) {
            if (index >= length - 2)
                return false;
            if (cards[index + 1] == 0 || cards[index + 2] == 0)
                return false;
            cards[index] -= 1;
            cards[index + 1] -= 1;
            cards[index + 2] -= 1;
            boolean flag = isTriples(cards, cardsNum - 3, index);
            cards[index] += 1;
            cards[index + 1] += 1;
            cards[index + 2] += 1;
            return flag;
        } else {
            if (index >= length - 2 || cards[index + 1] == 0 || cards[index + 2] == 0) {
                cards[index] -= 3;
                boolean flag = isTriples(cards, cardsNum - 3, index + 1);
                cards[index] += 3;
                return flag;
            } else {
                cards[index] -= 3;
                boolean flag1 = isTriples(cards, cardsNum - 3, index + 1);
                cards[index] += 2;
                cards[index + 1] -= 1;
                cards[index + 2] -= 1;
                boolean flag2 = isTriples(cards, cardsNum - 3, index);
                cards[index] += 1;
                cards[index + 1] -= 1;
                cards[index + 2] -= 1;
                return flag1 || flag2;
            }
        }

    }
}
