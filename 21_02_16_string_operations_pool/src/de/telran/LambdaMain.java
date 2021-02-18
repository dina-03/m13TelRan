package de.telran;

public class LambdaMain {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("lambda");
                System.out.println("another command");
            }
        };

        Runnable task1 = () -> {
            System.out.println("lambda");
            System.out.println("another command");
        };
    }
}


