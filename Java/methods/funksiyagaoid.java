import java.util.Scanner;

import static java.lang.Math.*;
//import static jdk.internal.foreign.abi.s390.S390Architecture.Regs.f1;

public class funksiyagaoid {

    //FunSimple36
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }


    static double PowerA3(int k) {
        double m = pow(k, 3);
        return m;

    }

    static void PowerA234(int k) {
        double m = 0d;
        for (int i = 2; i <= 4; i++) {
            m = pow(k, i);
            System.out.println(m);
        }
    }

    static void DigitCountSum(int a, int b, int c) {
        int m = 0, summa = 0;
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                a = b;
                m = 0;
                summa = 0;
            } else if (i == 2) {
                a = c;
                m = 0;
                summa = 0;
            }
            while (a > 0) {
                m = a % 10;
                summa = 10 * summa + m;
                a = a / 10;
            }

            System.out.println(" teskarisi = " + summa);

        }

    }

    static void MEAN(int a, int b, int c, int d) {
        double m = 0, q = 1;
        m = (double) (a + b) / 2;
        System.out.println("A+B o'rta arifmetik = " + m);
        m = (double) (a + c) / 2;
        System.out.println("A+C o'rta arifmetik = " + m);
        m = (double) (a + d) / 2;
        System.out.println("A+D o'rta arifmetik = " + m);

        m = sqrt(a * b);
        System.out.println("A+B o'rta geometik = " + m);
        m = sqrt(a * c);
        System.out.println("A+B o'rta geometik = " + m);
        m = sqrt(a * d);
        System.out.println("A+B o'rta geometik = " + m);

    }

    static void Triangle(int a) {
        double p = 0, s = 1;
        p = 3 * a;
        s = a * sqrt(3) / 2;
        System.out.println(" peremetr = " + p);
        System.out.println(" yuza = " + s);

    }

    static void InvertDigit(int a) {
        int m, summa = 0, j = 0;
        while (a > 0) {
            m = a % 10;
            j++;
            a = a / 10;
            summa = summa + m;
        }
        System.out.println(" raqamlar yigindisi = " + summa);
        System.out.println(" raqamlar soni = " + j);

    }

    static void AddRightDigit(int x, int y) {

        System.out.println(x * 10 + y);

    }

    static void AddLeftDigit(int a, int r) {
        double n = 0, m = 1, result = 0, son = a;
        while (a > 0) {
            m = a % 10;
            n++;
            a = a / 10;
        }
        result = r * pow(10, n) + son;

        System.out.println(" result = " + (int) result);
    }

    static void Sortlnc3(int a, int b, int c) {
        int min = a, average;
        if (a < b && a < c && b < c) {
            System.out.println(a + " " + " " + b + " " + c);
        } else if (b < a && b < c && a < c) {
            int k = a;
            a = b;
            b = k;
            System.out.println(a + " " + " " + b + " " + c);
        } else if (c < a && c < b && a < b) {
            int h = a;
            a = c;
            c = b;
            b = h;
            System.out.println(a + " " + " " + b + " " + c);
        }
    }

    static void ShiftRight(int a, int b, int c) {
        int k = a;
        a = c;
        c = b;
        b = k;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);

    }

    static void KvadratTenglama(int a, int b, int c) {
        double D = sqrt(b * b - 4 * a * c);

        double x1 = (-b - D) / (2 * a);
        double x2 = (-b + D) / (2 * a);

        if (D > 0) {
            System.out.println("\n kvadrat tenglama ildizlari ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (D == 0) {
            System.out.println(" kvadrat tenglama ildizi = " + x1);
        } else
            System.out.println(" kvadrat tenglama yechimga ega emas ");

    }

    public static int SumRange(int x, int y) {
        int k = 0;
        if (x > y)
            return 0;
        else {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
                k = k + i;
            }
            return k;
        }


    }

    public static void Calc(int x, int y, int z) {

        switch (z) {
            case 1:
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case 2:
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case 3:
                System.out.println(x + " : " + y + " = " + (double) (x / y));
                break;
            case 4:
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            default:
                System.out.println(" nima qilyapsan mazgi ");
        }


    }

    public static void Quarter(int x, int y) {

        if (x > 0 && y > 0)
            System.out.println(" 1- chorak");
        else if (x < 0 && y > 0)
            System.out.println(" 2- chorak");
        else if (x < 0 && y < 0)
            System.out.println(" 3- chorak");
        else if (x > 0 && y < 0)
            System.out.println(" 4- chorak");
        else
            System.out.println("kordinata boshi ");

    }

    public static boolean Even(int x) {

        if (x % 2 == 0)
            return true;
        else
            return false;


    }

    static void DigitCount(int a) {
        int m = 0, k = 0;
        while (a > 0) {
            m = a % 10;
            k++;
            a = a / 10;
        }

        System.out.println(" raqamlar soni = " + k);


    }

    static boolean ISNUmberN(float a) {
        while (a > 1) {
            a = a / 5;
        }
        if (a == 1) {
            return true;
        }
        return false;

    }

    public static double DegToRoad(double grad) {

        double change = 1;
        change = grad * PI / 180;

        return change;

    }

    public static int Fact(int g) {
        int summa = 1;

        for (int i = 0; i < g; i++) {
            summa = summa * (i + 1);
        }
        return summa;

    }

    public static int Fact2(int g) {
        int summa = 1;
        if (g > 0) {
            while (g > 0) {
                summa = summa * g;
                g = g - 2;

            }
        }

        return summa;

    }

    public static int Fib(int g) {
        // 0,1,1,2,3,5,8,13,21,34,55,89,144........
        int summa = 0, f1 = 1, f2 = 1;
        while (g > 2) {
            summa = f1 + f2;
            f1 = f2;
            f2 = summa;
            g--;
        }

        return summa;

    }


}

