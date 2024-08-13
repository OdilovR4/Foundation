import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class switchcase {
    public static void main(String[] args) {
        //example1(); case2(); case3(); case4(); case5(); case6(); case7(); case8(); case9(); case10(); case11();
        //case12(); case14();  case16(); case17();  case18();

    }
    public static void example1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println(" Dushanba ");
                break;
            case 2:
                System.out.println(" Seshanba ");
                break;
            case 3:
                System.out.println(" Chorshanba ");
                break;
            case 4:
                System.out.println(" Payshanba ");
                break;
            case 5:
                System.out.println(" Juma ");
                break;
            case 6:
                System.out.println(" Shanba ");
                break;
            case 7:
                System.out.println(" Yakshanba ");
                break;
            default:
                System.out.println(" bunday hafta kuni yo'q ");
                break;
        }
    }
    public static void case2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Talaba bahosi = ");
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                System.out.println(" yomon ");
                break;
            case 2:
                System.out.println(" qoniqarsiz ");
                break;
            case 3:
                System.out.println(" qoniqarli ");
                break;
            case 4:
                System.out.println(" yaxshi ");
                break;
            case 5:
                System.out.println(" a'lo ");
                break;
            default:
                System.out.println(" xato ");
                break;
        }

    }
    public static void case3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" oy raqamini kiriting ");
        int n = scanner.nextInt();
        switch (n) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Qish ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Bahor ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Yoz ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Kuz ");
                break;
            default:
                System.out.println(" xato ");
                break;
        }

    }
    public static void case4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Oy raqamini kiriting ");
        int n = scanner.nextInt();
        switch (n) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(n + "-oy da 31 kun bor ");
                break;
            case 2:
                System.out.println(n + "-oy da 28 kun bor ");
                break;
            case 4, 6, 9, 11:
                System.out.println(n + "-oy da 30 kun bor ");
                break;
            default:
                System.out.println(" bunday oy mavjud emas ");
        }
    }
    public static void case5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        float a = scanner.nextFloat();
        System.out.print(" b = ");
        float b = scanner.nextFloat();
        System.out.println(" Tugmani tanlang : \n" + "1-qo'shish, 2-ayirish, 3-bo'lish, 4-ko'paytirish ");
        byte n = scanner.nextByte();
        switch (n) {
            case 1:
                System.out.println(" a + b = " + (a + b));
                break;
            case 2:
                System.out.println(" a - b = " + (a - b));
                break;
            case 3:
                System.out.println(" a / b = " + (a / b));
                break;
            case 4:
                System.out.println(" a * b = " + (a * b));
                break;
        }

    }
    public static void case6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" kesma uzunligi L = ");
        float n = scanner.nextFloat();
        System.out.println("Uzunlik birligini tanlang \n " + " 1-dm, 2-km, 3-m, 4-mm, 5-sm ");
        short s = scanner.nextShort();
        switch (s) {
            case 1:
                System.out.println(n + " detsimetr = " + n / 10 + " metr");
                break;
            case 2:
                System.out.println(n + " kilometr = " + n * 1000 + " metr");
                break;
            case 3:
                System.out.println(n + " metr = " + n + " metr");
                break;
            case 4:
                System.out.println(n + " millimetr = " + n / 1000 + " metr");
                break;
            case 5:
                System.out.println(n + " santimetr = " + n / 100 + " metr");
                break;
        }

    }
    public static void case7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Massa = ");
        float n = scanner.nextFloat();
        System.out.println("Massa birligini tanlang \n " + " 1-kg, 2-mg, 3-g, 4-t, 5-sentner");
        short s = scanner.nextShort();
        switch (s) {
            case 1:
                System.out.println(n + " kg = " + n + " kg ");
                break;
            case 2:
                System.out.println(n + " mg = " + n / 1e6 + " kg");
                break;
            case 3:
                System.out.println(n + " g = " + n / 1e3 + " kg ");
                break;
            case 4:
                System.out.println(n + " t = " + n * 100 + " kg ");
                break;
            case 5:
                System.out.println(n + " s = " + n * 1000 + " kg ");
                break;
        }

    }
    public static void case8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Kunni kiriting => ");
        int d = scanner.nextInt();
        System.out.print(" Oyni kiriting => ");
        int m = scanner.nextInt();
        if (m > 0 && m < 13) {
            switch (m) {
                case 1:
                    if (d < 32) {
                        System.out.println(d + "- yanvar");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 2:
                    if (d < 29) {
                        System.out.println(d + "- fevral");
                    } else System.out.println(" ushbu oyda 28 kun mavjud " + d + " kun emas");
                    break;
                case 3:
                    if (d < 32) {
                        System.out.println(d + "- mart");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 4:
                    if (d < 31) {
                        System.out.println(d + "- aprel");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 5:
                    if (d < 32) {
                        System.out.println(d + "- may");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 6:
                    if (d < 31) {
                        System.out.println(d + "- iyun");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 7:
                    if (d < 32) {
                        System.out.println(d + "- iyul");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 8:
                    if (d < 32) {
                        System.out.println(d + "- avgust");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 9:
                    if (d < 31) {
                        System.out.println(d + "- sentabr");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 10:
                    if (d < 32) {
                        System.out.println(d + "- oktabr");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 11:
                    if (d < 31) {
                        System.out.println(d + "- noyabr");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 12:
                    if (d < 32) {
                        System.out.println(d + "- dekabr");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
            }
        }

    }
    public static void case9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Kunni kiriting => ");
        int d = scanner.nextInt();
        System.out.print(" Oyni kiriting => ");
        int m = scanner.nextInt();
        if (m > 0 && m < 13) {
            switch (m) {
                case 1:
                    if (d < 32 && d != 31) {
                        System.out.println((d + 1) + "- yanvar");
                    } else if (d == 31) {
                        System.out.println("1-fevral");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 2:
                    if (d < 29 && d != 28) {
                        System.out.println((d + 1) + "- fevral");
                    } else if (d == 28) {
                        System.out.println(" 1- mart");
                    } else System.out.println(" ushbu oyda 28 kun mavjud " + d + " kun emas");
                    break;
                case 3:
                    if (d < 32 && d != 31) {
                        System.out.println((d + 1) + "- mart");
                    } else if (d == 31) {
                        System.out.println("1-aprel");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 4:
                    if (d < 31 && d != 30) {
                        System.out.println((d + 1) + "- aprel");
                    } else if (d == 30) {
                        System.out.println("1-may");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 5:
                    if (d < 32 && d != 31) {
                        System.out.println((d + 1) + "- may");
                    } else if (d == 31) {
                        System.out.println("1-iyun");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 6:
                    if (d < 31 && d != 30) {
                        System.out.println((d + 1) + "- iyun");
                    } else if (d == 30) {
                        System.out.println("1-iyul");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 7:
                    if (d < 32 && d != 31) {
                        System.out.println((d + 1) + "- iyul");
                    } else if (d == 31) {
                        System.out.println("1-avgust");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 8:
                    if (d < 32 && d != 31) {
                        System.out.println((d + 1) + "- avgust");
                    } else if (d == 31) {
                        System.out.println("1-sentabr");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 9:
                    if (d < 31 && d != 30) {
                        System.out.println((d + 1) + "- sentabr");
                    } else if (d == 30) {
                        System.out.println("1-oktabr");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 10:
                    if (d < 32 && d != 31) {
                        System.out.println((d + 1) + "- oktabr");
                    } else if (d == 31) {
                        System.out.println("1-noyabr");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
                case 11:
                    if (d < 31 && d != 30) {
                        System.out.println((d + 1) + "- noyabr");
                    } else if (d == 30) {
                        System.out.println("1-dekabr");
                    } else System.out.println(" ushbu oyda 30 kun mavjud " + d + " kun emas");
                    break;
                case 12:
                    if (d < 32 && d != 31) {
                        System.out.println((d + 1) + "- dekabr");
                    } else if (d == 31) {
                        System.out.println("1-yanvar");
                    } else System.out.println(" ushbu oyda 31 kun mavjud " + d + " kun emas");
                    break;
            }
        }

    }
    public static void case10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("robot yunalish tanlang \n " + "1-shimol,2-janub, 3-sharq, 4-g'arb \n " + " Y = ");
        int y = scanner.nextInt();
        System.out.print(" robotga buyruq bering 0 harakatni davom et, 1-chapga buril, 2-o'ngga buril\n" + " K = ");
        int k = scanner.nextInt();
        switch (y) {
            case 1:
                switch (k) {
                    case 0:
                        System.out.println("shimolga ko'chib harakatni davom ettirdi ");
                        break;
                    case 1:
                        System.out.println("shimolga ko'chib chapga burildi ");
                        break;
                    case 2:
                        System.out.println("shimolga ko'chib o'ngga burildi ");
                        break;
                }
                break;
            case 2:
                switch (k) {
                    case 0:
                        System.out.println("janubga ko'chib harakatni davom ettirdi ");
                        break;
                    case 1:
                        System.out.println("janubga ko'chib chapga burildi ");
                        break;
                    case 2:
                        System.out.println("janubga ko'chib o'ngga burildi ");
                        break;
                }
                break;
            case 3:
                switch (k) {
                    case 0:
                        System.out.println("sharqga ko'chib harakatni davom ettirdi ");
                        break;
                    case 1:
                        System.out.println("sharqga ko'chib chapga burildi ");
                        break;
                    case 2:
                        System.out.println("sharqga ko'chib o'ngga burildi ");
                        break;
                }
                break;
            case 4:
                switch (k) {
                    case 0:
                        System.out.println("g'arbga ko'chib harakatni davom ettirdi ");
                        break;
                    case 1:
                        System.out.println("g'arbga ko'chib chapga burildi ");
                        break;
                    case 2:
                        System.out.println("g'arbga ko'chib o'ngga burildi ");
                        break;
                }
                break;
        }

    }
    public static void case11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lokatr 1-positsiyasini tanlang \n " + "s-shimol,j-janub, q-sharq, g-g'arb \n " + " Y = ");
        String n = scanner.next();
        System.out.print("Lokatr 1- kamandasi :  0 harakatni davom et, 1-chapga buril, 2-orqaga buril\n" + " K = ");
        int k = scanner.nextInt();
        switch (n) {
            case "s":
                switch (k) {
                    case 0:
                        System.out.println(" Dastlab Lokatr shimol da harakatni davom ettiryapti");
                        break;
                    case 1:
                        System.out.println(" Dastlab Lokatr shimol da chapga burildi ");
                        break;
                    case 2:
                        System.out.println(" Dastlab Lokatr shimol da orqaga burildi ");
                        break;

                }
                break;
            case "j":
                switch (k) {
                    case 0:
                        System.out.println(" Dastlab Lokatr janub da harakatni davom ettiryapti");
                        break;
                    case 1:
                        System.out.println(" Dastlab Lokatr janub da chapga burildi ");
                        break;
                    case 2:
                        System.out.println(" Dastlab Lokatr janub da orqaga burildi ");
                        break;


                }
                break;
            case "q":
                switch (k) {
                    case 0:
                        System.out.println(" Dastlab Lokatr sharq da harakatni davom ettiryapti");
                        break;
                    case 1:
                        System.out.println(" Dastlab Lokatr sharq da chapga burildi ");
                        break;
                    case 2:
                        System.out.println(" Dastlab Lokatr sharq da orqaga burildi ");
                        break;
                }
                break;
            case "g":
                switch (k) {
                    case 0:
                        System.out.println(" Dastlab Lokatr g'arb da harakatni davom ettiryapti");
                        break;
                    case 1:
                        System.out.println(" Dastlab g'arb shimol da chapga burildi ");
                        break;
                    case 2:
                        System.out.println(" Dastlab g'arb shimol da orqaga burildi ");
                        break;
                }
                break;
        }

    }
    public static void case12() {
        Scanner scanner = new Scanner(System.in);
        float pi = 3.14f;
        while (true) {
            System.out.print(" Qaysi elementni kiritasiz \n" + " 1-radius, 2-diametr, 3-uzunlik, 4-yuza \n " + " n = ");
            byte b = scanner.nextByte();
            switch (b) {
                case 1:
                    System.out.print(" radiusni kirit : ");
                    double r = scanner.nextDouble();
                    System.out.println(" diametr = " + (2 * r));
                    System.out.println(" uzunlik = " + (2 * pi * r));
                    System.out.println(" yuza = " + (2 * pi * r * r));
                    break;
                case 2:
                    System.out.print(" diametrni kirit : ");
                    double d = scanner.nextDouble();
                    System.out.println(" radius = " + (d / 2));
                    System.out.println(" uzunlik = " + (pi * d));
                    System.out.println(" yuza = " + (pi * d * d / 4));
                    break;
                case 3:
                    System.out.print(" uzunlikni kirit : ");
                    double l = scanner.nextDouble();
                    System.out.println(" diametr = " + (l / pi));
                    System.out.println(" radius = " + (l / (2 * pi)));
                    System.out.println(" yuza = " + ((l * l) / (4 * pi)));
                    break;
                case 4:
                    System.out.print(" yuzani kirit : ");
                    int s = scanner.nextInt();
                    System.out.println(" diametr = " + (2 * sqrt(s / pi)));
                    System.out.println(" uzunlik = " + (2 * pi * sqrt(s / pi)));
                    System.out.println(" radius = " + (sqrt(s / pi)));
                    break;

            }

        }
    }
    public static void case14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Karta turini tanla \n " + "1-g'isht, 2-olma, 3-chillak, 4-qarg'a\n" + " n = ");
        byte n = scanner.nextByte();
        System.out.print("qiymatini kirit \n " + " 6 dan 10 gacha va 11-valet, 12-dama, 13-qirol, 14-tuz \n" + " m = ");
        byte m = scanner.nextByte();

        switch (m) {
            case 6:
                System.out.print(" olti");
                break;
            case 7:
                System.out.print(" yetti");
                break;
            case 8:
                System.out.print(" sakkiz");
                break;
            case 9:
                System.out.print(" to'qqiz");
                break;
            case 10:
                System.out.print(" o'n");
                break;
            case 11:
                System.out.print(" valet");
                break;
            case 12:
                System.out.print(" dama");
                break;
            case 13:
                System.out.print(" qirol");
                break;
            case 14:
                System.out.print(" tuz");
                break;
        }
        switch (n) {
            case 1:
                System.out.println(" g'isht ");
                break;
            case 2:
                System.out.println(" olma ");
                break;
            case 3:
                System.out.println(" chillak ");
                break;
            case 4:
                System.out.println(" qarg'a");
                break;
        }
    }
    public static void case16() {
        int b, q;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" (20-69 orasida )  yoshni kiriting : ");
        byte y = scanner.nextByte();
        if (y > 19 && y < 70) {
            b = y / 10;
            q = y % 10;
            switch (b) {
                case 2:
                    System.out.print(" yigirma");
                    break;
                case 3:
                    System.out.print(" o'ttiz");
                    break;
                case 4:
                    System.out.print(" qirq");
                    break;
                case 5:
                    System.out.print(" ellik");
                    break;
                case 6:
                    System.out.print(" oltmish");
                    break;

            }

            switch (q) {
                case 0:
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.println(" bir");
                    break;
                case 2:
                    System.out.println(" ikki");
                    break;
                case 3:
                    System.out.println(" uch");
                    break;
                case 4:
                    System.out.println(" to'rt");
                    break;
                case 5:
                    System.out.println(" besh");
                    break;
                case 6:
                    System.out.println(" olti");
                    break;
                case 7:
                    System.out.println(" yetti");
                    break;
                case 8:
                    System.out.println(" sakkiz");
                    break;
                case 9:
                    System.out.println(" to'qqiz");
                    break;
            }
        } else {
            System.out.println(" (20:69) intervalda kirit ! ");
        }
        case16();
    }
    public static void case17() {
        Scanner scanner = new Scanner(System.in);
        int b, q;
        System.out.print(" (10-40) sonni kirit -> ");
        byte s = scanner.nextByte();
        if (s >= 10 && s <= 40) {
            b = s / 10;
            q = s % 10;
            switch (b) {
                case 1:
                    System.out.print(" o'n");
                    break;
                case 2:
                    System.out.print(" yigirma");
                    break;
                case 3:
                    System.out.print(" o'ttiz");
                    break;
                case 4:
                    System.out.print(" qirq");
                    break;
            }
            switch (q) {
                case 0:
                    System.out.println(" ta masala");
                    break;
                case 1:
                    System.out.println(" bitta masala");
                    break;
                case 2:
                    System.out.println(" ikkita masala");
                    break;
                case 3:
                    System.out.println(" uchta masala");
                    break;
                case 4:
                    System.out.println(" to'rtta masala");
                    break;
                case 5:
                    System.out.println(" beshta masala");
                    break;
                case 6:
                    System.out.println(" oltita masala");
                    break;
                case 7:
                    System.out.println(" yetita masala");
                    break;
                case 8:
                    System.out.println(" sakkizta masala");
                    break;
                case 9:
                    System.out.println(" to'qqizta masala");
                    break;
            }
        } else {
            System.out.println("10-40 oralig'ida son kirit !");
        }
        case17();
    }
    public static void case18() {
        int y, o, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("(100-999) sonni kirit = ");
        int s = scanner.nextInt();
        if (s >= 100 && s <= 999) {
            y = s / 100;
            o = s % 100 / 10;
            b = s % 100 % 10;
            switch (y) {
                case 1:
                    System.out.print("bir yuz");
                    break;
                case 2:
                    System.out.print("ikki yuz");
                    break;
                case 3:
                    System.out.print("uch yuz");
                    break;
                case 4:
                    System.out.print("to'rt yuz");
                    break;
                case 5:
                    System.out.print("besh yuz");
                    break;
                case 6:
                    System.out.print("olti yuz");
                    break;
                case 7:
                    System.out.print("yetti yuz");
                    break;
                case 8:
                    System.out.print("sakkiz yuz");
                    break;
                case 9:
                    System.out.print("to'qqiz yuz");
                    break;
            }
            switch (o) {
                case 0:
                    System.out.print(" ");
                    break;
                case 1:
                    System.out.print(" o'n");
                    break;
                case 2:
                    System.out.print(" yigirma");
                    break;
                case 3:
                    System.out.print(" o'ttiz");
                    break;
                case 4:
                    System.out.print(" qirq");
                    break;
                case 5:
                    System.out.print(" ellik");
                    break;
                case 6:
                    System.out.print(" oltmish");
                    break;
                case 7:
                    System.out.print(" yetmish");
                    break;
                case 8:
                    System.out.print(" sakson");
                    break;
                case 9:
                    System.out.print(" to'qson");
                    break;
            }
            switch (b) {
                case 0:
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.println(" bir");
                    break;
                case 2:
                    System.out.println(" ikki");
                    break;
                case 3:
                    System.out.println(" uch");
                    break;
                case 4:
                    System.out.println(" to'rt");
                    break;
                case 5:
                    System.out.println(" besh");
                    break;
                case 6:
                    System.out.println(" olti");
                    break;
                case 7:
                    System.out.println(" yetti");
                    break;
                case 8:
                    System.out.println(" sakkiz");
                    break;
                case 9:
                    System.out.println(" to'qqiz");
                    break;
            }

        } else {
            System.out.println("100-999 orasida kirit ");
        }
    }
}