public class Main {

    public String reversS(String str) {
        String rev = new StringBuffer(str).reverse().toString();
        return rev;
    }

    public String reversTow(String str) {
        char[] result = new char[str.length()];
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            result[length - i - 1] = str.charAt(i);
        }
        return new String(result);
    }

    public int recursionNSquare(int n) {
        if (n == 0) {
            return 0;
        } else {
            return recursionNSquare(n - 1) + n + n - 1;
        }
    }

    public int recursionNod(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return recursionNod(b, a % b);
    }
}
