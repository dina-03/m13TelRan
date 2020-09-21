package de.telran;

public class Test {
    private final int ID_NUMBER;
    // private static int ID_NUMBER;
    private static int idNumber = 0;

    public Test(int ID_NUMBER) {
        this.ID_NUMBER = ID_NUMBER;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public int getID_NUMBER() {
        return ID_NUMBER;
    }

    public Test() {
        ID_NUMBER = 10;
        idNumber++;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test(45);
        System.out.println(t1.ID_NUMBER);
        System.out.println(t4.ID_NUMBER);
        System.out.println(Test.idNumber);
        System.out.println(Test.getIdNumber());

    }

}
