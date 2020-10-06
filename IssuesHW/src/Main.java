import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {6, 2, 5, 3};
        int[] a2 = {1, 2};
        int[] a3 = {1};
        System.out.println(Arrays.toString(shiftLeft(a1)));// → [2, 5, 3, 6]
        System.out.println(Arrays.toString(shiftLeft(a2)));// → [2, 1]
        System.out.println(Arrays.toString(shiftLeft(a3)));// → [1]
        split();
        System.out.println(checkPalindrome1("НАГАН"));// -> true;
        System.out.println(checkPalindrome1("ШАЛАШ"));// -> true;
        System.out.println(checkPalindrome1("ЦВЕТОК"));// -> false;
        split();
        System.out.println(checkPalindrome2("А РОЗА УПАЛА НА ЛАПУ АЗОРА"));// -> true;
        System.out.println(checkPalindrome2("ДОБРЫЙ ДЕНЬ"));// -> false;
        split();
        System.out.println(Arrays.toString(arrayFilling()));
        split();
        int[] number = new int[5];
        System.out.println(Arrays.toString(fillArray(5, 2, number)));// -> {5,7,9,11,13}

    }

    public static int[] fillArray(int a, int b, int[] num) {
        for (int i = 0; i < num.length; i += b) {
            num[i] = a;
            num[i + 1] = a + b++;
        }
        return num;
    }

    public static int[] arrayFilling() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length - 1; i += 2) {
            arr[i] = 0;
            arr[i + 1] = 1;
        }
        return arr;
    }

    public static String deleteSpace(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                output.append(input.charAt(i));
            }
        }
        return output.toString();
    }

    private static boolean checkPalindrome2(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            output.insert(0, str.charAt(i));
        }
        str = deleteSpace(str).toLowerCase();
        output = new StringBuilder(deleteSpace(output.toString()).toLowerCase());
        return str.equals(output.toString());
    }

    private static boolean checkPalindrome1(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            output.insert(0, str.charAt(i));
        }
        return str.equals(output.toString());
    }

    private static int[] shiftLeft(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr.length > 3) {
                output[0] = arr[1];
                output[1] = arr[2];
                output[2] = arr[3];
                output[3] = arr[0];
            } else if (arr.length > 1) {
                output[0] = arr[1];
                output[1] = arr[0];
            } else {
                output[0] = arr[0];
            }
        }
        return output;
    }

    public static void split() {
        System.out.println("------------------");
    }

}
