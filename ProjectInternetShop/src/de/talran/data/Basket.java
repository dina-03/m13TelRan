package de.talran.data;

public class Basket {
    private Product[] products;
    private int size;


    public Basket(int capacity) {
        products = new Product[capacity];
    }

    public boolean addProduct(User user, Product product) {
        if (size < products.length) {
            products[size] = product;
            size++;
            System.out.println(user + " basket: " + product.getName() + ", " + product.getPrice());
            return true;
        }
        return false;
    }

    public boolean deleteProduct(User user, Product product) {
        for (int i = 0; i < size; i++) {
            if (products[i].equals(product)) {
                products[i] = products[size - 1];
                size--;
                System.out.println(user + "! " + product.getName() + " has been removed");
                return true;
            }
        }
        return false;
    }

    public static void displayProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
