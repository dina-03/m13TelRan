package de.telran;

import de.telran.action.CapitalLettersFileAction;
import de.telran.action.ReplaceFileAction;
import de.telran.action.SpacesToStarsFileAction;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        SpacesToStarsFileAction stsfa = new SpacesToStarsFileAction(new FileOperations());
        CapitalLettersFileAction cap = new CapitalLettersFileAction(new FileOperations());
        FileAction pfa = new ReplaceFileAction(new FileOperations(), "#", " ");
        FileOperations fo = new FileOperations();
        // List<String> text = Arrays.asList("Душа моя озарена неземной радостью, как эти чудесные весенние утра");
        List<String> text = Arrays.asList("Проснувшись однажды утром после беспокойного сна,\n " +
                "Грегор Замза обнаружил, что он у себя\n в постели превратился в страшное насекомое.");
        //fo.writeList(text,"text01.txt");
        //stsfa.handleFile("dogs.txt");
        //cap.handleFile("dogs.txt");
        //fo.writeList(text,"dogs.txt");
        // pfa.handleFile("textReplace.txt");

    }
}
