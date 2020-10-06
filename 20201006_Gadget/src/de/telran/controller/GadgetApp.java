package de.telran.controller;

import de.telran.data.Gadget;
import de.telran.data.OffState;
import de.telran.data.OnState;
import de.telran.data.WaitState;

public class GadgetApp {
    public static void main(String[] args) {
        Gadget gadget = new Gadget();
        gadget.setState(new OnState());
        gadget.doAction();
        gadget.setState(new OffState());
        gadget.doAction();
        gadget.setState(new WaitState());
        gadget.doAction();
       /* gadget.setState("ON");
        gadget.doAction();
        gadget.setState("OFF");
        gadget.doAction();*/
    }
}
