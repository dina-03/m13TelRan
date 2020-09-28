package de.telran.app;

import de.telran.data.DateValidator;
import de.telran.data.ImplementationDteValidator;

public class DateValidatorApp {
    public static void main(String[] args) {
        System.out.println(DateValidator.dateValidator(2020, 2, 31));
        System.out.println(DateValidator.dateValidator(2020, 2, 29));
        System.out.println(DateValidator.dateValidator(2019, 2, 29));
        System.out.println(DateValidator.dateValidator(2016, 14, 29));
        System.out.println(DateValidator.dateValidator(2016, 12, 30));
        System.out.println(DateValidator.dateValidator(2017, 2, 28));
        System.out.println(DateValidator.dateValidator(2017, 10, 10));
        System.out.println(DateValidator.dateValidator(2000, 1, 1));
        System.out.println("-------------");
        System.out.println(new ImplementationDteValidator(2020, 2, 31).date());
        System.out.println(new ImplementationDteValidator(2020, 2, 29).date());
        System.out.println(new ImplementationDteValidator(2019, 2, 29).date());
        System.out.println(new ImplementationDteValidator(2016, 14, 29).date());
        System.out.println(new ImplementationDteValidator(2016, 12, 30).date());
        System.out.println(new ImplementationDteValidator(2017, 2, 28).date());
        System.out.println(new ImplementationDteValidator(2017, 10, 10).date());
        System.out.println(new ImplementationDteValidator(2000, 1, 1).date());
    }
}
