package com.company.adapterpattern;

//Step2. Play other supported formats..
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
