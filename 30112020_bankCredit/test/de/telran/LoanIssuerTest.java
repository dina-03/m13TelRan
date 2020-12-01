package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanIssuerTest {

    LoanConsumer client1 = new LoanConsumer("Ivanov", 35, 24000);
    LoanConsumer client2 = new LoanConsumer("Petrov", 17, 30000);
    LoanConsumer client3 = new LoanConsumer("Sidorov", 71, 150000);
    LoanConsumer client4 = new LoanConsumer("Vasechkin", 50, 5000);
    LoanConsumer client5 = new LoanConsumer("Timofeev", 49, 55000);

    LoanIssuer vasja = new LoanIssuer("Vasiliy", true, true);
    LoanIssuer petja = new LoanIssuer("Petr", false, true);
    LoanIssuer anna = new LoanIssuer("Anna", false, false);

    @org.junit.jupiter.api.Test
    public void testToIssue_LazyAndKind_TrueCase(){
        assertTrue(vasja.toIssue(client1));
    }

    @Test
    public void testToIssue_LazyAndKind_FalseCase(){
        assertFalse(vasja.toIssue(client2));
    }

    @Test
    public void testToIssue_NotLazyNotKind_FalseCase(){
        assertFalse(anna.toIssue(client4));
    }

    @Test
    public void testToIssue_LazyNotKind_TrueCase(){
        assertTrue(petja.toIssue(client1));
    }

    @Test
    public void testToIssue_LazyNotKind_FalseCase(){
        assertFalse(petja.toIssue(client3));
    }

    @Test
    public void testToIssue_NotLazyNotKind_TrueCase(){
        assertTrue(anna.toIssue(client5));
    }
}