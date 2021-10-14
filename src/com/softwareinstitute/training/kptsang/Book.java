package com.softwareinstitute.training.kptsang;


public abstract class Book extends Library {

    //Attributes

    public int pages;
    private String Author;

    //constructors

    public Book(String name, String Author, int pages) {
        super(name);
        this.Author = Author;
        this.pages = pages;
    }


    //Methods

    //public void Pages(int pageCount) {
     //   System.out.println("This book contains " + pageCount + " pages");
    //}

    //public void Author(String authorName){
    //   System.out.println("This book was written by: "+ authorName);
    //}

    public void setAuthor(String name) {
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
