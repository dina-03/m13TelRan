package de.telran.data;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int dateOfIssue;
    private int page;

    public Book(String title, String author, int dateOfIssue, int page) {
        this.title = title;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
        this.page = page;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return dateOfIssue == book.dateOfIssue &&
                page == book.page &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, dateOfIssue, page);
    }

    @Override
    public String toString() {
        return "Book: " +
                "" + title +
                ", " + author +
                ", " + dateOfIssue +
                ", " + page +
                ';';
    }
}
