package com.softwareinstitute.training.kptsang;

public class Main{

    public static void main(String[] args){

        Fiction fiction = new Fiction("Nineteen Eighty Four", "George Orwell", 328, "Dystopian");
        System.out.println("Title: "+ fiction.getName() +", written by " + fiction.getAuthor()+", "+fiction.getPages()+" pages");


        NonFiction nonfiction = new NonFiction("LEGO Star Wars Visual Dictionary", "DK", 160, "Lego");
        System.out.println("Title: "+ nonfiction.getName() +", written by "+ nonfiction.getAuthor()+ ", " + fiction.getPages()+ " pages, this book is about " +nonfiction.getTopic());

        Movie movie = new Movie("Kill Bill", 2, "Quentin Tarantino", 215);
        System.out.println("Title: "+ movie.getName()+", "+ movie.getNoOfDiscs()+" disc(s), directed by "+movie.getDirector()+", runs for "+movie.getRuntime()+ " minutes");

        TVShow tvshow = new TVShow("Seinfeld", 8,180);
        System.out.println("Title: "+tvshow.getName()+", "+tvshow.getNoOfDiscs()+" disc boxset, "+tvshow.getNumberOfEpisodes1()+ " episodes");

    }

}
