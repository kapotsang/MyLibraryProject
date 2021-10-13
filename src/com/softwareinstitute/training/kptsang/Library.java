package com.softwareinstitute.training.kptsang;

public abstract class Library {
    private String name;
    private int releaseYear;




    public void catalogued(int regNum){
        System.out.println("Internal catalogue no: " + regNum );
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

}
