package de.telran;

import java.io.IOException;
import java.util.List;

public interface IPrint {
    void concatenate(List<String> strings, String filename) throws IOException;
}
