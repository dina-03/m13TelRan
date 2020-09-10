import java.util.Arrays;
import java.util.Scanner;

public class HelloStringName {
    public static void main(String[] args) {
        String[] arrayName = {"Petya", "Kolya", "Olya", "Katya", "Sveta", "Masha"};
        usersName(arrayName);
    }

    public static void usersName(String[] arrayName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce yourself: ");
        String name = scanner.next();
        boolean find = true;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i].equalsIgnoreCase(name)) {
                find = false;
                System.out.println("Hello, " + arrayName[i] + ", how are you?");
                break;
            }
        }
        if (find) {
            System.out.println("Sorry, we're not acquainted");
        }
        scanner.close();
    }
}
