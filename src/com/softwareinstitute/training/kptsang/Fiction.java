package com.softwareinstitute.training.kptsang;

public class Fiction extends Book implements Availability {

//attributes
    private String genre;
    public int pages;

    public Fiction(String name, String Author, int pages, String genre) {
        super(name, Author, pages);
        this.genre = genre;
    }

    //methods
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }

     @Override
     public void borrow() {

     }
 }
