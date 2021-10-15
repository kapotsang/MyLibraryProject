package com.softwareinstitute.training.kptsang;

public class TVShow extends Disc implements Availability{

    public int numberOfEpisodes;

    public TVShow( String name, int NoOfDiscs, int numberOfEpisodes) {
        super(name, NoOfDiscs);
        this.numberOfEpisodes = numberOfEpisodes;
    }


    public void setNumberOfEpisodes1(int NumberOfEpisodes){
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public int getNumberOfEpisodes1(){
        return numberOfEpisodes;
    }

    @Override
    public void borrow() {

    }
}
