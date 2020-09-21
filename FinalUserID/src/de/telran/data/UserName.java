package de.telran.data;

public class UserName {
    private String name;
    private UserID userID;

    public UserName(String name) {
        this.name = name;
        this.userID = getUserID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserID getUserID() {
        return userID;
    }


    @Override
    public String toString() {
        return "name: " + name +
                ", ID: " + userID +
                ';';
    }
}
