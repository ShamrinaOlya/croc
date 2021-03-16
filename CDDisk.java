package com.company;

public class CDDisk extends CarrierDevice{

    Song song;

    CDDisk(){
        super("CD диск");
    }


    @Override
    void recordSongToDevice(Song song) {
        this.song = song;
        System.out.println("Песня " + song + " записана на CD диск");

    }

}
