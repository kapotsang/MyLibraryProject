package com.softwareinstitute.training.kptsang;

public abstract class Library {

    private String name;
    private int releaseYear;

    public Library(String name){
        this.name = name;
    }

    public void available(){
        System.out.println("Available to borrow");
    }

    public void hardcover(){
        System.out.println("This is a hardcover book");
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("This entry's name is "+name);
    }
    public String getName(){
        return name;
    }

}
