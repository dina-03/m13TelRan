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

    @Test
    public void testToIssue_lazyAndKindIssuer_providesEverybodyOlder18AndEarningMoreOrEqualThan20000() {
        LoanIssuer issuer = new LoanIssuer("Vasily", true, true);

        LoanConsumer customerMiddleAged = new LoanConsumer("Arkady", 35, 20000);
        LoanConsumer customerOlderAged = new LoanConsumer("Fuka", 50, 20000);
        LoanConsumer customerOlderAgedOlder = new LoanConsumer("Varlam", 55, 20000);
        LoanConsumer customerSenior = new LoanConsumer("Karp", 70, 20000);
        LoanConsumer customerUndead = new LoanConsumer("Koschey", 200, 20000);

        assertTrue(issuer.toIssue(customerMiddleAged));
        assertTrue(issuer.toIssue(customerOlderAged));
        assertTrue(issuer.toIssue(customerOlderAgedOlder));
        assertTrue(issuer.toIssue(customerSenior));
        assertTrue(issuer.toIssue(customerUndead));
    }

    @Test
    public void testToIssue_lazyAndEvilIssuer_providesEverybodyOlder18AndEarningMoreOrEqualThan20000() {
        LoanIssuer issuer = new LoanIssuer("Vasily", true, false);

        LoanConsumer customerMiddleAged = new LoanConsumer("Arkady", 35, 20000);
        LoanConsumer customerOlderAged = new LoanConsumer("Fuka", 50, 20000);
        LoanConsumer customerOlderAgedOlder = new LoanConsumer("Varlam", 55, 20000);
        LoanConsumer customerSenior = new LoanConsumer("Karp", 70, 20000);
        LoanConsumer customerUndead = new LoanConsumer("Koschey", 200, 20000);

        assertTrue(issuer.toIssue(customerMiddleAged));
        assertTrue(issuer.toIssue(customerOlderAged));
        assertTrue(issuer.toIssue(customerOlderAgedOlder));
        assertTrue(issuer.toIssue(customerSenior));
        assertTrue(issuer.toIssue(customerUndead));
    }

    @Test
    public void testToIssue_lazyAndEvilIssuer_notProvidesEverybodyOlder18AndEarningLessThan20000() {
        LoanIssuer issuer = new LoanIssuer("Vasily", false, true);

        LoanConsumer customerMiddleAged = new LoanConsumer("Arkady", 35, 19999);
        LoanConsumer customerOlderAged = new LoanConsumer("Fuka", 50, 19999);
        LoanConsumer customerOlderAgedOlder = new LoanConsumer("Varlam", 55, 19000);
        LoanConsumer customerSenior = new LoanConsumer("Karp", 70, 19000);
        LoanConsumer customerUndead = new LoanConsumer("Koschey", 200, 19000);

        assertFalse(issuer.toIssue(customerMiddleAged));
        assertFalse(issuer.toIssue(customerOlderAged));
        assertFalse(issuer.toIssue(customerOlderAgedOlder));
        assertFalse(issuer.toIssue(customerSenior));
        assertFalse(issuer.toIssue(customerUndead));
    }

    @Test
    public void testToIssue_lazyAndKindIssuer_notProvidesEverybodyOlder18AndEarningLessThan20000() {
        LoanIssuer issuer = new LoanIssuer("Vasily", true, true);

        LoanConsumer customerMiddleAged = new LoanConsumer("Arkady", 35, 19999);
        LoanConsumer customerOlderAged = new LoanConsumer("Fuka", 50, 19999);
        LoanConsumer customerOlderAgedOlder = new LoanConsumer("Varlam", 55, 19000);
        LoanConsumer customerSenior = new LoanConsumer("Karp", 70, 19000);
        LoanConsumer customerUndead = new LoanConsumer("Koschey", 200, 19000);

        assertFalse(issuer.toIssue(customerMiddleAged));
        assertFalse(issuer.toIssue(customerOlderAged));
        assertFalse(issuer.toIssue(customerOlderAgedOlder));
        assertFalse(issuer.toIssue(customerSenior));
        assertFalse(issuer.toIssue(customerUndead));
    }

    @Test
    public void testToIssue_lazyAndKindIssuer_notProvidesEverybodyYounger18() {
        LoanIssuer issuer = new LoanIssuer("Vasily", true, true);

        LoanConsumer customerYoungFewGold = new LoanConsumer("Arkady", 17, 19999);
        LoanConsumer customerYoungNormalGold = new LoanConsumer("Arkady", 17, 21000);

        assertFalse(issuer.toIssue(customerYoungFewGold));
        assertFalse(issuer.toIssue(customerYoungNormalGold));
    }

    @Test
    public void testToIssue_lazyAndEvilIssuer_notProvidesEverybodyYounger18() {
        LoanIssuer issuer = new LoanIssuer("Vasily", false, true);

        LoanConsumer customerYoungFewGold = new LoanConsumer("Arkady", 17, 19999);
        LoanConsumer customerYoungNormalGold = new LoanConsumer("Arkady", 17, 21000);

        assertFalse(issuer.toIssue(customerYoungFewGold));
        assertFalse(issuer.toIssue(customerYoungNormalGold));
    }

    @Test
    public void testToIssue_activeAndEvilIssuer_provides() {
        LoanIssuer issuer = new LoanIssuer("Vasily", false, false);

        LoanConsumer customerMiddleAged = new LoanConsumer("Arkady", 25, 20000);
        LoanConsumer customerAlmostOlderAged = new LoanConsumer("Arkady Georgievich", 49, 25000);

        assertTrue(issuer.toIssue(customerMiddleAged));
        assertTrue(issuer.toIssue(customerAlmostOlderAged));
    }

    @Test
    public void testToIssue_activeAndEvilIssuer_notProvides() {
        LoanIssuer issuer = new LoanIssuer("Vasily", false, false);

        LoanConsumer customerMiddleAgedFewGold = new LoanConsumer("Arkady", 25, 19999);
        LoanConsumer customerAlmostOlderAgedFewGold = new LoanConsumer("Arkady Georgievich", 49, 19999);
        LoanConsumer customerOlderAgedFewGold = new LoanConsumer("Arkady Georgievich", 50, 19999);
        LoanConsumer customerSeniorFewGold = new LoanConsumer("Arkady Georgievich", 70, 19999);

        LoanConsumer customerYoungButReach = new LoanConsumer("Arkady Junior", 17, 25000);
        LoanConsumer customerOlderNormalGold = new LoanConsumer("Arkady Georgievich", 50, 25000);

        assertFalse(issuer.toIssue(customerMiddleAgedFewGold));
        assertFalse(issuer.toIssue(customerAlmostOlderAgedFewGold));
        assertFalse(issuer.toIssue(customerOlderAgedFewGold));
        assertFalse(issuer.toIssue(customerOlderNormalGold));
        assertFalse(issuer.toIssue(customerSeniorFewGold));
        assertFalse(issuer.toIssue(customerYoungButReach));
    }

    @Test
    public void testToIssue_activeAndKindIssuer_provides() {
        LoanIssuer issuer = new LoanIssuer("Vasily", true, false);

        LoanConsumer customerMiddleAged = new LoanConsumer("Arkady", 25, 20000);
        LoanConsumer customerAlmostOlderAged = new LoanConsumer("Arkady Georgievich", 49, 25000);
        LoanConsumer customerOlderAged = new LoanConsumer("Arkady Georgievich", 69, 25000);

        assertTrue(issuer.toIssue(customerMiddleAged));
        assertTrue(issuer.toIssue(customerAlmostOlderAged));
        assertTrue(issuer.toIssue(customerOlderAged));
    }

    @Test
    public void testToIssue_activeAndKindIssuer_notProvides() {
        LoanIssuer issuer = new LoanIssuer("Vasily", false, false);

        LoanConsumer customerMiddleAgedFewGold = new LoanConsumer("Arkady", 25, 19999);
        LoanConsumer customerAlmostOlderAgedFewGold = new LoanConsumer("Arkady Georgievich", 49, 19999);
        LoanConsumer customerOlderAgedFewGold = new LoanConsumer("Arkady Georgievich", 50, 19999);
        LoanConsumer customerSeniorFewGold = new LoanConsumer("Arkady Georgievich", 70, 19999);

        LoanConsumer customerYoungButReach = new LoanConsumer("Arkady Junior", 17, 25000);
        LoanConsumer customerOlderNormalGold = new LoanConsumer("Arkady Georgievich", 70, 25000);

        assertFalse(issuer.toIssue(customerMiddleAgedFewGold));
        assertFalse(issuer.toIssue(customerAlmostOlderAgedFewGold));
        assertFalse(issuer.toIssue(customerOlderAgedFewGold));
        assertFalse(issuer.toIssue(customerOlderNormalGold));
        assertFalse(issuer.toIssue(customerSeniorFewGold));
        assertFalse(issuer.toIssue(customerYoungButReach));
    }
}