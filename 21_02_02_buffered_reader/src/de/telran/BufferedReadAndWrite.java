package de.telran;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedReadAndWrite {

    public void writeToFile(String filename, List<String> text) throws IOException {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(filename))) {
            for (String s : text) {
                br.write(s);
            }
        }
    }

    public void readFileFromConsoleAndWriteToFile() throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = br.readLine()).equals("exit")) {
                list.add(line);
            }
            System.out.println("goodbye!");
        }
    }
}
