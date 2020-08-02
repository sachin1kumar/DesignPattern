package com.company.adapterpattern;

//Step1. play the requested audio type..
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
