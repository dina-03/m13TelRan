package de.telran.data;

public class User {
    private String name;
    private final int userID;
    private static int userIDNumber = 1;

    public User(String name) {
        this.name = name;
        userID = userIDNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        if (userID >= 10){
            return "name: " + name + ", ID: 0" + userID;
        }
            return "name: " + name + ", ID: 00" + userID;
    }
}
