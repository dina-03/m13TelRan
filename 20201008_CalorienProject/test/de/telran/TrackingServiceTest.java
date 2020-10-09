package de.telran;

import org.junit.Assert;
import org.junit.Test;

public class TrackingServiceTest {

    TrackingService service = new TrackingService(10);

    @Test
    public void calorieAddingToTotal() {
        service.addCalories(20);
        int total = service.getTotal();
        Assert.assertEquals(20, total);
    }

    @Test
    public void itemAddingToHistory() {
        service.addCalories(30);
        int numberHistory = service.getNumberHistory();
        Assert.assertEquals(1, numberHistory);
    }

    @Test
    public void creatingHistoryItem() {
        service.addCalories(10);
        HistoryItem expectedItem = new HistoryItem(10, "add", 1, 10);
        HistoryItem actualItem = service.getHistory()[0];
        Assert.assertEquals(expectedItem, actualItem);
    }

    @Test
    public void newTrackingServiceLengthHistory() {
        int historyLength = service.getHistory().length;
        Assert.assertEquals(10, historyLength);
    }

    @Test
    public void newTrackingServiceTotalIsZero() {
        Assert.assertEquals("Total is not 0", 0, service.getTotal());
    }

    @Test
    public void caloriesRemovingTotal() {
        service.addCalories(100);
        service.removeCalorie(50);
        Assert.assertEquals(50, service.getTotal());
    }

    @Test
    public void checkNegativeRemoveCalories() {
        service.removeCalorie(50);
        Assert.assertEquals(0, service.getTotal());
    }

    @Test
    public void notNullValueInHistoryByRemove() {
        service.removeCalorie(30);
        Assert.assertNotNull(service.getHistory()[0]);
    }

    @Test
    public void checkTotalByMultiplyOperation() {
        service.addCalories(100);
        service.addCalories(50);
        service.removeCalorie(30);
        Assert.assertEquals(120, service.getTotal());
    }

    @Test
    public void checkHistoryNumberByMultiplyOperation() {
        service.addCalories(100);
        service.addCalories(50);
        service.removeCalorie(30);
        service.addCalories(50);
        service.displayHistory();
        Assert.assertEquals(4, service.getNumberHistory());
    }

    @Test
    public void isGoalMeet() {
        service.setGoal(100);
        service.addCalories(50);
        service.addCalories(20);
        boolean isGoalMeet = service.isGoalMeet();
        Assert.assertTrue(isGoalMeet);
    }

    @Test
    public void isGoalNotMeet() {
        service.setGoal(150);
        service.addCalories(200);
        Assert.assertFalse(service.isGoalMeet());
    }
}