package com.softwareinstitute.training.kptsang;

public abstract class Disc extends Library{

    private int NoOfDiscs;

    public Disc( String name, int NoOfDiscs) {
        super(name);
        this.NoOfDiscs = NoOfDiscs;
    }

    public void setNoOfDiscs(int noOfDiscs){
        this.NoOfDiscs = NoOfDiscs;
    }
    public int getNoOfDiscs(){
        return NoOfDiscs;
    }

    //public void BluRay(){
    //    System.out.println("This disc IS a Blu Ray, enjoy the HD goodness fella");
    //}
    //public void Animated(){
    //    System.out.println("This is animated");
    //}
    //public void noOfDiscs(int howManyDisc){
    //    System.out.println("The box contains " + howManyDisc + " discs");
    //}

}
