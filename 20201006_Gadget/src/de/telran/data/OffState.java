package de.telran.data;

public class OffState implements GadgetState{
    @Override
    public void doAction() {
        System.out.println("OFF");
    }
}
