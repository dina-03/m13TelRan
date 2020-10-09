package de.telran;

public class Dog {
    private String name;
    private int age;

    static {
        System.out.println("I'm static");
    }

    {
        name = "Sharik";
        age = 5;
        System.out.println("text");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Dog dog = new Dog("Sharik", 5)
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Bobik", 2);
        System.out.println(dog1.name);
        System.out.println(dog2.name + " " + dog2.age + " age");
    }
}
