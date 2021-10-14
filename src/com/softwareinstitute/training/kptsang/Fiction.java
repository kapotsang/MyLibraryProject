package com.softwareinstitute.training.kptsang;

public class Fiction extends Book{

//attributes
    public String genre;
    public int pages;

    public Fiction(String name, String Author, int pages, String genre) {
        super(name, Author, pages);
        this.genre = genre;
    }



    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }

}
