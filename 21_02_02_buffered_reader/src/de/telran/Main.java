package de.telran;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> fromFile = readFile("text.txt");
        /*System.out.println(fromFile);*/
        // readFromConsole();
        // writeInFileAndReadFromConsole("text.txt");
        //readFileFromConsoleAndWriteToFile();
        BufferedReadAndWrite bra = new BufferedReadAndWrite();
        // System.out.println(bra.readFileFromConsoleAndWriteToFile());
        List<String> text = Arrays.asList("Шерлок Холмс");
        // bra.writeToFile("text.txt", text);
         bra.readFileFromConsoleAndWriteToFile();
       // writeFromConsole();
    }

    // reads from file
    public static List<String> readFile(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            List<String> res = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                res.add(line);
            }
            return res;
        }
    }

    // reads from console
    public static void readFromConsole() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null && !line.equals("exit")) {
                System.out.println(line);
            }
            System.out.println("Bye!");
        }

    }

    public static void writeInFileAndReadFromConsole(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
                String line;
                while (!(line = br.readLine()).equals("exit")) {
                    bw.write(line);
                }
                System.out.println("goodbye!");
            }
        }
    }

    //from Anton
    public static void writeFromConsole() throws IOException {
        FileOutputStream fos = new FileOutputStream("text.txt");
        PrintWriter pw = new PrintWriter(fos);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null && !line.equals("exit")) {
                pw.println(line);
            }
            pw.flush();
        }
    }
}
