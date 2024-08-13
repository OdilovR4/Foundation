import java.util.Scanner;
import java.util.SortedMap;

import static java.lang.Math.sin;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.scalb;

 public class forsikl {
    public static void main(String[] args) {
//    for1();for2();for3();for4();for5();for6();for7();for8();for9();for10();for11();for12();for13();for14();for15();
//    for16();for17();for18();for19();for20();for21();for22();for23();for24();for25();for26();for27();for28();for29();
//    for30();for31();for32(); for33(); for34();for35();for36(); for37();for38();for39(); for40();
    }

     public static void for1() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" k = ");
         int k = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 0; i < n; i++) {
             System.out.println(k);
         }

     }

     public static void for2() {
         Scanner scanner = new Scanner(System.in);
         int k = 0;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" b = ");
         int b = scanner.nextInt();
         for (int i = a; i <= b; i++) {
             System.out.print(i + " ");
             k++;
         }
         System.out.println("\n k = " + k);
     }

     public static void for3() {
         Scanner scanner = new Scanner(System.in);
         int k = 0;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" b = ");
         int b = scanner.nextInt();
         for (int i = b - 1; i > a; i--) {
             System.out.print(i + " ");
             k++;
         }
         System.out.println("\n k = " + k);
     }

     public static void for4() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" 1 kg konfet narxini kiriting ");
         int n = scanner.nextInt();
         for (int i = 1; i <= 10; i++) {
             System.out.println(i + " konfet narxi = " + (i * n));
         }
     }

     public static void for5() {
         float temp;
         Scanner scanner = new Scanner(System.in);
         System.out.print(" 1 kg konfet narxi  = ");
         int n = scanner.nextInt();
         for (int i = 1; i <= 10; i++) {
             temp = (float) i / 10;
             System.out.println("price = " + temp * n);
         }
     }

     public static void for6() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" 1kg konfet narxi  = ");
         float n = scanner.nextFloat();
         for (float i = 1.2f; i <= 2.1; i += 0.2F) {
             System.out.println(i + " kg konfet narxi = " + (i * n));
         }

     }

     public static void for7() {
         Scanner scanner = new Scanner(System.in);
         int s = 0;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" b = ");
         int b = scanner.nextInt();
         for (int i = a; i <= b; i++) {
             s = s + i;
         }
         System.out.println(" s = " + s);
     }

     public static void for8() {
         Scanner scanner = new Scanner(System.in);
         int s = 1;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" b = ");
         int b = scanner.nextInt();
         for (int i = a; i <= b; i++) {
             s = s * i;
         }
         System.out.println(" s = " + s);
     }

     public static void for9() {
         Scanner scanner = new Scanner(System.in);
         int s = 0;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" b = ");
         int b = scanner.nextInt();
         for (int i = a; i <= b; i++) {
             s += i * i;
             System.out.println(i * i + " ");
         }
         System.out.println(" s = " + s);
     }

     public static void for10() {
         Scanner scanner = new Scanner(System.in);
         double s = 0d;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (float i = 1f; i <= n; i++) {
             s = s + (1 / i);
         }
         System.out.println(" s = " + s);
     }

     public static void for11() {
         Scanner scanner = new Scanner(System.in);
         float s = 0F;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = n; i <= 2 * n; i++) {
             s = s + i * i;
             System.out.println("i = " + i * i);
         }
         System.out.println("s = " + s);
     }

     public static void for12() {
         Scanner scanner = new Scanner(System.in);
         float temp;
         float s = 1;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i++) {
             temp = (float) i / 10 + 1;
             System.out.println("temp = " + temp);
             s = s * temp;
         }
         System.out.println("s = " + s);
     }

     public static void for13() {
         Scanner scanner = new Scanner(System.in);
         float s1 = 0f, s2 = 0f, temp1, temp2, summa = 0f;

         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i = i + 2) {
             temp1 = (float) i / 10 + 1;

             s1 = s1 + temp1;

         }
         for (int i = 2; i <= n; i = i + 2) {
             temp2 = (float) i / 10 + 1;

             s2 = s2 + temp2;
         }
         summa = s1 - s2;

         System.out.println(" summa = " + (summa));
     }

     public static void for14() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" n = ");
         int n = scanner.nextInt();
         int summa = 0;
         System.out.print(" n^2 = ");
         for (int i = 1; i <= 2 * n - 1; i = i + 2) {
             System.out.print(i + "+");
             summa = summa + i;

         }
         System.out.println();
         System.out.println(n + " ning kvadrati = " + summa);
     }

     public static void for15() {
         Scanner scanner = new Scanner(System.in);
         int s = 1;
         System.out.print(" a  = ");
         int a = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i++) {
             s = s * a;
         }
         System.out.println(a + "^" + n + "= " + s);

     }

     public static void for16() {
         Scanner scanner = new Scanner(System.in);
         int s = 1;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i++) {
             s = s * a;
             System.out.println(a + "^" + i + " = " + s);
         }
     }

     public static void for17() {
         Scanner scanner = new Scanner(System.in);
         int s = 1;
         double summa = 0;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 0; i <= n; i++) {
             summa = summa + pow(a, i);
             System.out.println(a + "^" + i + " = " + pow(a, i));
         }
         System.out.println("summa = " + summa);
     }

     public static void for18() {
         Scanner scanner = new Scanner(System.in);
         int s = 0;
         System.out.print(" a = ");
         int a = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 0; i < n; i++) {
             s = (int) (s + pow((-1), i) * pow(a, i));

         }
         System.out.println("summa = " + s);
     }

     public static void for19() {
         Scanner scanner = new Scanner(System.in);
         int s = 1;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i++) {
             s *= i;
         }
         System.out.println(n + "!=" + s);
     }

     public static void for20() {
         Scanner scanner = new Scanner(System.in);
         int summa = 0, s = 1;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i++) {
             s *= i;
             System.out.println(i + "!= " + s);
             summa = summa + s;
         }
         System.out.println(" summa = " + summa);
     }

     public static void for21() {
         Scanner scanner = new Scanner(System.in);
         int s = 1;
         double summa = 1;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 1; i < n; i++) {
             s *= i;
             summa = summa + (double) 1 / s;
         }
         System.out.println("summa = " + summa);
     }

     public static void for22() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" x = ");
         int x = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double summa = 1, s = 1;

         for (int i = 1; i <= n; i++) {
             s *= i;
             summa = summa + pow(x, i) / s;
         }
         System.out.println("summa = " + summa);

     }

     public static void for23() {

         Scanner scanner = new Scanner(System.in);
         double summa = 0, s = 1, f = 1;
         System.out.print(" x = ");
         int x = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         for (int i = 0; i <= n; i++) {

             s = (2 * i + 1);
             for (int j = 1; j <= s; j++) {
                 f *= (j);
             }
             summa = summa + pow(-1, i) * pow(x, (2 * i + 1)) / f;
             f = 1;
         }
         System.out.println("summa = " + summa);

     }

     public static void for24() {

         Scanner scanner = new Scanner(System.in);
         System.out.print(" x = ");
         int x = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         int s = 1;
         float summa = 0;
         int f = 1;
         for (int i = 0; i <= n; i++) {
             s = 2 * i;
             for (int j = 1; j <= s; j++) {
                 f *= j;
             }
             summa = (float) (summa + pow((-1), i) * pow(x, (2 * i)) / f);
             f = 1;
         }
         System.out.println("summa = " + summa);
     }

     public static void for25() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" x = ");
         int x = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double summa = 0;
         for (int i = 1; i <= n; i++) {
             summa = summa + pow((-1), i - 1) * pow(x, i) / i;
         }

         System.out.println("summa = " + summa);
     }

     public static void for26() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" x = ");
         int x = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double summa = 0;
         for (int i = 0; i <= n; i++) {
             summa = summa + pow((-1), i) * pow(x, 2 * i + 1) / (2 * i + 1);
         }

         System.out.println("summa = " + summa);
     }

     public static void for27() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" x = ");
         int x = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double summa;
         summa = x;
         int s = 1, s1 = 1;

         for (int i = 1; i <= n; i++) {

             for (int j = 1; j <= i; j++) {
                 s = s * (2 * j * (2 * j + 1));
                 s1 = s1 * (2 * j - 1);

             }
             summa = summa + (s1 * s1 * pow(x, 2 * i + 1)) / s;
             s = 1;
             s1 = 1;
         }

         System.out.println("summa = " + summa);
     }

     public static void for28() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" x = ");
         int x = scanner.nextInt();
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double summa;
         summa = 1 + x / 2;
         int s = 1, s1 = 1;
         if (n >= 2) {
             for (int i = 2; i <= n; i++) {
                 s = s * (2 * i - 3);
                 for (int j = 1; j <= i; j++) {
                     s1 = s1 * 2 * j;
                 }
                 summa = summa + (pow(-1, i - 1) * s * pow(x, i)) / (s1);
                 s1 = 1;
             }

             System.out.println("summa = " + summa);
         } else if (n == 1) {
             System.out.println(" summa " + summa);
         } else
             System.out.println(" N>0 kirit ");

     }

     public static void for29() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" A = ");
         float a = scanner.nextFloat();
         System.out.print(" B = ");
         float b = scanner.nextFloat();
         System.out.print(" A : B kesmani nechchi bo'lakka bo'lasiz : ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i++) {
             float k = (a + ((b - a) / n) * i);
             System.out.println(i + " - nuqta = " + k);
         }

     }

     public static void for30() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" A = ");
         float a = scanner.nextFloat();
         System.out.print(" B = ");
         float b = scanner.nextFloat();
         System.out.print(" A : B kesmani nechchi bo'lakka bo'lasiz : ");
         int n = scanner.nextInt();
         for (int i = 1; i <= n; i++) {
             float k = (a + ((b - a) / n) * i);
             double F = 1 - sin(k * 3.141592653589 / 180);
             System.out.println(" sin(" + k + ") = " + F);
         }

     }

     public static void for31() {
         Scanner scanner = new Scanner(System.in);
         double s = 0;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double A = 2;
         for (int i = 1; i <= n; i++) {
             s = s + A;
             A = 2 + 1 / s;
             s = 0;
             System.out.println(" A" + i + "  = " + A);
         }
     }

     public static void for32() {
         Scanner scanner = new Scanner(System.in);
         double s = 0;
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double A = 1;
         for (int i = 1; i <= n; i++) {
             s = s + A;
             A = (s + 1) / i;
             s = 0;
             System.out.println(" A" + i + "  = " + A);
         }
     }

     public static void for33() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double f1 = 1, f2 = 1, F = 0;
         for (int i = 3; i <= n; i++) {
             F = f1 + f2;
             System.out.println("F" + i + "= " + F);
             f1 = f2;
             f2 = F;
             F = 0;
         }

     }

     public static void for34() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" n = ");
         int n = scanner.nextInt();
         double a1 = 1, a2 = 2, a = 1;
         for (int i = 2; i <= n; i++) {
             a = (a1 + 2 * a2) / 3;
             System.out.println("a" + i + " = " + a);
             a1 = a2;
             a2 = a;
             a = 0;

         }
     }

     public static void for35() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" k = ");
         int n = scanner.nextInt();
         double a, a1 = 1, a2 = 2, a3 = 3;
         for (int i = 3; i <= n; i++) {
             a = a3 + a2 - 2 * a1;
             System.out.println("A" + i + " = " + a);
             a1 = a2;
             a2 = a3;
             a3 = a;
             a = 0;
         }

     }

     public static void for36() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" n = ");
         int n = scanner.nextInt();
         System.out.print(" k = ");
         int k = scanner.nextInt();
         int summa = 0, s = 1;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= k; j++) {
                 s = s * i;
             }
             System.out.println(i + "^" + k + " = " + s);
             summa = summa + s;
             s = 1;
         }
         System.out.println("summa = " + summa);
     }

     public static void for37() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" n = ");
         int n = scanner.nextInt();
         int summa = 0, s = 1;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
                 s = s * i;
             }
             System.out.println(i + "^" + i + " = " + s);
             summa = summa + s;
             s = 1;
         }
         System.out.println("summa = " + summa);

     }

     public static void for38() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" n = ");
         int n = scanner.nextInt();
         int summa = 0, s = 1, k = 0;
         for (int i = 1; i <= n; i++) {
             s = 1;
             for (int j = n; j >= i; j--) {
                 s *= i;
             }
             summa = summa + s;
             System.out.println(i + "^" + (n - k) + " = " + s);
             k++;
         }
         System.out.println("summa = " + summa);

     }

     public static void for39() {

         Scanner scanner = new Scanner(System.in);
         System.out.print(" A = ");
         int a = scanner.nextInt();
         System.out.print(" B = ");
         int b = scanner.nextInt();
         for (int i = a; i <= b; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(i + " ");
             }
             System.out.println();
         }


     }

     public static void for40() {
         Scanner scanner = new Scanner(System.in);
         System.out.print(" A = ");
         int a = scanner.nextInt();
         System.out.print(" B = ");
         int b = scanner.nextInt();
         int k = 1;
         for (int i = a; i <= b; i++) {
             for (int j = i; j < i + k; j++) {
                 System.out.print(i + " ");
             }
             System.out.println();
             k++;


         }

     }


 }
