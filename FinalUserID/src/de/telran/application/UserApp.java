package de.telran.application;

import de.telran.data.UserID;
import de.telran.data.UserName;

public class UserApp {
    public static void main(String[] args) {
        UserName user1 = new UserName("Lukas Bone");
        UserName user2 = new UserName("Anna Bank");
        UserName user3 = new UserName("Igor Flach");
        UserName user4 = new UserName("Susanna Max");

        UserID userID01 = new UserID(001);
        UserID userID02 = new UserID(002);
        UserID userID03 = new UserID(003);
        UserID userID04 = new UserID(004);

        System.out.println(user1.getName() + userID01);
        System.out.println(user2.getName() + userID02);
        System.out.println(user3.getName() + userID03);
        System.out.println(user4.getName() + userID04);
    }
}
