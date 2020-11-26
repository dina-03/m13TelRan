package de.telran;

public class Main {
    static boolean toThrow = false;

    public static void main(String[] args) {
        methode1();
        toThrow = true;
        try {
            System.out.println("before method() call");
            methode1();
            System.out.println("after method() call");
        } catch (AOurUncheckedException e) {
            System.out.println("Under the catch");
        } catch (Exception e) {
            System.out.println("Under the catch2");
        }

        try {
            method2();
        } catch (BCheckedException e) {
            System.out.println("under BChecked catch");
        } finally {
            System.out.println("under finally");
        }
        try {
            method3();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("handled method3 with IndexOutOfBoundsException");
        }

    }

    static void methode1() {
        if (toThrow)
            throw new AOurUncheckedException();
    }
    /**
     * Here one can look the description of the method
     *
     * @throws BCheckedException
     *         if ...
     */

    static void method2() throws BCheckedException {
        if (toThrow)
            throw new BCheckedException();
    }

    static void method3() {
        try {
            methode1();
        } catch (AOurUncheckedException aex) {
            throw new IndexOutOfBoundsException();
        } finally {
            throw new NullPointerException();
            //System.out.println("under second finally");
        }
    }
}
