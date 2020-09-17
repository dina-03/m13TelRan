package de.telran.data;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Film {
    private String title;
    private LocalDate data; //year:2020, month:9, day:17  LocalDate date = new LocalDate.of(2020, 9, 17);
    private Genre genre;
    private Cinema[] cinemas;
    //private LocalDate[] dates;

    public Film(String title, LocalDate data, Genre genre, Cinema[] cinemas) {
        this.title = title;
        this.data = data;
        this.genre = genre;
        this.cinemas = cinemas;
        //this.dates = dates;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Cinema[] getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema[] cinemas) {
        this.cinemas = cinemas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Film film = (Film) o;
        return title.equals(film.title) &&
                data.equals(film.data) &&
                genre == film.genre &&
                Arrays.equals(cinemas, film.cinemas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, data, genre);
        result = 31 * result + Arrays.hashCode(cinemas);
        return result;
    }

    @Override
    public String toString() {
        return "Film: " + title +
                ", data: " + data +
                ", genre: " + genre +
                ", cinemas: " + Arrays.toString(cinemas) +
                ';';
    }

    public void displayCinema(){
        for (Cinema c : cinemas) {
            System.out.println(c);
        }
    }
}
