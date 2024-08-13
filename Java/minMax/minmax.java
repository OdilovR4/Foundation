import java.util.Scanner;

import static java.lang.Math.abs;

public class minmax {
    public static void main(String[] args) {
        //minmax1();minmax2();minmax3();minmax4();minmax5(); minmax7(); minmax8(); minmax9();minmax12();minmax13();
        // minmax14();minmax15();minmax16();minmax17();minmax18();minmax19();minmax20();minmax21();minmax22();
        // minmax23();minmax24();
    }

    public static void minmax1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print(" n1 = ");
        int n1 = scanner.nextInt();
        int max = n1, min = n1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (max < n2) {
                max = n2;
            } else if (min > n2) {
                min = n2;
            }
        }

        System.out.println(" max = " + max);
        System.out.println(" min = " + min);
    }

    public static void minmax2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta (a,b) tortburchak tomonini kiritng ");
        System.out.print(" a1 = ");
        int a1 = scanner.nextInt();
        System.out.print("b1 = ");
        int b1 = scanner.nextInt();
        int min = a1 * b1;
        for (int i = 2; i <= n; i++) {
            System.out.print("a" + (i) + " = ");
            int a2 = scanner.nextInt();
            System.out.print("b" + (i) + " = ");
            int b2 = scanner.nextInt();
            int s = a2 * b2;
            if (min > s)
                min = s;

        }
        System.out.println(" eng kichik to'rtburchak yuzasi = " + min);
    }

    public static void minmax3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta (a,b) tortburchak tomonini kiritng ");
        System.out.print(" a1 = ");
        int a1 = scanner.nextInt();
        System.out.print(" b1 = ");
        int b1 = scanner.nextInt();
        int p = 0, k = 1, j = 1, max = 2 * (a1 + b1);

        for (int i = 2; i <= n; i++) {
            System.out.print("a" + i + " = ");
            int a2 = scanner.nextInt();
            System.out.print("b" + i + " = ");
            int b2 = scanner.nextInt();
            p = 2 * (a2 + b2);
            if (max < p) {
                max = p;
                k = a2;
                j = b2;
            }
        }
        System.out.println(" eng katta to'rtburchak peremeteri  = " + max);
        System.out.println(" tomonlari : " + k + " va " + j);

    }

    public static void minmax4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiritng ");
        System.out.print(" a1 = ");
        int a1 = scanner.nextInt();
        int k = 1, min = a1;

        for (int i = 2; i <= n; i++) {
            System.out.print("a" + i + " = ");
            int a2 = scanner.nextInt();
            if (min > a2) {
                min = a2;
                k = i;
            }


        }

        System.out.println(" To'plamdagi eng kichik son = " + min);
        System.out.println(" eng kichik element o'rni = " + k);


    }

    public static void minmax5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta (m-massa, v-hajm) sonlar juftligini kiritng ");
        System.out.print(" m1 = ");
        int m1 = scanner.nextInt();
        System.out.print(" v1 = ");
        int v1 = scanner.nextInt();
        float max = (float) m1 / v1, Ro = 1;
        for (int i = 2; i <= n; i++) {
            System.out.print(" m" + i + " = ");
            int m2 = scanner.nextInt();
            System.out.print("v" + i + " = ");
            int v2 = scanner.nextInt();
            Ro = (float) m2 / v2;
            if (max < Ro)
                max = Ro;
        }
        System.out.println(" eng katta zichlik = " + max);

    }

    public static void minmax6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print(" n1 = ");
        int n1 = scanner.nextInt();
        int min, max, first = 1, last = 1;
        min = n1;
        max = n1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + "= ");
            int n2 = scanner.nextInt();

            if (min > n2) {
                min = n2;
                first = i;

            } else if (max <= n2) {
                max = n2;
                last = i;
            }
        }
        System.out.println(min + " birinchi uchragan kichkina indeksi = " + first);
        System.out.println(max + " oxirgi uchragan kattasi indeksi = " + last);

    }

    public static void minmax7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print(" n1 = ");
        int n1 = scanner.nextInt();
        int min, max, first = 1, last = 1;
        min = n1;
        max = n1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + "= ");
            int n2 = scanner.nextInt();

            if (min >= n2) {
                min = n2;
                first = i;

            } else if (max < n2) {
                max = n2;
                last = i;
            }
        }
        System.out.println(max + " birinchi uchragan kottasi indeksi = " + last);
        System.out.println(min + " oxirgi uchragan kichkina indeksi = " + first);

    }

    public static void minmax8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int min, first = 1, last = 1;
        min = n1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (min > n2) {
                min = n2;
                first = i;
            } else if (min == n2) {
                last = i;
            }


        }
        System.out.println(" 1 - minindeksi = " + first);
        System.out.println(" oxirgi minindeksi = " + last);
    }

    public static void minmax9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int max, first = 1, last = 1;
        max = n1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (max < n2) {
                max = n2;
                first = i;
            } else if (max == n2) {
                last = i;
            }


        }
        System.out.println(" 1 - max indeksi = " + first);
        System.out.println(" oxirgi max indeksi = " + last);
    }

    public static void minmax12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int min = n1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (min > n2 && n2 > 0)
                min = n2;

        }
        System.out.println(" musbat min = " + min);
    }

    public static void minmax13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int max = 0, k = -1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (n2 % 2 == 1 && max < n2) {
                max = n2;
                k = i;
            }
        }
        System.out.println(" max toq son = " + max);
        System.out.println(" birinchi katta toq element indeksi = " + k);
    }

    public static void minmax14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("B = ");
        int b = scanner.nextInt();

        int min = 0, k = 0;
        boolean found = false;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num > b) {
                if (!found || num < min) {
                    min = num;
                    found = true;
                    k = i;
                }
            }
        }

        if (found) {
            System.out.println("min : " + min);
            System.out.println(" min indeksi = " + k);

        } else {
            System.out.println(b + " dan kotta son yo'q ");
        }
    }

    public static void minmax15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("B = ");
        int b = scanner.nextInt();
        System.out.print(" C = ");
        int c = scanner.nextInt();
        int max = 0, k = 0;
        boolean found = false;

        if (b < c) {
            System.out.println("10 ta son kiriting ");
            for (int i = 1; i <= 10; i++) {
                System.out.print(" j = ");
                int j = scanner.nextInt();
                if (j > b && j < c) {
                    if (max < j) {
                        max = j;
                        found = true;
                        k = i;
                    }
                }
            }
        } else System.out.println(" qaytadan kirit B<C bo'lsin ");

        if (found) {
            System.out.println(b + " dan " + c + " oraliqda eng katta son " + max + " \n indeksi = " + k);
        } else System.out.println(" 00 ");


    }

    public static void minmax16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int min = n1, k = 3;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (min > n2) {
                min = n2;
                k = i;
            }

        }
        System.out.println(" min = " + min);
        System.out.println(" mindan oldingi elementlar soni = " + (k - 1));

    }

    public static void minmax17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int max = n1, k = 3;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (max <= n2) {
                max = n2;
                k = i;
            }

        }
        System.out.println(" max = " + max);
        System.out.println("oxirgi maxdan keyingi elementlar soni = " + (n - k));
    }

    public static void minmax18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int max = n1, max1 = n1, k = 0, j = 0;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (max < n2) {
                max = n2;
                k = i;
            }
            if (max1 <= n2) {
                max1 = n2;
                j = i;
            }
        }
        if (j != k) {
            System.out.println(" eng kichik max o'rni = " + k);
            System.out.println("eng katta max o'rni = " + j);
            System.out.println(" kichik va katta max orasidagi element soni = " + (j - k));
        } else
            System.out.println(" to'plamda bitta max element bor ikkita emas shuning uchun 0 ");
    }

    public static void minmax19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting ");
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        int min = n1, k = 1;
        for (int i = 2; i <= n; i++) {
            System.out.print("n" + i + " = ");
            int n2 = scanner.nextInt();
            if (min >= n2) {
                if (min == n2) {
                    k++;
                }
                min = n2;
            }
        }
        System.out.println(" min = " + min);
        System.out.println(" min elementlar soni =" + k);
    }

    public static void minmax20() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCount = 0;
        int minCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("n" + (i + 1) + " = ");
            int num = scanner.nextInt();

            if (num > max) {
                max = num;
                maxCount = 1;
            } else if (num == max) {
                maxCount++;
            }

            if (num < min) {
                min = num;
                minCount = 1;
            } else if (num == min) {
                minCount++;
            }
        }

        System.out.println("Ekstrumum nuqtalar:");
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Max elementlar soni = " + maxCount);
        System.out.println("Min elementlar soni = " + minCount);
    }

    public static void minmax21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.println(n + " ta son kiriting");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCount = 0;
        int minCount = 0;
        int summa = 0;
        float average;

        for (int i = 0; i < n; i++) {
            System.out.print("n" + (i + 1) + " = ");
            int num = scanner.nextInt();
            summa = summa + num;
            if (min > num) {
                min = num;
                minCount = 1;
            } else if (min == num)
                minCount++;
            if (max < num) {
                max = num;
                maxCount = 1;
            } else if (max == num)
                maxCount++;

        }

        average = (float) (summa - minCount * min - maxCount * max) / (n - minCount - maxCount);

        System.out.println(" To'plam o'rtacha qiymati = " + average);
        System.out.println(" minimum va maximum elementlar hisobga olinmadi ");
    }

    public static void minmax22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int N = scanner.nextInt();
        System.out.println(N + " ta son kiriting");
        System.out.print("n1  = ");
        int min = scanner.nextInt();
        int k = min;
        for (int i = 2; i <= N; i++) {
            System.out.print("n" + i + " = ");
            int n = scanner.nextInt();
            if (min > n || i == 2) {
                k = min;
                min = n;
            } else if (k > n) {
                k = n;
            }
        }
        System.out.println(" 2 ta minimum element = " + k + " " + min);
    }

    public static void minmax23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int N = scanner.nextInt();
        System.out.println(N + " ta son kiriting");
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {
            System.out.print("n" + i + " = ");
            int n = scanner.nextInt();
            if (max1 < n) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 < n) {
                max3 = max2;
                max2 = n;

            } else if (max3 < n) {
                max3 = n;
            }
        }
        System.out.println(" oxirgi 3 ta max son = " + max1 + " " + max2 + " " + max3);
    }

    public static void minmax24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int N = scanner.nextInt();
        System.out.println(N + " ta son kiriting");
        int s1 = 0, max = 0, s2 = 0, k;
        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();
        k = n2;
        s1 = n1 + n2;
        for (int i = 3; i <= N; i++) {

            System.out.print("n" + i + " = ");
            int n3 = scanner.nextInt();
            s2 = k + n3;
            if (s2 > s1) {
                n1 = k;
                k = n3;
                s1 = s2;
                max = s2;
            } else if (s2 < s1) {
                n1 = k;
                k = n1;
                max = s1;
            }

        }
        System.out.println(" qo'shni max = " + max);
    }


}
