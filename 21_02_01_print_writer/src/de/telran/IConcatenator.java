package de.telran;

import java.io.IOException;
import java.util.List;

public interface IConcatenator {
    void concatenate(List<String> strings, String filename) throws IOException;
}
