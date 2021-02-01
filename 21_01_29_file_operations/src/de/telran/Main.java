package de.telran;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        FileOperations fo = new FileOperations();
        List<String> strings = Arrays.asList("Hello","world","friends");
        fo.writeStrings(strings, "strings.txt");
       /* byte[] bytes = new byte[]{1, 2, 3};
        fo.writeBytes(bytes, "output.txt");
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "banana", "apple", "orange");
        fo.writeStrings(strings, "outputStrings.txt");
        System.out.println(fo.readStrings("inputStrings.txt"));
        List<Integer> numbers = Arrays.asList(456, 2, 13);
        fo.writeInts(numbers, "outputNumbers.txt");
        System.out.println(fo.readInts("inputNumbers.txt"));*/
    }
}
