package com.company;
/*
 * В программе есть абстрактный класс PlayDevice (воспроизводящее устройство), который является суперклассом для классов CDPlayer, MusicColumn, VinylTurntable,
 * он имеет абстрактный метод playSong, так же в этом классе имются метод с помощью которого мы можем изменять имя воспроизводящего устройства или получать имя (set и get).
 * Классы наследники класса PlayDevice реализуют метод playSong, в котором мы проверяем записана ли песня на устройство, которое мы пытаемся воспроизвести
 * (если на устройстве не записана песня, мы выводим сообщение об этом), также проверяем
 * может ли данное устройство воспроизведения проиграть песню с устройства, которое мы пытаемся воспроизвести
 * (если мы не можем воспроизвести данное устройство на нашем устройстве воспроизведения, мы сообщаем об этом,
 * если же песня записана на утройстве и мы можем воспроизводить данное устройство, метод выводит информацию о том, какое устройство воспроизведения с какого устройства  проигрывает какую песню (автор и название)).
 *
 * Существует абстрактный класс CarrierDevice (устройство, на котором записана песня), этот класс - родитель для класссов VinylRecord, CDDisk и FlashDrive.
 * Он иммет абстрактный метод recordSongToDevice, который реализуют классы наследники, этот метод записывает песню на устройство.
 * Также, класс имеет метод songNull, где мы проверяем записана ли какая-либо песня на устройство.
 *
 * Есть класс Song, в котором реализованы методы получения и изменения исполнителя и названия песни (гетторы и сетторы), также переопределен метод toString.
 *
 * В классе Play реализован метод main, сначала мы создаем обЪкты - песни, затем на устройства записываем наши песни.
 * Далее проигрываем носители на наших устройствах воспроизведения.
 */
public class Play {

    public static void main(String[] args) {
	Song song1 = new Song("I Love You Baby", "Frank Sinatra");
	Song song2 = new Song("THUMP","Don Quez");
	Song song3 = new Song("The Devil You Know","Kovacs");

	VinylRecord vinylRecord = new VinylRecord();
	vinylRecord.recordSongToDevice(song1);

	CDDisk cdDisk = new CDDisk();
	cdDisk.recordSongToDevice(song2);

	FlashDrive flashDrive = new FlashDrive();
	flashDrive.recordSongToDevice(song3);

	CDPlayer cdPlayer = new CDPlayer();
	cdPlayer.playSong(cdDisk);

	MusicColumn musicColumn = new MusicColumn();
	musicColumn.playSong(cdDisk);
    musicColumn.playSong(flashDrive);

    VinylTurntable vinylTurntable = new VinylTurntable();
    vinylTurntable.playSong(vinylRecord);
    }

}
