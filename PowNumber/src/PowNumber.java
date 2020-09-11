public class PowNumber {
    public static void main(String[] args) {
        System.out.println(powNumber(5, 3));
    }

    public static int powNumber(int number, int pow) {
        while (pow != 1) {
            return powNumber(number, --pow) * number;
        }
        return number * 1;
    }
}
