package com.softwareinstitute.training.kptsang;


public abstract class Book extends Library {

    //Attributes

    private int Pages;
    private String Author;
    //Constructors

    //Methods

    public void Pages(int pageCount){
        System.out.println("This book contains "+ pageCount +" pages" );
    }
    public void Author(String authorName){
        System.out.println("This book was written by: "+ authorName);
    }

}
