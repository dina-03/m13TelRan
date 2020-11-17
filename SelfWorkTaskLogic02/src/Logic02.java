public class Logic02 {
    public static void main(String[] args) {
        System.out.println("-----1-----");
        System.out.println(makeBricks(3, 1, 8));// →true
        System.out.println(makeBricks(3, 1, 9));// →false
        System.out.println(makeBricks(3, 2, 10));// →true
        System.out.println("-----2-----");
        System.out.println(noTeenSum(1, 2, 3));// → 6
        System.out.println(noTeenSum(2, 13, 1));// → 3
        System.out.println(noTeenSum(2, 1, 14));// → 3
        System.out.println("-----3-----");
        System.out.println(blackJack(19, 21));// → 21
        System.out.println(blackJack(21, 19));// → 21
        System.out.println(blackJack(19, 22));// → 19
        System.out.println("-----4-----");
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        System.out.println("-----5-----");
        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));// → 10
    }

    //Для этой проблемы мы округлим значение int до следующего кратного 10, если его крайняя правая цифра равна 5 или
// более, поэтому 15 округляется до 20. В качестве альтернативы округляем до предыдущего кратного 10, если его
// крайняя правая цифра меньше чем 5, поэтому 12 округляется до 10. Если даны 3 целых числа, abc возвращает сумму их
// округленных значений.
//Чтобы избежать повторения кода, напишите отдельный помощник «public int round10 (int num) {» и вызовите его 3 раза.
//Напишите помощник полностью ниже и на том же уровне отступа, что и roundSum ().
    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        int roundTen = num % 10;
        num -= roundTen;
        if (roundTen >= 5) {
            num += 10;
        }
        return num;
    }

    //Учитывая 3 значения int, a b c, верните их сумму.
    //Однако, если одно из значений совпадает с другим, оно не учитывается при расчете суммы.
    private static int loneSum(int a, int b, int c) {
        int res = a + b + c;
        if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else if (c == a) {
            return b;
        } else
            return res;
    }

    //Учитывая 2 значения типа int больше 0, верните любое значение, ближайшее к 21, без перехода.
    //Верните 0, если они оба перейдут.
    private static int blackjack(int a, int b) { //этот метод прошел не все тесты
        int c = 21;
        if (a < c && b < c) {
            return c;
        } else if (a > c) {
            return b;
        } else if (b > c) {
            return a;
        }
        return c;
    }

    public static int blackJack(int a, int b) {//этот прошел все тесты
        if (a > 21)
            a = 0;
        if (b > 21)
            b = 0;
        return Math.max(a, b);
    }

    //Учитывая 3 значения int, a b c, верните их сумму.
//Однако, если какое-либо из значений является подростком - в диапазоне от 13 до 19 включительно - тогда это значение
// считается как 0, за исключением 15 и 16, которые не считаются подростками.
//Напишите отдельный помощник «public int fixTeen (int n) {», который принимает значение int и возвращает это
// значение, зафиксированное для правила подростков.
//Таким образом вы избегаете повторения подросткового кода 3 раза (т. Е. «Декомпозиции»).
//Определите помощник ниже и на том же уровне отступа, что и основной noTeenSum ().
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            n = 0;
        }
        return n;
    }

    //Мы хотим сделать ряд кирпичей длиной в дюймы.
//У нас есть несколько маленьких кирпичей (по 1 дюйму каждый) и больших кирпичей (по 5 дюймов каждый).
//Вернитесь к истинному значению, если можно сделать цель, выбрав из данных кирпичей.
//Это немного сложнее, чем кажется, и может быть сделано без каких-либо петель.
//См. также: Введение в MakeBricks
    private static boolean makeBricks(int small, int big, int goal) {
        if ((big * 5) > goal) {
            goal %= 5; // слишком много больших кирпичей
        } else {
            goal -= (5 * big); //если не слишком много кирпичей
        }
        if (small >= goal) {
            return true;
        }
        return false;
    }
}
