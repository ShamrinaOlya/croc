package com.company;

public class MusicColumn extends PlayDevice {

    MusicColumn() {
        super("Музыкальная колонка");
    }

    @Override
    void playSong(CarrierDevice carrierDevice) {

        if ((carrierDevice instanceof FlashDrive == true) && (carrierDevice.songNull() == true)) {
            System.out.println("Устройство Музыкальная колонка воспроизводит песню " + "'" + ((FlashDrive) carrierDevice).song.getSongTitle() + "'" + " исполнителя " + ((FlashDrive) carrierDevice).song.getSinger() + " с носителя: " + carrierDevice.getNameOfCarrierDevice());
        } else {
            if ((carrierDevice instanceof FlashDrive == true) && (carrierDevice.songNull() == false)) {
                System.out.println("На устройство Музыкальная колонка не записана песня");
            } else {
                if ((carrierDevice instanceof FlashDrive == false)) {
                    System.out.println("На устройстве Музыкальная колонка невозможно воспроизвести песню с устройства " + carrierDevice.getNameOfCarrierDevice());

                }
            }
        }
    }
}
