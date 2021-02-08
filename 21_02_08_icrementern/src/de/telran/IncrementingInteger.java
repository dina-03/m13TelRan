package de.telran;

public class IncrementingInteger {
    private int source;

    public IncrementingInteger(int source) {
        this.source = source;
    }

    public IncrementingInteger() {
    }

    public synchronized void increment() {
        //this - object class IncrementingInteger
        /*synchronized (this){ - этот синтаксис используется если в методе нет synchronized
            source++;
        }*/
        source++;
    }

    public int get() {
        return source;
    }
}
