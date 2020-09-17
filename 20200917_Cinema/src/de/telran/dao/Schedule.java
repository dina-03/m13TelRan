package de.telran.dao;

import de.telran.data.Cinema;
import de.telran.data.Film;
import de.telran.data.Genre;

import java.time.LocalDate;

public class Schedule {
    private Film[] films;
    private int size;

    public Schedule(int capacity) {
        films = new Film[capacity];
        size = 0;
    }

    public boolean addFilm(Film film) {
        if (size < films.length) {
            films[size] = film;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteFilm(Film film) {
        for (int i = 0; i < size; i++) {
            if (films[i].equals(film)) {
                films[i] = films[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void displayFilms() {
        for (int i = 0; i < size; i++) {
            System.out.println(films[i]);
        }
    }

    public void displayFilmsByCinema(String cinema) {
        System.out.println("In Cinema " + cinema + " you can watch: ");
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (Cinema.isCinemaInArray(cinema, films[i].getCinemas())) {
                System.out.println(films[i].getTitle() + ", " + films[i].getGenre() + "\n" + films[i].getData());
                System.out.println("------");
                flag = true;
            }
        }
            System.out.println((flag) ? "": "no information"); // if(!flag)
    }

    public void displayFilmsByDate(LocalDate date, String cinema){
        System.out.println("You can watch in " + cinema);
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (Cinema.isCinemaInArray(cinema, films[i].getCinemas())) {
                if (films[i].getData().equals(date)) {
                    flag = true;
                    System.out.println(films[i].getData() + ", " + films[i].getGenre() + ", " + films[i].getTitle());
                    System.out.println("------");
                }
            }
        }
        System.out.println((flag) ? "" : "no information");
    }

    public void displayFilmsByGenre(String cinema, Genre genre){
        System.out.println("In cinema " + cinema);
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (Cinema.isCinemaInArray(cinema, films[i].getCinemas())) {
                if (films[i].getGenre().equals(genre)) {
                    flag = true;
                    System.out.println(films[i].getGenre() + ", " + films[i].getTitle() + ", " + films[i].getData());
                    System.out.println("-------");
                }
            }
        }
        System.out.println((flag) ? "" : "no information");
    }
}
