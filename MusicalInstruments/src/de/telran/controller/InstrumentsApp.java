package de.telran.controller;

import de.telran.data.*;

public class InstrumentsApp {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Acoustic guitar");
        Drum drum = new Drum("Percussion mallet drum");
        Trumpet trumpet = new Trumpet("Piccolo trumpet");
        Piano piano = new Piano("Fortepiano");

        Instruments[] instruments = {guitar, drum, trumpet, piano};

        Instruments trumpet1 = Instruments.createObject("Trumpet", 3);
        Instruments piano1 = Instruments.createObject("Piano", 4);
        trumpet.play();
        Instruments.split();
        trumpet1.play();
        Instruments.split();
        guitar.play();
        Instruments.split();
        drum.play();
        Instruments.split();
        piano.play();
        Instruments.split();
        piano1.play();
    }
}
