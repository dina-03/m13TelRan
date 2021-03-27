package de.telran.string_operation_spring.service.operation;

public class UpperCaseSO implements IStringOperation{
    @Override
    public String operate(String input) {
        return input.toUpperCase();
    }

    @Override
    public String getName() {
        return "upper_case";
    }
}
