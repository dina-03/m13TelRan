import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a1 = 50;
        int a2 = 50;
        String str1 = "Vasya";
        String str2 = new String("Vasya");
        Integer b1 = 128;
        Integer b2 = 128;
        /*System.out.println(a1 == a2);//
        System.out.println(b1 == b2);//указывают ли ссылки на один и тот же объект
        System.out.println(str1 == str2);
        str1.contains("ya");*/
        int[] numbers = {1, 2, 3, 4};
        System.out.println(changeNumber(a1));
        System.out.println(a1);
        changeArraysNumber(numbers);
        System.out.println(Arrays.toString(numbers));

        changeArrays(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static int changeNumber(int num) {
        return num * 2;
    }

    private static void changeArraysNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
    }

    private static void changeArrays(int[] numbers) {
        for (int num : numbers) {
            num = num * 2;
            System.out.println(num);
        }
    }
}
