import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class massiv {
    public static void main(String[] args) {
        //array1();array2();array3();array4();array5();array6();array7();array8();array9();array10();array11();
        //array12();array13();array14();array15();array16();array17();array18();array19();array20();array21();array22();
        //array23();array24();array25();array26();array27();array28();array29();array30();array31();array40();array43();
        //array()47;array48();array51();array54();array55();array58();array63();array65();array66();array68();array71();
        //array74();array79();
    }


    public static void array1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" massiv elementlar sonini kiriting = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 2 * i + 1;
            System.out.print(a[i] + " ");
        }
    }

    public static void array2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" massiv elementlar sonini kiriting = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) pow(2, i);
            System.out.print(a[i] + " ");
        }
    }

    public static void array3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" arifmetik progressiya elementlar sonini kiriting = ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println(" Dastlabki hadni va ayirmani kiriting ");
        System.out.print("a[1] = ");
        a[0] = scanner.nextInt();
        System.out.print("d = ");
        int d = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + d;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + (i + 1) + "] = " + a[i]);
        }
    }

    public static void array4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" geometrik progressiya elementlar sonini kiriting = ");
        int n = scanner.nextInt();
        int b[] = new int[n];
        System.out.println(" Dastlabki hadni va ayirmani kiriting ");
        System.out.print("b[1] = ");
        b[0] = scanner.nextInt();
        System.out.print("q = ");
        int q = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            b[i] = b[i - 1] * q;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + (i + 1) + "] = " + b[i]);
        }
    }

    public static void array5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" fibonanchi sonning hadlar sonini kiriting ");
        System.out.print(" k = ");
        int k = scanner.nextInt();
        int[] F = new int[k];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i < F.length; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        for (int i = 0; i < F.length; i++) {
            System.out.println("F[" + i + "] = " + F[i]);
        }

    }

    public static void array6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print(" A = ");
        a[0] = scanner.nextInt();
        System.out.print(" B = ");
        a[1] = scanner.nextInt();
        int s = a[0], m = a[1];
        for (int i = 2; i < a.length; i++) {
            s = s + m;
            a[i] = s;
            m = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }

    public static void array7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println(" teskari tartibda ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }

    public static void array8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println(" toqlari indeksi o'sish tartibda ");
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                k++;
                System.out.print(a[i] + " ");

            }
        }
        System.out.println("\n toqlar soni = " + k);
    }

    public static void array9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println(" juftlari indeksi kamayish tartibda ");
        int k = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                k++;
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\n juftlari soni = " + k);
    }

    public static void array10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        int i = a.length - 1;
        while (i >= 0) {
            if (a[i] % 2 == 1) {
                System.out.print(a[i] + " ");
            }
            i--;
        }
    }

    public static void array11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print(" K = ");
        int K = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println(" result ");
        for (int i = 1; i < (float) n / K; i++) {
            System.out.println("a[" + K * i + "] = " + a[i * K]);
        }

    }

    public static void array12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = scanner.nextInt();
            }
            System.out.println(" result ");
            for (int i = 0; i < (float) n / 2; i++) {
                System.out.println("a[" + 2 * i + "] = " + a[i * 2]);
            }
        } else
            System.out.println(" juft son kirit mazgi ");
    }

    public static void array13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            int[] a = new int[n + 1];
            for (int i = 1; i < a.length; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = scanner.nextInt();
            }
            System.out.println(" result ");
            int i = 0;
            while (n > i) {
                System.out.println("a[" + (n - i) + "] = " + a[n - i]);
                i = i + 2;
            }
        } else
            System.out.println(" toq son kirit mazgi ");
    }

    public static void array14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        if (n % 2 == 1) {
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = scanner.nextInt();

            }

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0)
                    System.out.print(" " + a[i]);
            }

            for (int i = 0; i < n; i++) {
                if (i % 2 == 1) {
                    System.out.print(" " + a[i]);
                }
            }


        }
    }

    public static void array15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                System.out.print("a[" + i + "] = ");
                a[i] = scanner.nextInt();

            }
            System.out.println(" toqlari o'sdi ");
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1)
                    System.out.println("a[" + i + "] = " + a[i]);
            }
            System.out.println(" juftlari kamaydi ");
            for (int i = n - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    System.out.println("a[" + i + "] = " + a[i]);
                }
            }

        } else System.out.println(" juft son kirit mazgi ");
    }

    public static void array16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " " + a[n - 1 - i] + " ");
        }

    }

    public static void array17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i += 3) {
            System.out.print(a[i] + " " + a[i + 1] + " " + a[n - 1 - i] + " " + a[n - 1 - (i + 1)] + " ");
        }

    }

    public static void array18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > a[i - 1]) {
                System.out.println(" oxirgi elementdan kichkina bulgan 1-element = " + a[i - 1]);
                break;
            }
        }

    }

    public static void array19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }

        int result = 0, k = 0;
        int i = 1;
        while (n - 1 > i) {
            if (a[0] < a[i] && a[i] < a[n - 1]) {
                result = i;
            } else {
                k = result;
            }

            i++;

        }
        System.out.println(" result indeksi = " + result);

    }

    public static void array20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int K, L, summa = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println(" K va L sonlarini kiriting quyidagi shart buyicha 0<=K<=L<=" + (n - 1));
        System.out.print(" K = ");
        K = scanner.nextInt();
        System.out.print(" L = ");
        L = scanner.nextInt();
        boolean m = (K >= 0 && K <= L && L <= n);
        if (m) {
            for (int i = K + 1; i < L; i++) {
                summa = summa + a[i];
            }
            System.out.println(" summa = " + summa);
        } else
            System.out.println(" shart buyicha yoz mazgi");

    }

    public static void array21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int K, L, summa = 0, j = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.println(" K va L sonlarini kiriting quyidagi shart buyicha 0<=K<=L<=" + (n - 1));
        System.out.print(" K = ");
        K = scanner.nextInt();
        System.out.print(" L = ");
        L = scanner.nextInt();
        boolean m = (K >= 0 && K <= L && L <= n);
        if (m) {
            for (int i = K + 1; i < L; i++) {
                summa = summa + a[i];
                j++;
            }
            System.out.println(" summa average = " + (float) summa / (j));
        } else
            System.out.println(" shart buyicha yoz mazgi");

    }

    public static void array22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int K, L, summa = 0, s = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
            s = s + a[i];
        }
        System.out.println(" K va L sonlarini kiriting quyidagi shart buyicha 0<=K<=L<=" + (n - 1));
        System.out.print(" K = ");
        K = scanner.nextInt();
        System.out.print(" L = ");
        L = scanner.nextInt();
        boolean m = (K >= 0 && K <= L && L <= n);
        if (m) {
            for (int i = K + 1; i < L; i++) {
                summa = summa + a[i];
            }
            System.out.println(" tashqaridagi summa = " + (s - summa));
        } else
            System.out.println(" shart buyicha yoz mazgi");

    }

    public static void array23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        float n = scanner.nextFloat();
        float[] a = new float[(int) n];
        int K, L;
        float summa = 0, s = 0, j = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
            s = s + a[i];
        }
        System.out.println(" K va L sonlarini kiriting quyidagi shart buyicha 0<=K<=L<=" + (n - 1));
        System.out.print(" K = ");
        K = scanner.nextInt();
        System.out.print(" L = ");
        L = scanner.nextInt();
        boolean m = (K >= 0 && K <= L && L <= n);
        if (m) {
            for (int i = K + 1; i < L; i++) {
                summa = summa + a[i];
                j++;
            }
            System.out.println(summa);
            System.out.println(s);
            System.out.println(n - j);
            float p = 1;
            p = ((s - summa) / (n - j));
            System.out.println(" tashqaridagi average summa = " + p);
        } else
            System.out.println(" shart buyicha yoz mazgi");

    }

    public static void array24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" massiv elementlar sonini kiritng ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int j = 2;
        while (n - 1 >= j) {
            if (a[j] - a[j - 1] == a[j - 1] - a[j - 2]) {
                j++;
            } else {
                break;
            }
        }
        if (j > n - 1) {
            System.out.println(" ayirmasi = " + (a[n - 1] - a[n - 2]));
        } else
            System.out.println(" arifmetik progressiya emas ");
    }

    public static void array25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" massiv elementlar sonini kiritng ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int j = 2;
        while (n - 1 >= j) {
            if (a[j] / a[j - 1] == a[j - 1] / a[j - 2]) {
                j++;
            } else {
                break;
            }
        }
        if (j > n - 1) {
            System.out.println(" maxraji = " + (a[n - 1] / a[n - 2]));
        } else
            System.out.println(" geometrik progressiya emas ");
    }

    public static void array26() {
        int[] massiv = {1, 2, 3, 6, 5, 5, 8, 9}; // Massivni o'zgartiring

        boolean ketmaKet = true;
        for (int i = 0; i < massiv.length - 1; i++) {
            if (massiv[i] % 2 == massiv[i + 1] % 2) {
                ketmaKet = false;
                break;
            }
        }

        if (ketmaKet) {
            System.out.println(0);
        } else {
            int birinchiIndeks = -1;
            for (int i = 0; i < massiv.length - 1; i++) {
                if (massiv[i] % 2 == massiv[i + 1] % 2) {
                    birinchiIndeks = i;
                    break;
                }
            }

            System.out.println(birinchiIndeks + 1);
        }
    }

    public static void array27() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean k = true;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int indeks = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] * a[i + 1] > 0) {
                k = false;
                indeks = i + 1;
                break;
            }
        }

        if (k)
            System.out.println("0");
        else
            System.out.println(" buzgan indeks = " + indeks);


    }

    public static void array28() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean k = true;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i += 2) {
            if (min > a[i])
                min = a[i];
        }
        System.out.println(" result = " + min);


    }

    public static void array29() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean k = true;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < n; i += 2) {
            if (max < a[i])
                max = a[i];
        }
        System.out.println(" result = " + max);


    }

    public static void array30() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE, k = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                System.out.print(i + " ");
                k++;
            }
        }
        System.out.println(" \n elementlar soni = " + k);


    }

    public static void array31() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int k = 0;

        for (int i = n - 1; i >= 1; i--) {
            if (a[i] > a[i - 1]) {
                System.out.print(i + " ");
                k++;
            }
        }
        System.out.println(" \n elementlar soni = " + k);


    }

    public static void array40() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        System.out.print(" R = ");
        int r = scanner.nextInt();
        int check = 0;
        for (int i = 1; i < n; i++) {

            if (abs((a[i]) - r) < abs((a[i - 1] - r))) {
                check = a[i];
            }
        }
        System.out.println(r + " ga eng yaqin son = " + check);


    }

    public static void array43() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && a[i] == a[j])
                    k++;
            }

        }
        System.out.print("xar xil qiymatli elementlar soni = " + (n - k));


    }

    public static void array47() {
        int[] array = {2, 4, 9, 6, 4, 8, 2, 10, 12, 10};

        for (int i = 0; i < array.length; i++) {
            boolean k = false;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    k = true;
                    break;
                }
            }

            if (!k) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void array48() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(6) + 5;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int k = 0, max = 0, m = 0;
        for (int i = 0; i < n; i++) {
            k = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    k++;
                }

            }
            if (max < k) {
                max = k;
                m = i;
            }
        }
        System.out.println(" \n eng ko'p " + max + " marta qatnashgan element = " + a[m]);
    }

    public static void array51() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10) + 1;
            b[i] = random.nextInt(11) + 10;
        }
        System.out.println(" A masiv elementlari ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n B masiv elementlari ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" \n A massiv B massiv elementlarini uzlashtirdi ");
        for (int i = 0; i < n; i++) {
            b[i] = b[i] * a[i];
            a[i] = b[i] / a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println("\n B massiv A massiv elementlarini uzlashtirdi ");
        for (int i = 0; i < n; i++) {
            b[i] = b[i] / a[i];
            System.out.print(b[i] + " ");
        }
    }

    public static void array54() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10) + 1;
        }
        System.out.println(" A masiv elementlari ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int k = 0;
        System.out.println("\n A massivni juft elementlaridan tashkil topgan B masiv elementlari ");
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[i] = a[i];
                k++;
                System.out.print(b[i] + " ");
            }
        }
        System.out.println("\n element soni = " + k);

    }

    public static void array55() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10) + 1;
        }
        System.out.println(" A masiv elementlari ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int k = 0;
        System.out.println(" \n A masiv toq indeksli elementlaridan tashkil topgan B massiv elementlari  ");
        for (int i = 1; i < n; i += 2) {
            b[i] = a[i];
            k++;
            System.out.print(b[i] + " ");
        }
        System.out.println("\n elementlar soni = " + k);


    }

    public static void array58() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        b[0] = 0;
        System.out.println(" A masiv elementlari ");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10) + 1;
            System.out.print(a[i] + " ");
        }

        System.out.println(" \n B massiv elementlari  ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                b[i] = b[i] + a[j];
            }
            System.out.print(b[i] + " ");

        }

    }

    public static void array63() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[10];
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        System.out.println(" A massiv elementlari ");
        int i = 0;
        while (n - 1 >= i) {
            a[i] = random.nextInt(0, 1000);
            if (a[i] >= max) {
                System.out.print(a[i] + " ");
                max = a[i];
                c[i] = a[i];
                i++;
            }
        }
        System.out.println("\n B massiv elementlari ");
        int j = 0;
        while (n - 1 >= j) {
            b[j] = random.nextInt(0, 1000);
            if (b[j] >= a[n - 1]) {
                System.out.print(b[j] + " ");
                c[j + n] = b[j];
                a[n - 1] = b[j];

                j++;
            }
        }
        System.out.println("\n C massiv elementlari ");
        for (int k = 0; k < 2 * n; k++) {
            System.out.print(c[k] + " ");
        }


    }

    public static void array65() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println(" A massiv elementlari ");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 20);
            System.out.print(a[i] + " ");
        }
        System.out.print("\n 1<=k<=n buyicha K ni kirit = ");
        int k = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + a[k] + " ");

        }

    }

    public static void array66() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int k = 0;
        boolean j = true;
        System.out.println(" A massiv elementlari ");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 20);
            System.out.print(a[i] + " ");
            if (j && a[i] % 2 == 0) {
                k = a[i];
                j = false;
            }
        }
        if (!j) {
            System.out.println("\n juft elementlar ga " + k + " qo'shildi ");
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    System.out.print(a[i] + k + " ");
                }
            }

        } else {
            System.out.println(" \n A massiv elementlari uzgarishsiz qoldi  ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }

    }

    public static void array68() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean j = true;
        int x, y;
        System.out.println(" A massiv elementlari ");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 20);
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                x = i;
            }
            if (max < a[i]) {
                max = a[i];
                y = i;
            }
        }
        System.out.println(" \nmin va max urni almshdi ");
        for (int i = 0; i < n; i++) {
            if (a[i] == min) {
                System.out.print(max + " ");
            } else if (a[i] == max) {
                System.out.print(min + " ");
            } else
                System.out.print(a[i] + " ");

        }

    }

    public static void array71() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int k = 0;

        System.out.println(" A massiv elementlari ");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 100);
            System.out.print(a[i] + " ");
        }
        int i = 0;
        while (n - 1 > i) {
            k = a[i];
            a[i] = a[n - 1];
            a[n - 1] = k;
            n--;
            i++;
        }
        System.out.println("\n changed ");
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }

    }

    public static void array74() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int x = 0, y = 0;
        System.out.println(" A massiv elementlari ");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 100);
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                x = i;
            }
            if (max < a[i]) {
                max = a[i];
                y = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (x < y) {
                if (i > x && i < y) {
                    a[i] = 0;
                }
            } else if (x > y) {
                if (i > y && i < x) {
                    a[i] = 0;
                }

            }
        }
        System.out.println("\n show the result ");
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");
        }

    }

    public static void array79() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" elementlar soni = ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int k = 0, y = 0;
        System.out.println(" A massiv elementlari ");
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(0, 100);
            System.out.print(a[i] + " ");
        }
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        System.out.println("show my result ");
        a[0] = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }


}


