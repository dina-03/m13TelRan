package de.telran;

public class Test {
    public static String str = "String"; // 2
    private static int id;
    private int idInstance;

    {
        System.out.println("non-static block initializer"); // 3
        idInstance = ++id;
        str = "hi";
        System.out.println(str);
    }

    static {
        str = "good!";
        System.out.println("static initializer "); // 1
    }

    public void call() {
        System.out.println("call method");      //4
    }

    public static int getId() {
        return id;
    }

    public int getIdInstance() {
        return idInstance;
    }

    public static void main(String[] args) {
        System.out.println(str);
        Test test = new Test();
        test.call();
        System.out.println(test.idInstance);
        Test test1 = new Test();
        System.out.println(test1.idInstance);
    }
}
