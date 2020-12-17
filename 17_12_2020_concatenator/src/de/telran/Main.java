package de.telran;

public class Main {
    public static void main(String[] args) {
        /*String res = "";
       long beforeConcatination = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            res+= "EG";
        }
        long timeConcatenated = System.currentTimeMillis() - beforeConcatination;
        System.out.println(timeConcatenated);*/

        IConcatenator stringConcatinator = new StringConcatenator();
        IConcatenator stringBuilderConcatinator = new StringBuilderConcatenator();
        IConcatenator stringBufferConcatinator = new StringBuilderConcatenator();

        ConcatenationTester test = new ConcatenationTester(stringConcatinator);

       // test.test(100000, "EG");
        test = new ConcatenationTester(stringBuilderConcatinator);
        test.test(1000000, "EG");
        test = new ConcatenationTester(stringBufferConcatinator);
        test.test(1000000, "EG");
    }
}
