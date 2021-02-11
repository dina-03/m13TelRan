package de.telran;

public class MessageConsumer implements Runnable {

    private final OneItemStringQueue queue;

    public MessageConsumer(OneItemStringQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String addMassage = queue.removeLast();
                 System.out.println(addMassage);
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
    }
}
