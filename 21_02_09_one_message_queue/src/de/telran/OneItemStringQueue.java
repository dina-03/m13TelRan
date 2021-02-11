package de.telran;

public class OneItemStringQueue {
    private final Object mutex = new Object();
    private String source;
    private final Object mutex2 = new Object();

    public void addFirst(String item) throws InterruptedException {

        synchronized (mutex2) {
            while (source != null)
                mutex2.wait();
        }

        synchronized (mutex) {
            source = item;
            mutex.notify(); //разморозка
        }
    }

    public String removeLast() throws InterruptedException {
        synchronized (mutex) { //заморозка
            while (source == null) {
                System.out.println("The thread with id " + Thread.currentThread().getId() + " fell asleep");
                mutex.wait();
            }
        }
        synchronized (mutex2){
            String res = source;
            source = null;
            System.out.println("The thread with id " + Thread.currentThread().getId() + "woke up");
            mutex2.notify();
            return res;
        }
    }
}
