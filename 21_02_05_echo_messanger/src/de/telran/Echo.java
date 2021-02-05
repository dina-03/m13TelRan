package de.telran;

public class Echo implements Runnable {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(message);
            }
        }
    }
}
