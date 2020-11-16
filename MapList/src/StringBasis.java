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
        System.out.println("----6 задание-----");
        System.out.println(sameStarChar("xy*yzz"));// → true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → true
        System.out.println(sameStarChar("xa*az*"));// → true
        System.out.println("----7 задание-----");
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
        System.out.println("----8 задание-----");
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2
        System.out.println("----9 задание-----");
        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true
        System.out.println(endOther("abc", "ghXdvs"));// → false
        System.out.println("----10 задание-----");
        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false
        System.out.println("----11 задание-----");
        System.out.println(makeOutWord("<<>>", "Yay"));// → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"
    }

    private static String makeOutWord(String symbol, String word) {
        return symbol.substring(0, symbol.length() / 2) + word + symbol.substring(symbol.length() / 2);
    }

    //Скажем, что строка является xy-балансной, если для всех символов 'x' в строке, где-то позже в строке есть
    // символ 'y'. Так что "xxy" сбалансирован, а "xyx" - нет.
    // Один 'y' может балансировать несколько 'x'. Возвращает true, если заданная строка сбалансирована по xy.
    private static boolean xyBalance(String input) {
        int s = input.length();
        for (int i = 0; i < s; i++) {
            if (input.lastIndexOf("x") < input.lastIndexOf("y")) {
                return true;
            }
        }
        return false;
    }

    //Получив две строки, верните true, если одна из них появляется в самом конце другой строки,
    //игнорируя разницу в верхнем/нижнем регистре (другими словами, вычисление не должно быть "чувствительным к
    // регистру").
    // Замечание: str.toLowerCase() возвращает строку в нижнем регистре.
    private static boolean endOther(String s1, String s2) {
        String a = s1.toLowerCase();
        String b = s2.toLowerCase();
        if (a.endsWith(b) || b.endsWith(a)) {
            return true;
        }
        return false;
    }

    //Возвращает количество раз, когда строка "hi" появляется в любом месте данной строки.
    private static int countHi(String str) {
        int count = 0;
        String hi = "hi";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals(hi)) {
                count++;
            }
        }
        return count;
    }

    //Возвращает версию заданной строки, в которой для каждой звезды ()
    // в строке звезда и символы сразу уходят влево и вправо.
    // Таким образом, "abcd" дает "ad", а "ab**cd" также дает "ad".
    private static String starOut(String str) {
       String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != '*') {
                output = str.substring(0, i - 1) + str.substring(i + 2);
            }
            if (str.charAt(i) == '*' && str.charAt(i - 1) == '*') {
                output = str.substring(0, i - 2) + str.substring(i + 2);
            }
        }
        return output;
    }

    //Возвращает true, если для каждой '*' (звездочки) в строке,
    // если есть символы как непосредственно перед звездочкой, так и после нее, они одинаковы.
    private static boolean sameStarChar(String str) {
       /* for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        }
        return true;*///альтернативное решение
        int z = -1;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    z = i;
                } else {
                    return false;
                }
            }
        }
        if (z > 0 || z == -1) {
            return true;
        } else {
            return false;
        }
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
        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b') {
                    if (str.charAt(i + 2) == 'b') {
                        return true;
                    }
                }
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
