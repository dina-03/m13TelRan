public class StringBasis {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));//→ "TThhee"
        System.out.println(doubleChar("AAbb"));//→ "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));//→ "HHii--TThheerree"
        System.out.println("----2 задание-----");
        System.out.println(countCode("aaacodebbb"));// → 1
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));// → 2
        System.out.println("----3 задание-----");
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false
        System.out.println("----4 задание-----");
        System.out.println(repeatEnd("Hello", 3));// → "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1));// → "o"
        System.out.println("----5 задание-----");
        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false
    }

    //Получив строку, рассмотрим префиксную строку, сделанную из первых N символов строки.
    // Появляется ли эта префиксная строка где-то еще в строке?
    // Предположим, что строка не пустая и что N находится в диапазоне 1...str.length().
    private static boolean prefixAgain(String str, int n) {
        return (str.substring(n).contains(str.substring(0, n)));
    }

    //Получив строку и int n, верните строку, состоящую из n повторений последних n символов строки.
    // Можно предположить, что n находится между 0 и длиной строки, включительно.
    private static String repeatEnd(String s1, int rep) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s1.length() && i < rep; i++) {
            res.append(s1.substring(s1.length() - rep));
        }
        return res.toString();
    }

    //Return true if the given string contains a “bob” string, but where the middle ‘o’ char can be any char.
    private static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    //Получив строку, верните строку, где для каждого символа в оригинале есть два.
    private static String doubleChar(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            res.append(str.charAt(i));
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
