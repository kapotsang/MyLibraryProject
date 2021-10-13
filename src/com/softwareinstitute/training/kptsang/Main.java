package com.softwareinstitute.training.kptsang;

public class Main{

    public static void main(String[] args){

    Fiction fiction = new Fiction();
    fiction.setName("Nineteen Eighty Four");
    fiction.available();
    fiction.Author("George Orwell");
    fiction.Pages(328);
    fiction.genre("Dystopian");
    Movie movie = new Movie();
    movie.setName("Kill Bill");
    movie.available();
    movie.Director("Quentin Tarantino");



    }

}
