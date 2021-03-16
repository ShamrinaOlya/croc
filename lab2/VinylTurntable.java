package com.company;

public class VinylTurntable extends PlayDevice{

       VinylTurntable(){
           super("Виниловая вертушка");
       }

    @Override
    void playSong(CarrierDevice carrierDevice) {
        if ((carrierDevice instanceof VinylRecord == true) && (carrierDevice.songNull()==true)){
            System.out.println("Устройство Виниловая вертушка воспроизводит песню "+ "'"+((VinylRecord) carrierDevice).song.getSongTitle() + "'" + " исполнителя " + ((VinylRecord) carrierDevice).song.getSinger() + " с носителя: " + carrierDevice.getNameOfCarrierDevice());
        }
        else {
            if ((carrierDevice instanceof VinylRecord == true) && (carrierDevice.songNull() == false)){
                System.out.println("На устройство Виниловая вертушка не записана песня");
            }
            else {
                if((carrierDevice instanceof VinylRecord == false)){
                    System.out.println("На устройстве Виниловая вертушка невозможно воспроизвести песню с устройства "+carrierDevice.getNameOfCarrierDevice());

                }
            }
        }
    }
}
