package de.telran.data;

public class Tree extends Plant {
    private final static int TREE_GROW_PER_SEASON = 50;

    public Tree(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public int getGrowPerSEASON() {
        return TREE_GROW_PER_SEASON;
    }

    @Override
    protected void doSummer() {
        setHeight(getHeight() + TREE_GROW_PER_SEASON);
        System.out.println(getName() + " has grow up in Summer to " + getHeight());
    }

    @Override
    protected void doAutumn() {
        setHeight(getHeight() + TREE_GROW_PER_SEASON / 2);
        System.out.println(getName() + " has grow up in Autumn to " + getHeight());
    }
}
