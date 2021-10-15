package com.softwareinstitute.training.kptsang;


public class Book extends LibraryItem {
    //abstract?

    //Attributes

    public int pages;
    private String Author;

    //constructors

    public Book(String name, String Author, int pages) {
        super(name);
        this.Author = Author;
        this.pages = pages;
    }

    //methods
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public String getAuthor() {
        return Author;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return pages;
    }
}
