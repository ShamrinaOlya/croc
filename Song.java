package com.company;

public class Song {

   private String songTitle;
    private String singer;

    Song(String songTitle, String singer){
        this.songTitle = songTitle;
        this.singer = singer;
    }

    public void setSongTitle(String songTitle){

        this.songTitle = songTitle;
    }

    public String getSongTitle(){

        return songTitle;
    }

    public void setSinger(String singer){

        this.singer = singer;
    }

    public String getSinger(){

        return singer;
    }

    public String toString(){
        return this.singer + " " +"'"+ this.songTitle + "'";
    }
}
