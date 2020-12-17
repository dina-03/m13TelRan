package de.telran;

public class StringBufferConcatenator implements IConcatenator {
    @Override
    public void concatenate(String[] arrayToConcatenate) {
        StringBuffer builder = new StringBuffer();
        for (String str : arrayToConcatenate) {
            builder.append(str);
        }
        builder.toString();
    }
}
