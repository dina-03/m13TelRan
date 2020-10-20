package de.talran.data;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User("Petya", "pass1", new Basket(5));
        User user2 = new User("Kostya", "pass2", new Basket(3));
       // user1.checkUserName(scanner);
        //user1.checkPassword(scanner);
        user1.checkUserNameAndPassword(scanner);

        Product clothing1 = new Product("T-Shirt", 4.99, 4);
        Product clothing2 = new Product("Sports shuttles", 6.99, 5);
        Product clothing3 = new Product("Skirt", 7.99, 3);
        Product furniture1 = new Product("Chair", 75.99, 5);
        Product furniture2 = new Product("Sofa", 179.99, 5);
        Product furniture3 = new Product("Table", 149.99, 4);
        Category clothing = new Category("clothing", new Product[]{clothing1, clothing2, clothing3});
        Category furniture = new Category("furniture", new Product[]{furniture1, furniture2, furniture3});
        Category sport = new Category("sport", new Product[]{new Product("painters", 120.0, 5),
                new Product("T-Shirt-Adidas", 75.00, 5)});

        Category[] catalog = new Category[]{clothing, furniture, sport};

       /* user1.basket.addProduct(user1, clothing2);
        user1.basket.deleteProduct(user1, clothing2);
        System.out.println();
        user1.basket.addProduct(user1, furniture2);
        user1.basket.addProduct(user1, furniture3);
        System.out.println();
        Category.displayCatalog(catalog);
        System.out.println("________");

        Product[] products = new Product[]{clothing1, clothing2, clothing3, furniture1, furniture2, furniture3};

        Category.displayProductCatalogByCategory(clothing);
        System.out.println();
        Category.displayProductCatalogByCategory(furniture);
        System.out.println();
        Category.displayProductCatalogByCategory(sport);
        System.out.println("________");
        Basket.displayProducts(products);
        System.out.println();*/
    }
}
