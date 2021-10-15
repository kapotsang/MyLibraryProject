package com.softwareinstitute.training.kptsang;

//interface LibraryItem {
    public class LibraryItem{
        private String name;
        private int releaseYear;

    public LibraryItem(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("This entry's name is "+name);
    }
    public String getName(){
        return name;
    }

}
