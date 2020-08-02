package com.company.adapterpattern;

//Step3. concrete class implementing AdvanceMediaPlayer to plat Mp4 format file..
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
