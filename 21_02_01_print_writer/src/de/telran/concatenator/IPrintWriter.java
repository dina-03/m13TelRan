package de.telran.concatenator;

import de.telran.IConcatenator;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class IPrintWriter implements IConcatenator {
    @Override
    public void concatenate(List<String> strings, String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        PrintWriter pw = new PrintWriter(fos);
        for (String string : strings) {
            pw.println(string);
        }
        pw.close();
    }
}
