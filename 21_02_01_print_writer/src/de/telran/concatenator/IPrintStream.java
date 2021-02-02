package de.telran.concatenator;

import de.telran.IPrint;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class IPrintStream implements IPrint {
    @Override
    public void concatenate(List<String> strings, String filename) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename)) {

            PrintStream ps = new PrintStream(fos);
            for (String string : strings) {
                ps.println(string);
            }
            ps.close();
        }
    }
}
