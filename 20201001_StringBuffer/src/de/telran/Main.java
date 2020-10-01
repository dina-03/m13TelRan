package de.telran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(32);
        StringBuffer sb2 = new StringBuffer("Hello");
        char[] ch = {'a', 'b', 'c', 'd'};
        StringBuffer sb3 = new StringBuffer(String.copyValueOf(ch));
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println(sb2.append(ch));
        System.out.println(sb2.capacity()); //не изменяется
        System.out.println(sb2.length());
        sb2.setCharAt(5, ',');
        System.out.println(sb2);
        sb2.insert(6, "dear");
        System.out.println(sb2);
        sb2.delete(10, 13);
        System.out.println(sb2);
        System.out.println(sb2.charAt(5));
        sb1 = sb2;

        System.out.println(sb1);
        System.out.println();
        int[] num = {1, 2, 3};
        System.out.println(sb1.append(5).append("!!!!").append(Arrays.toString(num)).append(';'));
        System.out.println(sb1);
        System.out.println(sb1.length());
        sb1.setLength(15);
        System.out.println(sb1);
        System.out.println(sb1.subSequence(4, 7));
        String str = "456";
        System.out.println(sumNumber(str));
        StringBuffer sb4 = new StringBuffer("562");
        System.out.println(sumNumber(sb4));
        System.out.println(sumNumber("122589502"));
        printRepeatChar("aaabbcdddd");
    }

    private static int sumNumber(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += Integer.parseInt(input.substring(i, i + 1));
        }
        return sum;
    }

    private static int sumNumber(StringBuffer sb) {
        int sum = 0;
        char[] ch = new char[sb.length()];
        sb.getChars(0, ch.length, ch, 0);
        for (char c : ch) {
            sum += Character.digit(c, 10);//каждое 'с' переводим в десятичную систему
        }
        return sum;
    }

    private static void printRepeatChar(String input) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        char d = 'd';
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == a) {
                count1++;
            }
            if (input.charAt(i) == b) {
                count2++;
            }
            if (input.charAt(i) == c) {
                count3++;
            }
            if (input.charAt(i) == d) {
                count4++;
            }
        }
        System.out.println("a" + count1 + "b" + count2 + "c" + count3 + "d" + count4);
    }
}
