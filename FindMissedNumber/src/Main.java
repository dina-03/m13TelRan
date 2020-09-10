public class Main {
    public static void main(String[] args) {
        //int[] a = {1, 3, 4, 5, 6, 7, 8};
        int[] a = {1, 2, 3, 5, 7};
        //create Method, which find missing number in array
        System.out.println(findMissingNumber(a));
        System.out.println(findMissingNumberTwo(a));
    }

    public static int findMissingNumberTwo(int[] input) {
        int sum = 0, sumI = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            sumI += (i + 1);
        }
        sumI += input.length + 1;
        return sumI - sum;
    }

    public static int findMissingNumber(int[] input) {
        int result = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] + 1 != input[i + 1]) {
                result = input[i] + 1;
                break;
            }
        }
        return result;
    }
}
