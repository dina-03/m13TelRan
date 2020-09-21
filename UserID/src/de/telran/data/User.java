package de.telran.data;

public class User {
    private String name;
    private static int userID;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int userID(){
        userID++;
        return userID;
    }

    @Override
    public String toString() {
        return "name: " + name + ", ID: 00" + userID();
    }
}
