package com.company;

abstract class CarrierDevice {
Song song;
    private  String nameOfCarrierDevice;

    CarrierDevice(String nameOfCarrierDevice){
        this.nameOfCarrierDevice = nameOfCarrierDevice;
    }
    public boolean songNull(){
        if (song == null){
            return true;
        }
        else {
            return false;
        }
    }

   abstract void recordSongToDevice(Song song);

    public void setNameOfCarrierDevice(String nameOfCarrierDevice){
        this.nameOfCarrierDevice = nameOfCarrierDevice;
    }

    public  String getNameOfCarrierDevice(){
        return nameOfCarrierDevice;
    }
}
