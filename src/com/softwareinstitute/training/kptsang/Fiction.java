package com.softwareinstitute.training.kptsang;

public class Fiction extends Book{

//attributes
    private String genre;
    public int pages;

    public Fiction(String name, String Author, int pages) {
        super(name, Author, pages);
    }

    //constructors

   // public Fiction(String setName, String Author){
     //   super(setName);

    //}

    public void genre(String Genre){
        System.out.println("This book is " +Genre);
    }
}
