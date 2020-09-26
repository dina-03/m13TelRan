package de.telran.data;

public class Post {
    private User author;
    private int postID;
    private static int totalPosts = 0;
    private String title;
    private String content;
    private int like = 0;
    private int disLike = 0;

    public Post(User author, String title, String content) {
        this.author = author;
        this.postID = ++totalPosts;
        this.title = title;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public static int getTotalPosts() {
        return totalPosts;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getLike() {
        return like;
    }

    public int getDisLike() {
        return disLike;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post ID " + postID +
                ", posted by " + author +
                ", " + title.toUpperCase() +
                ",\n" + content +
                "\nlike=" + like +
                "\ndisLike=" + disLike;
    }

    public int addLike(){
        return like++;  //for (int i; i < 10; i++)
    }

    public int addDisLike(){
        return disLike++;
    }
}
