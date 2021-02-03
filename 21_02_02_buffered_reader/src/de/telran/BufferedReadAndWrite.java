package de.telran;

import java.io.*;
import java.util.List;

public class BufferedReadAndWrite {

    public void writeToFile(String filename, List<String> text) throws IOException {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(filename))) {
            for (String s : text) {
                br.write(s);
            }
        }
    }

    public void readFileFromConsoleAndWriteToFile(List<String> text) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String filename;
            while (!(filename = br.readLine()).equals("exit")) {
                writeToFile(filename, text);
            }
            System.out.println("goodbye!");
        }
    }
}
