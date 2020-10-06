package de.telran.data;

public class Gadget {
    private GadgetState state;
    public void setState(GadgetState state) {
        this.state = state;
    }
    public void doAction(){
        this.state.doAction();
    }
    /*public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void doAction(){
        if (state.equalsIgnoreCase("on"))
            System.out.println("ON");
        else {
            System.out.println("OFF");
        }
    }*/
}
