package de.telran.data;

public class TransformerRuleLength6 extends TransformerRuleLength3{
    @Override
    public boolean check(String input) {
        return input.length() == 6;
    }

    @Override
    public String action(String input) {
        return input.replaceAll(input, "******");
    }
}
