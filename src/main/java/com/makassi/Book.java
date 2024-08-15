package com.makassi;

public class Book {
    public int id;
    public String title;
    public String Autor;
    public int yearOfPublication;
    public String genre;

    public Book(int id, String title, String autor, int yearOfPublication, String genre) {
        this.id = id;
        this.title = title;
        Autor = autor;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }
}
