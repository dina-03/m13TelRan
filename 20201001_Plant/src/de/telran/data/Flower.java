package de.telran.data;

public class Flower extends Plant {
    private final static int FLOWER_GROW_PER_SEASON = 40;

    public Flower(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public int getGrowPerSEASON() {
        return FLOWER_GROW_PER_SEASON;
    }

    @Override
    protected void doSummer() {
        System.out.println(getName() + " is not grown in Summer, but blossoms");
    }

    @Override
    protected void doAutumn() {
        setHeight(2);
        System.out.println(getName() + " is cut to 2 cm in Autumn, height is " + getHeight());
    }
}
