public class Manipulator {
    public static int[] fillArray(int a, int b, int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = a;
            num[i] += i * b;
        }
        return num;
    }

    public boolean checkPalindrome1(String str) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            output.insert(0, str.charAt(i));
        }
        return str.equals(output.toString());
    }

    public String nonStart(String str1, String str2) {
        return str1.substring(1, str1.length()) + str2.substring(1, str2.length());
    }

    public String middleTwo(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

    public int[] zeroMax(int[] arr) {
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

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static int getMaxArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int getMinArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public boolean checkPalindrome2(String str) {
        str = str.replaceAll(" ", "");
        return checkPalindrome1(str);
    }

    public int[] shiftLeft(int[] arr) {
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

    public int[] arrayFilling() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length - 1; i += 2) {
            arr[i] = 0;
            arr[i + 1] = 1;
        }
        return arr;
    }

}
