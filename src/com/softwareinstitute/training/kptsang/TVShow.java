package com.softwareinstitute.training.kptsang;

public class TVShow extends Disc{

    public int numberOfEpisodes;

    public TVShow( String name, int NoOfDiscs, int numberOfEpisodes) {
        super(name, NoOfDiscs);
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public void numberOfEpisodes(int seriesLength){
        System.out.println("This series is "+seriesLength+" episodes long");
    }

    public void setNumberOfEpisodes1(int NumberOfEpisodes){
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public int getNumberOfEpisodes1(){
        return numberOfEpisodes;
    }
}
