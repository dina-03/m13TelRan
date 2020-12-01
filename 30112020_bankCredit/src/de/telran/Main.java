package de.telran;

public class Main {
    public static void main(String[] args) {
        LoanConsumer client1 = new LoanConsumer("Ivanov", 35, 24000);
        LoanConsumer client2 = new LoanConsumer("Petrov", 17, 30000);
        LoanConsumer client3 = new LoanConsumer("Sidorov", 71, 150000);
        LoanConsumer client4 = new LoanConsumer("Vasechkin", 50, 5000);

        LoanIssuer vasja = new LoanIssuer("Vasiliy", true, true);
        LoanIssuer petja = new LoanIssuer("Petr", false, true);
        LoanIssuer anna = new LoanIssuer("Anna", false, false);

        LoanConsumer[] loanConsumers = {client1, client2, client3, client4};
        LoanIssuer[] loanIssuers = {vasja, petja, anna};

        if (vasja.toIssue(client3)) {
            System.out.println("Employee " + vasja.getName() + " issue a loan to " + client1.getName());
        } else {
            System.out.println("Employee " + vasja.getName() + " does not issue a loan to " + client1.getName());
        }

        if (anna.toIssue(client4)) {
            System.out.println("Employee " + anna.getName() + " issue a loan to " + client4.getName());
        } else {
            System.out.println("Employee " + anna.getName() + " does not issue a loan to " + client4.getName());
        }

        if (anna.toIssue(client1)) {
            System.out.println("Employee " + anna.getName() + " issue a loan to " + client1.getName());
        } else {
            System.out.println("Employee " + anna.getName() + " does not issue a loan to " + client1.getName());
        }

        if (petja.toIssue(client3)) {
            System.out.println("Employee " + petja.getName() + " issue a loan to " + client3.getName());
        } else {
            System.out.println("Employee " + petja.getName() + " does not issue a loan to " + client3.getName());
        }
    }
}
