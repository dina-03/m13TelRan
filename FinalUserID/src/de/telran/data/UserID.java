package de.telran.data;

public class UserID {
    private final int ID_NUMBER;

    public UserID(int ID_NUMBER) {
        this.ID_NUMBER = ID_NUMBER;
    }

    @Override
    public String toString() {
        return ", ID: 00" + ID_NUMBER +
                ';';
    }
}
