import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Matrixga {
    //Matrix31

    //Matrix ga oid misollar yechimi telegram kanalimda  ----> @codingjavaa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print(" satr = ");
        int s = scanner.nextInt();
        System.out.print(" ustun = ");
        int u = scanner.nextInt();

        int[][] a = new int[s][u];
        float sumaverage = 0, ovaverage = 1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < u; j++) {
                a[i][j] = random.nextInt(1, 10);
                sumaverage += a[i][j];
            }
        }
        ovaverage = (float) sumaverage / (s * u);

        System.out.println(" umumiy urt arif progrress = " + ovaverage);

        for (int i = 0; i < s; i++) {
            for (int j = 0; j < u; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        float[] RowAverage = new float[s];
        float[] ColAverage = new float[u];
        int sa = 0, us = 0, IndexR = 0, IndexC = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < u; j++) {
                sa = sa + a[i][j];
            }
            RowAverage[i] = (float) sa / u;
            System.out.println((i + 1) + "-satr urt arif progress = " + RowAverage[i]);
            sa = 0;
        }
        System.out.println();

        for (int i = 0; i < u; i++) {
            for (int j = 0; j < s; j++) {
                us = us + a[j][i];
            }
            ColAverage[i] = (float) us / s;
            System.out.println((i + 1) + "-ustun urt arif progress = " + ColAverage[i]);
            us = 0;
        }


        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < u - 1; j++) {
                if (abs(ovaverage - RowAverage[i]) > abs(ovaverage - RowAverage[i + 1])) {
                    IndexR = i + 1;
                }
                if (abs(ovaverage - ColAverage[i]) > abs(ovaverage - ColAverage[i + 1])) {
                    IndexC = i + 1;
                }
            }
        }

        System.out.println(" satr indeksi = " + IndexR);
        System.out.println(" ustun indeksi = " + IndexC);

    }
}
