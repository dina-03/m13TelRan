import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*int[] a1 = {6, 2, 5, 3};
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
        split();
        int[] array = new int[]{8, 3, 7, 5, 6, 10, 12, 25, 2};
        System.out.println(getMaxArray(array));
        System.out.println(getMinArray(array));
        split();
        int[] b1 = {1, 2, 3};
        int[] b2 = {7, 3};
        int[] c1 = {1, 2, 3};
        int[] c2 = {7, 3, 2};
        int[] d1 = {1, 2, 3};
        int[] d2 = {1, 3};
        System.out.println(commonEnd(b1, b2));// → true
        System.out.println(commonEnd(c1, c2));// → false
        System.out.println(commonEnd(d1, d2));// → true
        split();
        int[] e1 = {0, 5, 0, 3};
        int[] e2 = {0, 4, 0, 3};
        int[] e3 = {0, 1, 0};
        System.out.println(Arrays.toString(zeroMax(e1)));// →[5, 5, 3, 3]
        System.out.println(Arrays.toString(zeroMax(e2)));// →[3, 4, 3, 3]
        System.out.println(Arrays.toString(zeroMax(e3)));// →[1, 1, 0]
        split();
        System.out.println(nonStart("Hello", "There"));// →"ellohere"
        System.out.println(nonStart("java", "code"));// →"avaode"
        System.out.println(nonStart("shotl", "java"));// →”hotlava"
        split();
        System.out.println(middleTwo("string"));// →"ri"
        System.out.println(middleTwo("code"));// →”od"
        System.out.println(middleTwo("Practice"));// → “ct"
        split();*/
        System.out.println(checkPalindromeOne("ШАЛАШ"));
        System.out.println(checkPalindromeOne("ШАПКА"));
        System.out.println(checkPalindromeOne("ABBA"));
        System.out.println(Arrays.toString(arrayFillingTwo(9)));
        System.out.println(arrayFillingTwo1(8));
        System.out.println(fillArrayArithmeticProgression(5, 2, 5));
        Integer[] array = {8, 3, 7, 5, 6, 10, 12, 25, 2};
        System.out.println(sumMaxAndMinList(array));
        split();
        int[] e1 = {0, 5, 0, 3};
        int[] e2 = {0, 4, 0, 3};
        int[] e3 = {0, 1, 0};
        System.out.println(Arrays.toString(zeroMaxTwo(e1)));
        System.out.println(Arrays.toString(zeroMaxTwo(e2)));
        System.out.println(Arrays.toString(zeroMaxTwo(e3)));
    }

    public static int[] zeroMaxTwo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                int max = arr[i + 1];
                for (int j = 0; j < arr.length && arr[j] != 0; j++) {
                    if (arr[j] % 2 != 0 && arr[j] > max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }
        return arr;
    }

    public static int sumMaxAndMinList(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        return Collections.max(list) + Collections.min(list);
    }

    public static List<Integer> fillArrayArithmeticProgression(int a, int b, int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(a);
            a += b;
            num--;
        }
        return list;
    }

    public static List<Integer> arrayFillingTwo1(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            if (n == 1) {
                list.add(0);
                return list;
            }
            Collections.addAll(list, 0, 1);
            n -= 2;
        }
        return list;
    }

    public static int[] arrayFillingTwo(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 1;
            }
        }
        return arr;
    }

    private static String middleTwo(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

    private static String nonStart(String str1, String str2) {
        return str1.substring(1) + str2.substring(1);
    }

    public static int[] zeroMax(int[] arr) {
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                max = Math.max(max, arr[i]);
            } else if (arr[i] == 0) {
                arr[i] = max;
            }
        }
        return arr;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int getMinArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int getMaxArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int[] fillArray(int a, int b, int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = a;
            num[i] += i * b;
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

    private static boolean checkPalindromeOne(String str) {
        if (str.length() == 1) {
            return true;
        } else {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1))) {
                if (str.length() == 2) {
                    return true;
                }
                return checkPalindromeOne(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
        // return false;
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
