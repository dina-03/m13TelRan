package de.telran.dao;

import de.telran.data.Admin;
import de.telran.data.Post;
import de.telran.data.User;
import de.telran.data.UserAdmin;

import java.util.Scanner;

public class Forum {
    private Post[] posts;
    private int size;
    private Admin admin;

    public Forum(int capacity, String password) {
        posts = new Post[capacity];
        size = 0;
        this.admin = new Admin(password);
    }

    public int getSize() {
        return size;
    }

    public boolean addPost(Post post) {
        if (size < posts.length) {
            posts[size] = post;
            size++;
            return true;
        }
        return false;
    }

    public Post getPostWithMaxLikes(Post[] posts) {
        Post maxLikes = posts[0];
        for (int i = 0; i < size; i++) {
            if (posts[i].getLike() > maxLikes.getLike()) {
                maxLikes = posts[i];
            }
        }
        return maxLikes;
    }

    public Post[] getLastPostsByAuthor(String author, int numberOfPost) {
        Post[] authorsPost = new Post[numberOfPost];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().getUserName().equalsIgnoreCase(author) && index < numberOfPost) {
                authorsPost[index] = posts[i];
                index++;
            }
        }
        return authorsPost;
    }

    public int getCountLikesByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getTitle().equalsIgnoreCase(title)) {
                return posts[i].getLike();
            }
        }
        return -1;
    }

    public void deletePostByAdmin(Post post, Scanner scanner, User admin) {
        if (!(admin instanceof UserAdmin))
            System.out.println("access is denied");
        else if (((UserAdmin) admin).checkPassword(scanner)) {
            boolean flag = false;
            for (int i = 0; i < size; i++) {
            /*   if (posts[i]== post) {
                    System.out.println("Delete post" + posts[i].getPostID() + "?");
                    System.out.println("press " + post + " if 1 yes or 0 if no");
                    posts[i].setPostID(scanner.nextInt());
                    if (posts[i].equals(post)) {
                        posts[i] = posts[size - 1];
                        size--;
                        System.out.println("post " + posts[i].getPostID() + " removed");
                        flag = true;
                        break;
                    } else if (posts[i].equals(0)) {
                        System.out.println("the post has not been removed");
                        flag = false;
                    }
                }*/
                if (posts[i].equals(post)) {
                    System.out.println("you deleted the post: " + "\n" + post);
                    posts[i] = posts[size - 1];
                    size--;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("post not found");
            }
        } else {
            System.out.println("access is denied");
        }
    }

    public void updatePostByAdmin(int postID, Scanner scanner, User admin) {
        if (!(admin instanceof UserAdmin))
            System.out.println("access is denied");
        else if (((UserAdmin) admin).checkPassword(scanner)) {
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                if (posts[i].getPostID() == postID) {
                    System.out.println("old content: " + posts[i].getContent());
                    System.out.println("Enter new content");
                    posts[i].setContent(scanner.nextLine());
                    System.out.println(postID + " content change to: " + posts[i].getContent());
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("post not found");
            }
        } else {
            System.out.println("access is denied");
        }
    }

    public void updatePostByAdminTwo(int postID, Scanner scanner) {
        if (admin.checkPassword(scanner)) {
            boolean flag = false;
            for (int i = 0; i < size; i++) {
                if (posts[i].getPostID() == postID) {
                    System.out.println("old content: " + posts[i].getContent());
                    System.out.println("Enter new content");
                    posts[i].setContent(scanner.nextLine());
                    System.out.println(postID + " content change to: " + posts[i].getContent());
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("post not found");
            }
        } else {
            System.out.println("access is denied");
        }
    }

    public static void arrayAnyType(Object[] array) {
        for (Object o : array) {
            if (o != null)
            //System.out.print(o.getClass());
            System.out.print(o + " ");
        }
    }

}
