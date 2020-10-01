package de.telran.data;

public abstract class Plant {
    private String name;
    private int age;
    private int height;

    public Plant(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge() {
        this.age++;
    }

    public abstract int getGrowPerSEASON();
    public void doYear(){
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
    }

    private void doWinter() {
        System.out.println(getName() + " is not growing in Winter, height is " + getHeight());
    }

    private void doSpring(){
        addYearToAge();
        System.out.println(getName() + " at the beginning the height is: " + getHeight());
        setHeight(getHeight() + getGrowPerSEASON());
        System.out.println(getName() + " has grow up to " + getHeight());
    }

    protected abstract void doSummer();
    protected abstract void doAutumn();

    @Override
    public String toString() {
        return "Plant: " + name +
                ", age: " + age +
                ", height: " + height;
    }
    public void growPlantForPeriodOfYears(int years){
        for (int i = 0; i < years; i++) {
            this.doYear();
            System.out.println("-----------");
        }
    }
}
