package com.softwareinstitute.training.kptsang;

public abstract class TVShow extends Disc{

    private int numberOfEpisodes;

    public void numberOfEpisodes(int seriesLength){
        System.out.println("This series is "+seriesLength+" episodes long");
    }
}
