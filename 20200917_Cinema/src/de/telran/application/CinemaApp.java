package de.telran.application;

import de.telran.dao.Schedule;
import de.telran.data.Address;
import de.telran.data.Cinema;
import de.telran.data.Film;
import de.telran.data.Genre;

import java.time.LocalDate;

public class CinemaApp {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("Stella");
        Cinema cinema2 = new Cinema("Thalia", new Address("Hauptstrasse", 16));
        Address address = new Address("Berlinerstrasse", 10);
        Cinema cinema3 = new Cinema("Astra", address);
        Cinema cinema4 = new Cinema("Cinemax", new Address("Alexanderplatz", 1));
        cinema1.setAddress(new Address("Wasserturmstrasse", 5));
        /*cinema1.getAddress().setStreet("Wasserturmstrasse");
        cinema1.getAddress().setHouseNumber(5);*/

        Cinema[] cinemas = {cinema1, cinema2, cinema3, cinema4};
        Cinema[] cinemas1 = {cinema3, cinema4};
        Cinema[] cinemas2 = {cinema1, cinema3};
        Film film1 = new Film("Harry Potter", LocalDate.of(2020, 9, 17), Genre.ADVENTURE,cinemas2);
        Film film2 = new Film("Titanic", LocalDate.of(2020, 10, 3), Genre.DRAMA, cinemas);
        Film film3 = new Film("Hail Ceaser", LocalDate.of(2020, 10, 5), Genre.COMEDY, cinemas1);
        Film film4 = new Film("Forsage", LocalDate.of(2020, 10, 1), Genre.THRILLER, cinemas2);
        Film film5 = new Film("Green Book", LocalDate.of(2020, 10, 18), Genre.DRAMA, cinemas);
        Film film6 = new Film("Underworld: Blood Wars", LocalDate.of(2020, 10, 1), Genre.ACTION, cinemas);
        Film film7 = new Film("Titans", LocalDate.of(2020, 10, 18), Genre.ACTION, cinemas1);
        Film film8 = new Film("Ein Taunuskrimi", LocalDate.of(2020, 10, 3), Genre.CRIME, cinemas2);
        Schedule schedule = new Schedule(50);
        schedule.addFilm(film1);
        schedule.addFilm(film2);
        schedule.addFilm(film3);
        schedule.addFilm(film4);
        schedule.addFilm(film5);
        schedule.addFilm(film6);
        schedule.addFilm(film7);
        schedule.addFilm(film8);
        //schedule.displayFilms();
        /*schedule.displayFilmsByCinema("Stella");
        System.out.println("*******************");
        schedule.displayFilmsByCinema("Astra");*/
        schedule.displayFilmsByDate(LocalDate.of(2020, 10, 18), "Thalia");
        schedule.displayFilmsByGenre( Genre.ACTION);
        schedule.displayFilmsByGenre(Genre.CRIME);
        schedule.displayFilmsByDate(LocalDate.of(2020,12,12), "Astra");
        System.out.println("----");
        schedule.displayFilmsByGenre(Genre.DRAMA);
       /* Film[] films = {film1, film2, film3, film4, film5,film6,film7,film8};
        schedule.displayFilmsByDate(films, LocalDate.of(2020, 9, 20));
        schedule.displayFilmsByDate(films, LocalDate.of(2020, 10, 18));
        schedule.displayFilmsByDate(films, LocalDate.of(2020, 9, 17));

        schedule.displayFilmsByGenre(films, Genre.ADVENTURE);
        schedule.displayFilmsByGenre(films, Genre.DRAMA);
        schedule.displayFilmsByGenre(films, Genre.THRILLER);*/
    }
}
