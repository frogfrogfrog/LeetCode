package exam;

import java.util.Scanner;

/**
 * Created by 42160 on 2017/3/25.
 */
public class GoToOffice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int taxStations = in.nextInt();
        int[][] taxPos = new int[taxStations][2];


        for (int i = 0; i < taxStations; i++) {
            taxPos[i][0] = in.nextInt();
        }
        for (int i = 0; i < taxStations; i++) {
            taxPos[i][1] = in.nextInt();
        }

        int targetX = in.nextInt();
        int targetY = in.nextInt();

        int walkTime = in.nextInt();
        int taxTime = in.nextInt();

        int minTime = walkToTarget(targetX, targetY, walkTime);
        for (int i = 0; i < taxStations; i++) {
            int time = takeTaxiToTarget(targetX, targetY, taxPos[i][0], taxPos[i][1], walkTime, taxTime);
            if (time < minTime)
                minTime = time;
        }
        System.out.print(minTime);
    }

    public static int takeTaxiToTarget(int targetX, int targetY, int taxiX, int taxiY, int walkTime, int taxiTime) {
        return (Math.abs(taxiX) + Math.abs(taxiY)) * walkTime + (Math.abs(targetX - taxiX) + Math.abs(targetY - taxiY)) * taxiTime;
    }

    public static int walkToTarget(int targetX, int targetY, int walkTime) {
        return (Math.abs(targetX) + Math.abs(targetY)) * walkTime;
    }
}
