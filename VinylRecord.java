package com.company;

public class VinylRecord extends CarrierDevice{

    Song song;

    VinylRecord(){
        super("Виниловая пластинка");
    }

    @Override
    void recordSongToDevice(Song song) {
        this.song = song;
        System.out.println("Песня " + song + " записана на виниловую пластинку");
    }


}
