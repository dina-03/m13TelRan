package de.telran.data;

public class TransformerRulesLength4 extends TransformerRuleLength3{
    @Override
    public boolean check(String input) {
        return input.length() == 4;
    }

    @Override
    public String action(String input) {
        return input.toLowerCase();
    }
}
