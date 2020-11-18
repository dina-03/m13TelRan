public class ArraysTask {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 1, 3};      // 4
        int[] b = {1, 4, 2, 1, 4, 1, 4};// 6
        int[] c = {1, 4, 2, 1, 4, 4, 4};// 6
        System.out.println(maxSpan(a));// → 4
        System.out.println(maxSpan(b));// → 6
        System.out.println(maxSpan(c));// → 6
    }

    //Рассмотрим крайнее левое и крайнее правое появление некоторого значения в массиве.
//Мы скажем, что «диапазон» - это количество элементов между двумя включительно.
//Одно значение имеет диапазон 1. Возвращает самый большой диапазон, найденный в данном массиве.
//(Эффективность не является приоритетом.)
    public static int maxSpan(int[] arr) {
        int n = arr.length;
        int x = 0;
        int y = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            if (arr[0] == arr[i]) {
                x = i;
            }
            if (arr[n - 1] == arr[j]) {
                y = j;
            }
        }
        return Math.max(x + 1, n - y);
    }
}
