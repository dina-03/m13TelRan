package de.telran;

import java.util.Arrays;

public class sortingStudents {
    public static void main(String[] args) {
        int[] marks = {7, 8, 9, 3, 0, 11};
        String[] students = {"Alex", "Waldemar", "Nina", "Katerina", "Ander"};
        Arrays.sort(marks);
        Arrays.sort(students);

        for (int tmp : marks) {
            System.out.print(tmp + "; ");
        }
        System.out.println();
        for (String s : students) {
            System.out.print(s + "; ");
        }
    }
}
