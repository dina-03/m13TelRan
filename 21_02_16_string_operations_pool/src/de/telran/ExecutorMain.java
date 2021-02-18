package de.telran;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(17);
        Runnable task = () -> System.out.println("my task");

        executor.execute(task);

        // Decline all new tasks (via method execute) and completes all existing tasks
        executor.shutdown();

        // executor.shutdownNow();

        TwoMethodsInterface twoMethods = new TwoMethodsInterface() {
            @Override
            public void first() {
                System.out.println("first");
            }

            @Override
            public void second() {
                System.out.println("second");
            }
        };
    }
}

interface TwoMethodsInterface {
    void first();

    void second();
}
