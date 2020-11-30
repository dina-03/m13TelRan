package de.telran;

public class LoanIssuer {
    private String name;
    private boolean isLazy;
    private boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public String getName() {
        return name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public boolean isKind() {
        return isKind;
    }

    //TODO implement
    public boolean toIssue(LoanConsumer consumer) {
        if (isLazy) {
            return isLazyClerc(consumer);
        } else if (isKind) {
            return isNotLazyClercButKind(consumer);
        } else {
            return isNotLazyClercAndNotKind(consumer);
        }
    }

    public boolean isLazyClerc(LoanConsumer consumer) {
        return consumer.getAge() >= 18 && consumer.getAnnualIncome() >= 20000;
    }

    public boolean isNotLazyClercButKind(LoanConsumer consumer) {
        if (consumer.getAge() < 18 || consumer.getAnnualIncome() < 20000) {
            return false;
        }
        return consumer.getAge() < 70 || consumer.getAnnualIncome() > 20000;
    }

    public boolean isNotLazyClercAndNotKind(LoanConsumer consumer) {
        if (consumer.getAge() < 18 || consumer.getAnnualIncome() < 20000) {
            return false;
        }
        return consumer.getAge() < 50 || consumer.getAnnualIncome() > 20000;
    }
}
