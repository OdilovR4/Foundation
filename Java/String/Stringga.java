import com.sun.jdi.Value;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Stringga {
    public static void main(String[] args) {
        //String1();String2();String3();String4();String5();String6();String7();String8();String9();String10();String11();
        //String12();String13();String14();String15();String16();String17();String18();String19();String20();String21();
        //String22();String23();String24();String25();String26();String27();String28();String29();String30();String31();
        //String32();String33();String34();String35();String36();String37();String38();String39();String40();String41();
        //String42();String43();String44();String45();String46();String47();String48();String49();String50();


    }


    public static void String1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" beligini kiriting va resultni oling = ");
        char belgi = '!';

        while (belgi != 'q') {
            belgi = scanner.next().charAt(0);
            System.out.println((int) belgi);
        }
    }

    public static void String2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" n = ");
        int n = scanner.nextInt();

        System.out.println((char) n);

    }

    public static void String3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        char k = (char) (n + 1);
        char l = (char) (n - 1);

        System.out.println((char) n + " dan oldingi belgi " + l + " keyingisi " + k);

    }

    public static void String4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        if (n >= 1 && n <= 26) {
            for (char i = 'A'; i < ('A' + n); i++) {

                System.out.print(i + " ");

            }
        } else
            System.out.println(" nima qilyapsan mazgi ");

    }

    public static void String5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        int n = scanner.nextInt();
        if (n >= 1 && n <= 26) {
            for (char i = (char) ('a' + (n - 1)); i >= 'a'; i--) {

                System.out.print(i + " ");

            }
        } else
            System.out.println(" nima qilyapsan mazgi ");

    }

    public static void String6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" n = ");
        char n = scanner.next().charAt(0);

        boolean check = Character.isDigit(n);
        boolean check1 = Character.isLetter(n);

        if (check)
            System.out.println("digit");
        else if (check1)
            System.out.println("lotin");
        else
            System.out.println("0");
    }

    public static void String7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kirit = ");
        String n = scanner.nextLine();

        if (n.length() > 0) {
            char birinchi = n.charAt(0);
            char oxiri = n.charAt(n.length() - 1);
            System.out.println("birinchi '" + birinchi + "' element kodi = " + (int) birinchi);
            System.out.println("oxirgi '" + oxiri + "' element kodi = " + (int) oxiri);
        } else
            System.out.println(" satr bushku mazgi ");

    }

    public static void String8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" N = ");
        int n = scanner.nextInt();

        System.out.print(" Belgi = ");
        char b = scanner.next().charAt(0);

        for (int i = 0; i < n; i++) {
            System.out.print(b);
        }

    }

    public static void String9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satr1 = ");
        String satr1 = scanner.next();
        System.out.print(" satr2 = ");
        String satr2 = scanner.next();

        String satr3 = satr1 + " " + satr2;

        System.out.println(satr3);

    }

    public static void String10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satr = ");
        String satr = scanner.next();

        String[] part;
        part = satr.split("");
        for (int i = part.length - 1; i >= 0; i--) {
            System.out.print(part[i].toCharArray());
        }
    }

    public static void String11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" satrni kiritng = ");
        String satr = scanner.next();

        String[] changed;

        changed = satr.split("");
        for (int i = 0; i < changed.length; i++) {

            System.out.print(changed[i] + " ");

        }

    }

    public static void String12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" satrni kiritng = ");
        String satr = scanner.nextLine();

        System.out.print("N = ");
        int n = scanner.nextInt();

        for (char i = 0; i < satr.length(); i++) {
            System.out.print(satr.charAt(i));
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
        }
    }

    public static void String13() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int k = 0, i = 0;
        System.out.println(satr.length());
        System.out.println(satr.length() - 1);

        while (i < satr.length() - 1) {
            boolean check = Character.isDigit(satr.charAt(i));
            if (check) {
                k++;
            }
            i++;
        }
        if (k > 0) {

            System.out.println(k + " ta raqam bor ");
        } else
            System.out.println(" satrda raqam qatnashmagan ");

    }

    public static void String14() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int k = 0, i = 0;

        while (i < satr.length() - 1) {
            boolean check = Character.isUpperCase(satr.charAt(i));
            if (check) {
                k++;
            }
            i++;
        }
        if (k > 0) {

            System.out.println(k + " ta katta harf bor ");
        } else
            System.out.println(" satrda katta harf yo'q qatnashmagan ");

    }

    public static void String15() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int k = 0, i = 0;

        while (i < satr.length() - 1) {
            boolean check = Character.isUpperCase(satr.charAt(i));
            if (check || (satr.charAt(i) >= 192 && satr.charAt(i) <= 223)) {
                k++;
            }
            i++;
        }
        if (k > 0) {

            System.out.println(k + " ta katta harf bor ");
        } else
            System.out.println(" satrda katta harf qatnashmagan ");

    }

    public static void String16() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int i = 0;
        while (i < satr.length()) {
            boolean check = Character.isUpperCase(satr.charAt(i));
            if (check && satr.charAt(i) >= 65 && satr.charAt(i) <= 90) {
                satr = satr.substring(0, i) + Character.toLowerCase(satr.charAt(i)) + satr.substring(i + 1);
            }
            i++;
        }

        System.out.println(satr);

    }

    public static void String17() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int i = 0;
        while (i < satr.length()) {
            boolean check = Character.isUpperCase(satr.charAt(i));
            if (check) {
                satr = satr.substring(0, i) + Character.toLowerCase(satr.charAt(i)) + satr.substring(i + 1);
            }
            i++;
        }

        System.out.println(satr);

    }

    public static void String18() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int i = 0;
        while (i < satr.length()) {
            boolean check = Character.isUpperCase(satr.charAt(i));
            if (check) {
                satr = satr.substring(0, i) + Character.toLowerCase(satr.charAt(i)) + satr.substring(i + 1);
            } else {
                satr = satr.substring(0, i) + Character.toUpperCase(satr.charAt(i)) + satr.substring(i + 1);
            }
            i++;
        }

        System.out.println(satr);

    }

    public static void String19() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int natija;

        try {
            int butunSon = Integer.parseInt(satr);
            natija = 1;
        } catch (NumberFormatException e) {
            try {
                double haqiqiySon = Double.parseDouble(satr);
                if (satr.contains(".")) {
                    natija = 2;
                } else {
                    natija = 0;
                }
            } catch (NumberFormatException ex) {
                natija = 0;
            }
        }

        System.out.println(natija);
    }

    public static void String20() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        try {
            int k = Integer.parseInt(satr);
            //int k = Integer.valueOf(satr); bu ham o'rinli
            if (k > 0) {
                String s[] = satr.split("");

                for (int i = 0; i < s.length; i++) {
                    System.out.print(s[i] + " ");
                }
            } else System.out.print("butun musbat >0 son kirit ");

        } catch (NumberFormatException e) {

            System.out.print("butun musbat son kirit ");

        }

    }

    public static void String21() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        try {
            int k = Integer.parseInt(satr);
            //int k = Integer.valueOf(satr); bu ham o'rinli
            if (k > 0) {
                String s[] = satr.split("");

                for (int i = s.length - 1; i >= 0; i--) {
                    System.out.print(s[i] + " ");
                }
            } else System.out.print("butun musbat >0 son kirit ");

        } catch (NumberFormatException e) {

            System.out.print("butun musbat son kirit ");

        }

    }

    public static void String22() {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiriting = ");
        String satr = scanner.next();
        int summa = 0;

        try {
            int k = Integer.parseInt(satr);
            if (k > 0) {
                while (k > 0) {
                    int m = k % 10;
                    summa = summa + m;
                    k = k / 10;
                }

                System.out.print("summa = " + summa);

            } else {
                System.out.print(" >0 son kirit ");
            }
        } catch (Exception e) {

            System.out.print(" butun musbat son kirit ");

        }

    }

    public static void String24() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ikkilikdagi sonni kiriting: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
    }

    public static void String25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O'nlik sanoq sistemasidagi sonni kiriting: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Ikkilik sanoq sistemasidagi qiymat: " + binary);
    }

    public static void String26() {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" N = ");
        String n = scanner.next();

        System.out.print(" yangi satrni kiriting ");
        String satr = scanner.next();
        int k = Integer.parseInt(n);
        String change = "";
        if (k < satr.length()) {

            change = satr.substring(k, satr.length());
            System.out.println(" result = " + change);

        } else if (k > satr.length()) {
            while (k != satr.length()) {
                change = change + ".";
                k--;
            }
            System.out.println(change + satr);
        }

    }

    public static void String27() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n1 = ");
        int n1 = scanner.nextInt();
        System.out.print("n2 = ");
        int n2 = scanner.nextInt();

        System.out.print("s1 satr = ");
        String satr1 = scanner.next();
        System.out.print("s2 satr = ");
        String satr2 = scanner.next();

        satr1 = satr1.substring(0, n1);
        satr2 = satr2.substring(satr2.length() - n2);

        String result = satr1 + satr2;

        System.out.print(" result = " + result);


    }

    public static void String28() {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" belgini kiritng ");
        char c = scanner.next().charAt(0);
        String k = Character.toString(c).repeat(2);
        System.out.print(" satrni kirit ");
        String s = scanner.next();

        s = s.replace(Character.toString(c), k);

        System.out.print("result = " + s);


    }

    public static void String29() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Belgini kirit : ");
        char c = scanner.next().charAt(0);
        System.out.print(" s1 string: ");
        String s1 = scanner.next();
        System.out.print(" s2 string: ");
        String s2 = scanner.next();

        String k = "";

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c) {
                k += s2;
            }
            k += s1.charAt(i);
        }

        if (k.isEmpty()) {
            k = s1;
        }

        System.out.println("Result: " + k);
    }

    public static void String30() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);
        System.out.print("Enter s1 string: ");
        String s1 = scanner.next();
        System.out.print("Enter s2 string: ");
        String s2 = scanner.next();

        String k = "";
        int index = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c) {
                k += s1.substring(index, i + 1) + s2;
                index = i + 1;
            }
        }

        k += s1.substring(index);

        if (k.isEmpty()) {
            k = s1;
        }

        System.out.println("Result: " + k);
    }

    public static void String31() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1 string: ");
        String s1 = scanner.next();
        System.out.print("Enter s2 string: ");
        String s2 = scanner.next();
        boolean k = s1.contains(s2);

        if (k)
            System.out.println(k);
        else
            System.out.println(k);

    }

    public static void String32() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1 string: ");
        String s1 = scanner.next();
        System.out.print("Enter s2 string: ");
        String s2 = scanner.next();

        int count = 0, index = 0;
        System.out.println(s1.length());
        for (int i = 0; i <= s1.length(); i++) {
            if (s1.contains(s2)) {
                count++;
                index = s1.indexOf(s2);
                int j = (index + s2.length());
                s1 = s1.substring(j);
                System.out.println(s1);
            }
        }


        System.out.println(" count = " + count);

    }

    public static void String33() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1 string: ");
        String s1 = scanner.next();
        System.out.print("Enter s2 string: ");
        String s2 = scanner.next();
        boolean k = s1.contains(s2);
        String result = "";
        int m = s1.indexOf(s2);
        if (k) {

            result = s1.substring(0, m) + s1.substring(m + s2.length());
            System.out.println(" result = " + result);

        } else {

            System.out.println(" result = " + s1);
        }

    }

    public static void String34() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1 string: ");
        String s1 = scanner.next();
        System.out.print("Enter s2 string: ");
        String s2 = scanner.next();
        boolean k = s1.contains(s2);
        String result = "";
        int m = s1.lastIndexOf(s2);
        if (k) {

            result = s1.substring(0, m) + s1.substring(m + s2.length());
            System.out.println(" result = " + result);

        } else {

            System.out.println(" result = " + s1);
        }

    }

    public static void String35() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter s1 string: ");
        String s1 = scanner.next();
        System.out.print("Enter s2 string: ");
        String s2 = scanner.next();
        boolean k = s1.contains(s2);
        String result = "";
        int m = 0;
        if (k) {
            while (s1.contains(s2)) {
                m = s1.indexOf(s2);
                result = s1.substring(0, m) + s1.substring(m + s2.length());
                s1 = result;
                m = 0;
            }
            System.out.println(" result = " + result);

        } else {

            System.out.println(" result = " + s1);
        }


    }

    public static void String36() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" s1 string: ");
        String s1 = scanner.next();
        System.out.print(" s2 string: ");
        String s2 = scanner.next();
        System.out.print(" s3 string: ");
        String s3 = scanner.next();
        String result = "";
        int index = s1.indexOf(s2);
        if (s1.contains(s2)) {

            result = s1.substring(0, index) + s3 + s1.substring(index + s2.length());
            System.out.println("result = " + result);

        } else
            System.out.println("0");


    }

    public static void String37() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" s1 string: ");
        String s1 = scanner.next();
        System.out.print(" s2 string: ");
        String s2 = scanner.next();
        System.out.print(" s3 string: ");
        String s3 = scanner.next();
        String result = "";
        int index = s1.lastIndexOf(s2);
        if (s1.contains(s2)) {

            result = s1.substring(0, index) + s3 + s1.substring(index + s2.length());
            System.out.println("result = " + result);

        } else
            System.out.println("0");


    }

    public static void String38() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" s1 string: ");
        String s1 = scanner.next();
        System.out.print(" s2 string: ");
        String s2 = scanner.next();
        System.out.print(" s3 string: ");
        String s3 = scanner.next();

        String result = "";
        if (s1.contains(s2)) {
            result = s1.replace(s2, s3);
            System.out.println(result);
        } else
            System.out.println("0");


    }

    public static void String39() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();

        String array[] = text.split(" ");
        if (array.length > 1)
            System.out.println("result = " + array[1]);
        else
            System.out.println(" ");
    }

    public static void String40() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();

        String array[] = text.split(" ");
        int k = array.length;
        String result = "";
        if (k > 1) {
            int i = 1;
            while (array[i] != array[k - 1]) {
                result = result + array[i];
                i++;
            }

            System.out.println("result = " + result);
        } else
            System.out.println(" ");


    }

    public static void String41() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");
        System.out.println(" so'zlar soni " + array.length);

    }

    public static void String42() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");

        if (text.equals(text.toUpperCase())) {

            int count = 0, helper = 0;
            for (int i = 0; i < array.length; i++) {
                helper = array[i].length() - 1;
                if (array[i].charAt(0) == array[i].charAt(helper)) {
                    count++;
                }

            }

            System.out.println("result = " + count);
        } else
            System.out.println(" katta harflarda kirit textni ");

    }

    public static void String43() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");

        if (text.equals(text.toUpperCase())) {

            int count = 0, helper = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length(); j++) {
                    if (array[i].charAt(j) == 'A') {
                        count++;
                        System.out.println(array[i]);
                        break;

                    }

                }

            }

            System.out.println("result = " + count);
        } else
            System.out.println(" katta harflarda kirit textni ");

    }

    public static void String44() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");

        if (text.equals(text.toUpperCase())) {

            int count = 0, result = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length(); j++) {
                    if (array[i].charAt(j) == 'A') {
                        count++;
                    }

                }

                if (count == 3) {
                    result++;
                    System.out.println(array[i]);
                    count = 0;
                } else
                    count = 0;

            }

            System.out.println("result = " + result);
        } else
            System.out.println(" katta harflarda kirit textni ");

    }

    public static void String45() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");

        if (text.equals(text.toUpperCase())) {
            int count = 0, min = Integer.MAX_VALUE;

            for (int i = 0; i < array.length; i++) {

                if (array[i].length() < min) {
                    min = array[i].length();
                }

            }

            System.out.println("result = " + min);

        } else
            System.out.println(" katta harflarda kirit textni ");

    }

    public static void String46() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");

        if (text.equals(text.toUpperCase())) {
            int count = 0, helper = 0, max = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i++) {
                helper = array[i].length();
                if (helper > max) {
                    max = helper;
                }

            }

            System.out.println("result = " + max);

        } else
            System.out.println(" katta harflarda kirit textni ");

    }

    public static void String47() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");

        if (text.equals(text.toUpperCase())) {


            for (int i = 0; i < array.length; i++) {

                System.out.println(array[i]);

            }

        } else
            System.out.println(" katta harflarda kirit textni ");

    }

    public static void String48() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");
        String temp = "", helper = "", result = "";
        char g = '!';
        for (int i = 0; i < array.length; i++) {
            g = array[i].charAt(0);
            temp = array[i].substring(1);
            helper = temp.replace(g, '.');
            result = g + helper;

            System.out.println(" result = " + result);
        }


    }

    public static void String49() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" satrni kiritng : ");
        String text = scanner.nextLine();
        String array[] = text.split(" ");
        String temp = "", helper = "", result = "";
        char g = '!';
        for (int i = 0; i < array.length; i++) {
            int n = array[i].length();
            g = array[i].charAt(n - 1);
            temp = array[i].substring(0, n - 1);
            helper = temp.replace(g, '.');
            result = helper + g;

            System.out.println(" result = " + result);
        }


    }

    public static void String50() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Satr  ");
        String text = scanner.nextLine().trim();
        String[] array = text.split("\\s+");
        String result = "";

        for (int i = array.length - 1; i >= 0; i--) {

            result += array[i] + " ";

        }

        result = result.trim();
        System.out.println(result);
    }


}












