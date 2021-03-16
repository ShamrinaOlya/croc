package com.company;

public class FlashDrive extends CarrierDevice{

    Song song;

    FlashDrive(){
        super("Флеш накопитель");
    }

    @Override
    void recordSongToDevice(Song song) {
        this.song = song;
        System.out.println("Песня " + song + " записана на флеш накопитель");
    }

}
