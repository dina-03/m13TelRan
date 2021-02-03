package de.telran;

import de.telran.action.CapitalLettersFileAction;
import de.telran.action.SpacesToStarsFileAction;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        SpacesToStarsFileAction stsfa = new SpacesToStarsFileAction(new FileOperations());
        CapitalLettersFileAction cap = new CapitalLettersFileAction(new FileOperations());
        FileOperations fo = new FileOperations();
        List<String> text = Arrays.asList("Душа моя озарена неземной радостью, как эти чудесные весенние утра");
       // fo.writeList(text,"text.txt");
        stsfa.handleFile("text.txt");
       // cap.handleFile("text.txt");

    }
}
