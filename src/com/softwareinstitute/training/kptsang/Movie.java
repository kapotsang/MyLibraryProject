package com.softwareinstitute.training.kptsang;

public class Movie extends Disc {

    private String director;
    private int runtime;


    public Movie( String name, int NoOfDiscs , String director, int runtime) {
        super(name, NoOfDiscs);
        this.director = director;
        this.runtime = runtime;
    }

    // public void runtime( int runtimeLength){
    //  System.out.println("This is " +runtimeLength+ "minutes long");
    //}
    ////public void Director(String filmDirector){
    ///  System.out.println("This film was directed by "+ filmDirector);
    //}

    //methods
    public void setDirector(String director){this.director = director;}
    public String getDirector(){return director;}

    public void setRuntime(int runtime){
        this.runtime = runtime;
    }
    public int getRuntime(){
        return runtime;
    }


    }
