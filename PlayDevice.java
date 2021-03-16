package com.company;

 abstract class PlayDevice {

    private  String nameOfDevise;

    PlayDevice(String nameOfDevice){
        this.nameOfDevise = nameOfDevice;
    }

    abstract void playSong(CarrierDevice carrierDevice);


    public void setNameOfDevise(String nameOfDevice){
        this.nameOfDevise = nameOfDevice;
    }
    public String getNameOfDevise(){
        return getNameOfDevise();
    }
}
