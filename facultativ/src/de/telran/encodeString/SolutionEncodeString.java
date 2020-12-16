package de.telran.encodeString;

/**
 * The solution solves the problem of encoding a string. The string may contain only small letters
 */
public class SolutionEncodeString {
    public String solve(String string) {
        StringBuilder builder = new StringBuilder();
        int currentCharQty = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                currentCharQty++;
            } else {
                builder.append(string.charAt(i - 1));
                if (currentCharQty > 1) {
                    builder.append(currentCharQty);
                    currentCharQty = 1;
                }

            }
        }
        builder.append(string.charAt(string.length() - 1));
        if (currentCharQty > 1) {
            builder.append(currentCharQty);
        }
        return builder.toString();
    }
}
