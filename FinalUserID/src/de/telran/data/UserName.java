package de.telran.data;

public class UserName {
    private String name;
    private final int ID_NUMBER;
    private static int id_number = 0;

    public UserName(String name) {
        this.name = name;
        ID_NUMBER = ++id_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (ID_NUMBER >= 10) {
            return "name: " + name
                    + ", 0" + ID_NUMBER;
        }
        return "name: " + name
                + ", 00" + ID_NUMBER;
    }
}
