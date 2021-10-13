package com.softwareinstitute.training.kptsang;

public class Movie extends Disc {

    private String Director;
    private int runtime;

    //methods

    public void runtime( int runtimeLength){
        System.out.println("This is " +runtimeLength+ "minutes long");
    }
    public void Director(String filmDirector){
        System.out.println("This film was directed by "+ filmDirector);
    }

}