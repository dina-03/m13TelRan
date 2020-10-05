package de.telran.data;

public class TransformerRuleLength3 {
    public boolean check(String input){
        return input.length() == 3;
    }

    public String action(String input){
        return input.toUpperCase();
    }
}
