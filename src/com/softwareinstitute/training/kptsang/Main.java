package com.softwareinstitute.training.kptsang;

import java.sql.SQLOutput;

public class Main{

    public static void main(String[] args){

        Fiction fiction = new Fiction("Nineteen Eighty Four", "George Orwell", 328, "Dystopian");
        System.out.println("Title: "+ fiction.getName() +", written by " + fiction.getAuthor()+", "+fiction.getPages()+" pages, and this book is "+ fiction.getGenre());

        Fiction fiction1 = new Fiction("Call of Cthulu", "HP Lovecraft", 420, "horror");
        System.out.println("Title: "+ fiction1.getName() +", written by " + fiction1.getAuthor()+", "+fiction1.getPages()+" pages, and this book is "+ fiction1.getGenre());

        NonFiction nonfiction = new NonFiction("LEGO Star Wars Visual Dictionary", "DK", 160, "Lego");
        System.out.println("Title: "+ nonfiction.getName() +", written by "+ nonfiction.getAuthor()+ ", " + nonfiction.getPages()+ " pages, this book is about " +nonfiction.getTopic());

        Movie movie = new Movie("Kill Bill", 2, "Quentin Tarantino", 215, 2004);
        System.out.println("Title: "+ movie.getName()+", released "+ movie.getReleaseYear()+", directed by "+movie.getDirector()+", "+ movie.getNoOfDiscs()+" disc(s), runs for "+movie.getRuntime()+ " minutes");

        Movie movie1 = new Movie("The Lighthouse", 1, "Robert Eggers", 110, 2019);
        System.out.println("Title: "+ movie1.getName()+", released "+ movie1.getReleaseYear()+", directed by "+movie1.getDirector()+", "+ movie1.getNoOfDiscs()+" disc(s), runs for "+movie1.getRuntime()+ " minutes");

        TVShow tvshow = new TVShow("Seinfeld", 8,180);
        System.out.println("Title: "+tvshow.getName()+", "+tvshow.getNoOfDiscs()+" disc boxset, "+tvshow.getNumberOfEpisodes1()+ " episodes");

        //System.out.println(movie);

    }

}
