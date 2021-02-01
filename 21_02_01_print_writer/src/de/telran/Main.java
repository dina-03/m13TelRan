package de.telran;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        printWriter();
        printStream();
        long now = System.currentTimeMillis();
        System.out.println(now);
    }

    public static void printWriter()throws IOException{
        FileOutputStream fos = new FileOutputStream("output.txt");
        PrintWriter pw = new PrintWriter(fos); //pw буферизирует записанные файлы
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");

        pw.flush();// устанавливает связь с файлом куда нужно записать: output.txt

        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello2");
        fos.write("HiFi + ".getBytes());
        pw.close();
    }

    public static void printStream() throws IOException{
        FileOutputStream fos = new FileOutputStream("output2.txt");
        PrintStream ps = new PrintStream(fos);
        ps.println("Hello");
        ps.println("Hello");
        ps.println("Hello12");
        ps.println("Hello");
        ps.println("Hello");
        ps.println("Hello2");
        fos.write("HiFi + ".getBytes());
    }
}
