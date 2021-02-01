package de.telran;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileOperationsTest {
    FileOperations fileOperations = new FileOperations();
    final String FILE_BYTE = "FileTestByte.txt";
    final String FILE_STRING = "FileTestString.txt";
    final String FILE_INT = "FileTestInteger.txt";

    @Test
    public void testWriteReadStrings() throws IOException {
        FileOperations fo = new FileOperations();
        List<String> strings = Arrays.asList("Hello", "world", "friends");
        fo.writeStrings(strings, "strings.txt");
    }

    @Test
    void writeStrings() throws IOException {
        List<String> list = Arrays.asList("Тише, мыши, кот на крыше", "а котята ещё выше.",
                "Кот пошёл за молоком,",
                "а котята кувырком.",
                "Кот пришёл без молока,",
                "а котята ха-ха-ха.");

        fileOperations.writeStrings(list, FILE_STRING);
    }

    @Test
    void readStrings() throws IOException {
        List<String> list = Arrays.asList("Тише, мыши, кот на крыше", "а котята ещё выше.",
                "Кот пошёл за молоком,",
                "а котята кувырком.",
                "Кот пришёл без молока,",
                "а котята ха-ха-ха.");

        List<String> listFile = fileOperations.readStrings(FILE_STRING);
        assertEquals(list, listFile);
    }

    @Test
    void writeInts() throws IOException {
        List<Integer> listInt = Arrays.asList(10, 20, 30, 45);
        fileOperations.writeInts(listInt, FILE_INT);
    }

    @Test
    void writeBytes() throws IOException {
        byte[] arr = {78, 10, 65, 10, 85, 90};
        fileOperations.writeBytes(arr, FILE_BYTE);
    }

    @Test
    void readBytes() throws IOException {
        byte[] arr = {78, 10, 65, 10, 85, 90};
        byte[] fileByte = fileOperations.readBytes(FILE_BYTE);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], fileByte[i]);
        }
    }

    @Test
    public void testWriteReadInts() throws IOException {
        List<Integer> ints = Arrays.asList(120, 350, 3534);
        fileOperations.writeInts(ints, "integer.txt");
        List<Integer> readInts = fileOperations.readInts("integer.txt");
        assertEquals(ints, readInts);
    }
}