package de.telran.data;

public abstract class Animals {
    protected String type;
    private Color color;
    private int age;

    public Animals(String type, Color color, int age) {
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void split() {
        System.out.println("--------");
    }

    @Override
    public String toString() {
        return type + '\n' + "color: " + color + '\n' +
                "age: " + age + "\n";
    }

    public static Animals[] getAnimalsByColor(Animals[] animals, Color color) {
        Animals[] animalsByColor = new Animals[numberAnimalsByColor(animals, color)];
        int index = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getColor().equals(color)) {
                animalsByColor[index] = animals[i];
                index++;
            }
        }
        return animalsByColor;
    }

    private static int numberAnimalsByColor(Animals[] animals, Color color) {
        int count = 0;
        for (Animals a : animals) {
            if (a.getColor().equals(color))
                count++;
        }
        return count;
    }

    public static Animals[] getAnimalsByType(Animals[] animals, String type) {
        Animals[] animalsByType = new Animals[countAnimalsByType(animals, type)];
        int index = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getClass().getSimpleName().equalsIgnoreCase(type.replace(" ", "")) ||
                    animals.getClass().getSimpleName().contains(type)) {
                animalsByType[index] = animals[i];
                index++;
            }
        }
        return animalsByType;
    }

    private static int countAnimalsByType(Animals[] animals, String type) {
        int count = 0;
        for (Animals a : animals) {
            if (a.getClass().getSimpleName().equalsIgnoreCase(type.replace(" ", "")) ||
                    a.getClass().getSimpleName().contains(type)) {
                count++;
            }
        }
        return count;
    }

    public static void printArray(Object[] objects) {
        for (Object o : objects) {
            System.out.println(o);
            System.out.println("-----------------");
        }
    }
}
