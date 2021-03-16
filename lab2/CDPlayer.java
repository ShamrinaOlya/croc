package com.company;

public class CDPlayer extends PlayDevice{

    CDPlayer(){
        super("CD плеер");
    }
    @Override
    void playSong(CarrierDevice carrierDevice) {
        if ((carrierDevice instanceof CDDisk == true) && (carrierDevice.songNull()==true)){
            System.out.println("Устройство CD плеер воспроизводит песню "+ "'"+((CDDisk) carrierDevice).song.getSongTitle()+"'" + " исполнителя "+ ((CDDisk) carrierDevice).song.getSinger()+" с носителя: "+carrierDevice.getNameOfCarrierDevice());
        }
        else {
            if ((carrierDevice instanceof CDDisk == true) && (carrierDevice.songNull() == false)){
                System.out.println("На устройство CD плеер не записана песня");
            }
            else {
                if((carrierDevice instanceof CDDisk == false)){
                    System.out.println("На устройстве CD плеер невозможно воспроизвести песню с устройства "+carrierDevice.getNameOfCarrierDevice());

                }
            }
        }
    }
}
