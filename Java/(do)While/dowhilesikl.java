import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.scalb;

public class dowhilesikl {
    public static void main(String[] args) {
        //while1();while2();while3();while4();while5();while6();while7();while8();while9();while10();while11();while12();
        //while13();while14();while()15;while16();while17();while18();while19();while20();while21();while22();while23();
        //while24();while25();while26();while27();while28();while29();while30();
        while30();
    }
    // 28 va 29 - misol chala qoldi

    public static void while1() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" A = ");
        int a = scanner.nextInt();
        System.out.print(" B = ");
        int b = scanner.nextInt();
        int k = 0;
        if (a > b) {
            while (a > b) {
                k++;
                a--;
            }
            System.out.println(" kesma bo'sh qismi = " + k);
        } else
            System.out.println("a>b tarzda sonn kirit");
    }

    public static void while2() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" A = ");
        int a = scanner.nextInt();
        System.out.print(" B = ");
        int b = scanner.nextInt();
        int k = 0;
        if (a > b) {
            while (a > k * b) {
                k++;
            }
            System.out.println("B kesmani A kesmaga " + k + " ta joylashtirish mumkin ");
        } else
            System.out.println("a>b tarzda sonn kirit");
    }

    public static void while3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.print(" K = ");
        int k = scanner.nextInt();
        int d = k, l = 0;
        while (n >= k) {
            k = k + d;
            l++;
        }
        System.out.println(n + " ni " + d + " bo'lganda qoldiq = " + (n - (k - d)));
        System.out.println("butin qismi  = " + l);

    }

    public static void while4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        int i = 0;
        while (n > i) {
            i = i + 3;
        }
        if (i == n)
            System.out.println(" 3 ga karrali son");

        else
            System.out.println(" 3 ga karrali bo'lmagan son ");

    }

    public static void while5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        int k = 0, i = 1;
        while (n > i) {
            i = i * 2;
            k++;
        }
        if (n == i) {
            System.out.println(" k = " + k);
        } else
            System.out.println(" 2 ning darahajasi boladigan son kiriting ");

    }

    public static void while6() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int s = 1;
        System.out.print("n = ");
        if (n % 2 == 0) {
            while (n >= 2) {
                s *= n;
                System.out.print(n + "*");
                n = n - 2;

            }
            System.out.print(" \n s = " + s + "\n");
        } else {
            while (n >= 1) {
                s *= n;
                System.out.print(n + "*");
                n = n - 2;

            }
            System.out.println("\n s = " + s + "\n");
        }

    }

    public static void while7() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int k = 1;
        while (k * k < n) {
            k++;
        }
        System.out.println("k = " + k);

    }

    public static void while8() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int k = 1;
        while (k * k <= n) {
            k++;
        }
        System.out.println("k = " + (k - 1));
    }

    public static void while9() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int k = 0, s = 1;
        while (s < n) {
            s = s * 3;
            k++;
        }
        System.out.println("k = " + k);
    }

    public static void while10() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int k = 0, s = 1;
        while (s <= n) {
            s = s * 3;
            k++;
        }
        System.out.println("k = " + (k - 1));
    }

    public static void while11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int k = 0, s = 0;
        while (s <= n) {
            k++;
            s = s + k;
        }
        System.out.println("k = " + k);
        System.out.println("summa = " + s);
    }

    public static void while12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int k = 0, s = 0;
        while (s <= n) {
            k++;
            s = s + k;
        }
        if (s >= n) {
            s = s - k;
            k--;
            System.out.println("k = " + k);
            System.out.println("summa = " + s);
        } else
            return;

    }

    public static void while13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        int a = scanner.nextInt();
        float s = 0, k = 1;
        while (s <= a) {
            s = (s + (float) 1 / k);
            k++;
        }

        if (s >= a) {
            k--;
            System.out.println("summa = " + s);
            System.out.println("k = " + k);
        } else
            return;


    }

    public static void while14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        int a = scanner.nextInt();
        float s = 0, k = 1;
        while (s <= a) {
            s = (s + (float) 1 / k);
            k++;
        }

        if (s >= a) {
            s = s - (float) 1 / (k - 1);
            k = k - 2;
            System.out.println("summa = " + s);
            System.out.println("k = " + k);
        } else
            return;

    }

    public static void while15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" boshlangich summani kiriting : ");
        float s = scanner.nextFloat();
        System.out.print(" har oy nech foizga oshsin ");
        float p = scanner.nextFloat();
        float summa = 0, n = 0, k = 0;
        do {
            summa = (summa + s) * (float) p / 100;
            k = k + summa;
            n++;
        }
        while (k < 2 * s);
        System.out.println(n + " = oyda ");
        System.out.print("summa = " + k);
    }

    public static void while16() {
        Scanner scanner = new Scanner(System.in);
        float s = 10, k = 1;
        System.out.print(" nech foizga oshsin = ");
        float p = (float) scanner.nextDouble();
        do {
            System.out.println(k + " - kun = " + s);
            s = s + s * p / 100;
            k++;

        }
        while (s < 200);
        System.out.println(k + " -kun " + s + " km yuguradi ");

    }

    public static void while17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        System.out.print(" m = ");
        int m = scanner.nextInt();
        int k = 0, d = m;
        while (n > m) {
            k++;
            m = m + d;
        }
        if (m == n) {
            System.out.println(" bo'linma = " + (k + 1) + ";  qoldiq = 0");
        } else
            System.out.println(" bo'linma = " + (k) + " qoldiq = " + (n - (m - d)));

    }

    public static void while18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" sonni kirit = ");
        int n = scanner.nextInt();
        int a, summa = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            summa = summa * 10 + a;
        }
        System.out.print(" teskarisi = " + summa);
    }

    public static void while19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" sonni kirit = ");
        int n = scanner.nextInt();
        int a, k = 0, summa = 0;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            summa = summa + a;
            k++;
        }
        System.out.println(" raqamlar yigindisi = " + summa);
        System.out.println(" raqamlar soni = " + k);

    }

    public static void while20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" sonni kirit = ");
        int n = scanner.nextInt();
        int a, k = 0, summa = 0;
        while (n > 0) {
            a = n % 10;
            k++;
            if (a == 2)
                break;
            n = n / 10;

        }
        System.out.println("o'ngdan " + k + "-dagi son 2 ga teng ");

    }

    public static void while21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" sonni kirit = ");
        int n = scanner.nextInt();
        int a, k = 0, s = 1, summa = 0;
        while (n > 0) {
            a = n % 10;
            k++;
            if (a % 2 == 1) {
                s = a;
                break;
            }
            n = n / 10;

        }
        System.out.println("o'ngdan " + k + "-dagi raqam ya'ni " + s + " toq son ");

    }

    public static void while22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        int k = 1, m = 0;
        while (n >= k) {
            if (n % k == 0) {
                m++;
                k++;
            } else {
                k++;
            }
        }
        if (m == 2)
            System.out.println(n + " soni tub son ");
        else
            System.out.println(n + " soni tub son emas  son ");

    }

    public static void while23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        int a = scanner.nextInt();
        System.out.print(" b = ");
        int b = scanner.nextInt();
        while (a != b) {
            if (a > b) a = a % b;
            else b = b % a;
            if (a == 0) {
                a = b;
            } else if (b == 0) {
                b = a;
            }
        }
        System.out.println(" EKUB = " + a);
    }

    public static void while24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        int f1 = 1, f2 = 1, F = 0;
        System.out.print(" F = ");
        while (n > f2) {
            F = f1 + f2;
            System.out.print(F + " ");
            f1 = f2;
            f2 = F;
            F = 0;
        }
        System.out.println();
        if (n == f2) {
            System.out.println(n + " Fibonachchi son ");
        } else
            System.out.println(n + " Fibonachchi son emas ");
    }

    public static void while25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        int f1 = 1, f2 = 1, F = 0;
        System.out.print(" F = ");
        while (n > f2) {
            F = f1 + f2;
            System.out.print(F + " ");
            f1 = f2;
            f2 = F;
            F = 0;
        }
        System.out.println();
        if (n == f2) {
            System.out.println(n + " Fibonachchi son ");
        } else
            System.out.println(n + " sondan keyingi 1-fibonachchi son = " + f2);
    }

    public static void while26() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        int f1 = 1, f2 = 1, F = 0;
        System.out.print(" F = ");
        while (n > f2) {
            F = f1 + f2;
            System.out.print(F + " ");
            f1 = f2;
            f2 = F;
            F = 0;
        }
        System.out.println();
        if (n == f2) {
            System.out.println(n + " Fibonachchi son ");
        } else
            System.out.println(n + " sondan oldingi 1-fibonachchi son = " + f1);
        System.out.println(n + " sondan keyingi 1-fibonachchi son = " + f2);
    }

    public static void while27() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        int f1 = 1, f2 = 1, F = 0, k = 1;
        System.out.print(" F = 1 ");
        while (n > f2) {
            F = f1 + f2;
            System.out.print(F + " ");
            f1 = f2;
            f2 = F;
            F = 0;
            k++;
        }
        System.out.println();
        if (n == f2) {
            System.out.println(n + " Fibonachchi sonning " + k + "- hadi");
        } else
            System.out.println(n + " soni Fibonachchi son emas ");
    }

    public static void while29() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" e = ");
        float e = scanner.nextFloat();
        float a1 = 2, a2 = 2, k = 0, s = 0, a;
        do {
            if (s < e) {
                a = (a1 + 2 * a2) / 3;
                a1 = a2;
                a2 = a;
                a = 0;
                k++;
                s = abs(a2 - a1);
            }
        }
        while (true);

        //  System.out.println(" k = " + k);
        //System.out.println("a[" + k + "]= " + a2);
        //System.out.println("a[" + (k - 1) + "]= " + a1);

    }

    public static void while30() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" A = ");
        int a = scanner.nextInt();
        System.out.print(" B  = ");
        int b = scanner.nextInt();
        System.out.print(" C = ");
        int c = scanner.nextInt();
        int k = 0, s = a * b;
        do {
            s = s - c * c;
            k++;
        }
        while (s > 0);

        if (s == 0) {
            System.out.println(a + "X" + b + " To'rtbutchakka " + k + " ta maksimal kvadrat sig'adi ");
        } else {
            System.out.println(a + "X" + b + " To'rtbutchakka " + (k - 1) + " ta kvadrat sig'adi va " + ((a * b) - (k - 1) * c * c + " joy ortib qoladi "));
        }
    }


}
