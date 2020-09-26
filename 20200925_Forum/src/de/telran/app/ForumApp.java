package de.telran.app;

import de.telran.dao.Forum;
import de.telran.data.Post;
import de.telran.data.User;
import de.telran.data.UserAdmin;

import java.util.Scanner;

public class ForumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User("Vasya", 28);
        User user2 = new User("Masha", 25);
        User user3 = new User("Jura dj", 20);
        User user4 = new User("Julia", 29);
        User user5 = new User("Ivan", 35);
        User user6 = new User("Nadejda", 42);
        User user7 = new User("kosta", 33);
        UserAdmin admin = new UserAdmin("Max", 32, "pass");
        Post post1 = new Post(user1, "Post1", "Далеко-далеко за словесными горами\n в стране гласных и согласных " +
                "живут рыбные тексты. ");
        Post post2 = new Post(user2, "Post2", "Today is beautiful day");
        Post post3 = new Post(user3, "Post3",
                "Вдали от всех живут они в буквенных домах на берегу Семантика ");
        Post post4 = new Post(user5, "Post4", "Hello People!!! I am SuperMan!!!");
        Post post5 = new Post(user1, "Post5", "Грустный риторический вопрос\nскатился по его щеке и он продолжил " +
                "свой путь.");
        Post post6 = new Post(user6, "Post5",
                "Маленький ручеек Даль журчит по всей стране ");
        Post post7 = new Post(user7, "Post5",
                "Эта парадигматическая страна ...");
        Post post8 = new Post(user4, "Post5", "Даже всемогущая пунктуация не имеет власти над рыбными текстами ");
        Post post9 = new Post(admin, "Post6", "Hello People!!! I am admin");

        Forum forum = new Forum(100);
        forum.addPost(post1);
        forum.addPost(post2);
        forum.addPost(post3);
        forum.addPost(post4);
        forum.addPost(post5);
        forum.addPost(post6);
        forum.addPost(post7);
        forum.addPost(post8);
        forum.addPost(post9);

        //System.out.println(post1.getLike());
        post1.addLike();
        post1.addLike();
        post1.addLike();
        post1.addLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addDisLike();
        post5.addLike();
        // System.out.println(post1.getLike());
        // System.out.println(post1);
        System.out.println("-----");
        // forum.updatePostByAdmin(post6.getPostID(), scanner);
        // System.out.println(post6.getContent());
        forum.deletePostByAdmin(post5, scanner);

        System.out.println("-----");

      /*  System.out.println(admin);
        System.out.println(user1);
*/
        scanner.close();
    }
}
