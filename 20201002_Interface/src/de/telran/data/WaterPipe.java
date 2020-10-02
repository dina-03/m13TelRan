package de.telran.data;

public class WaterPipe implements Stateable, Printable {
    @Override
    public void print() {
        System.out.println("i'm pipe");
    }

    @Override
    public void printState(int n) {
        if (n == OPEN){
            System.out.println("water is opened");
        }else  if (n == CLOSED){
            System.out.println("water is closed");
        }else {
            System.out.println("state is invalid");
        }
    }
}
