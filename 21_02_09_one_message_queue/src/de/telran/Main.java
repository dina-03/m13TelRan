package de.telran;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        OneItemStringQueue queue = new OneItemStringQueue();
        // System.out.println(queue);
        /*MessageSupplier supplier = new MessageSupplier(queue);
        MessageConsumer consumer1 = new MessageConsumer(queue);
        MessageConsumer consumer2 = new MessageConsumer(queue);
        MessageConsumer consumer3 = new MessageConsumer(queue);
        Thread supplierThread = new Thread(supplier);
        Thread consumer1Thread = new Thread(consumer1);
        consumer1Thread.setDaemon(true);
        Thread consumer2Thread = new Thread(consumer2);
        consumer2Thread.setDaemon(true);
        Thread consumer3Thread = new Thread(consumer3);
        consumer3Thread.setDaemon(true);
        supplierThread.start();
        consumer1Thread.start();
        consumer2Thread.start();
        consumer3Thread.start();*/

        Thread consumerThread1 = new Thread(new MessageConsumer(queue));
        Thread consumerThread2 = new Thread(new MessageConsumer(queue));
        Thread consumerThread3 = new Thread(new MessageConsumer(queue));

        Thread supplierThread = new Thread(new MessageSupplier(queue));

        // supplierThread.setDaemon(true);
        consumerThread1.setDaemon(true);
        consumerThread2.setDaemon(true);
        consumerThread3.setDaemon(true);

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

        supplierThread.start();
    }
}
