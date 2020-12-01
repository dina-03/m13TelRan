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

    /**
     * This issuer decides whether to provide a loan to the customer by the following rules:
     * 1. If the customer earns less then 20000 gold or he is younger then 20 y.o. then no loan may be provided.
     * 2. If the issuer is lazy, then matching these two condition would be enough for him to provide a loan
     * (meaning, the customer earns >= 20000 gold and he is 18 or older)
     * 3. Else if this issuer is kind, they provide a loan if the customer is younger then 70 y.0.
     * 4. Else this issuer provides the loan in case if the customer is younger than 50 y.0.
     *
     * @param consumer
     *         the customer whom to provide a loan
     * @return wh
     */
    public boolean toIssue(LoanConsumer consumer) {
        if (consumer.getAge() >= 18 && consumer.getAnnualIncome() >= 20000){
            if (this.isLazy)
                return true;

            if (consumer.getAge() < 50)
                return true;

            if (this.isKind && consumer.getAge() < 70)
                return true;
        }
            return false;
        //2 вариант:
        /*if (consumer.getAge() < 18 || consumer.getAnnualIncome() < 20000)
            return false;
        if (this.isLazy)
            return true;

        if (consumer.getAge() < 50)
            return true;

        if (this.isKind && consumer.getAge() < 70)
            return true;

        return false;*/
    }



   /* public boolean toIssue(LoanConsumer consumer) {
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
            return consumer.getAge() < 70 && consumer.getAnnualIncome() > 20000;
    }

    public boolean isNotLazyClercAndNotKind(LoanConsumer consumer) {
        if (consumer.getAge() < 18 || consumer.getAnnualIncome() < 20000) {
            return false;
        }
        return consumer.getAge() < 50 || consumer.getAnnualIncome() > 20000;
    }*/

}
