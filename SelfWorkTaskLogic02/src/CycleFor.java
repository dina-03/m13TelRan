public class CycleFor {
    public static void main(String[] args) {
        System.out.println(digitPowTwo(5));// ->25
        System.out.println(digitPowTwo(10));// ->100
        System.out.println(digitPowTwo(4));// ->16
        System.out.println(printLineNtimes("hello", 3));// -> hello hello hello
        System.out.println(printLineNtimes("Dora", 5));
        System.out.println("________");
        withoutResidue();
        System.out.println();
        System.out.println("---------");
        myLine(100);// ->7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println();
        mySecondLine(1000);// -> 1 2 4 8 16 32 64 128 256 512
    }

    private static void mySecondLine(int a) {
        for (int i = 1; i <= 1024; i *= 2) {
            System.out.print(i + "; ");
        }
    }

    private static void myLine(int a) {
        for (int i = 7; i <= 100; i += 7) {
            System.out.print(i + "; ");
        }
    }

    public static String printLineNtimes(String str, int count) {
        StringBuilder input = new StringBuilder();
        for (int i = 0; i < count; i++) {
            input.append(str + ", ");
        }
        return input.toString();
    }

    private static int digitPowTwo(int a) {
        int n = 2;
        return (int) Math.pow(a, n);
    }

    public static void withoutResidue() {
        for (int i = 3; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "; ");
            }
        }
    }
}
