package de.telran;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
       /* List<String> fromFile = readFile("text.txt");
        System.out.println(fromFile);*/
       // readFromConsole();
        writeInFileAndReadFromConsole("text.txt");
    }

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
}
