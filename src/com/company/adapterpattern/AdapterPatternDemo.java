package com.company.adapterpattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        //Play some music
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","horxio.mp3");
        audioPlayer.play("mp4","horxio.mp4");
        audioPlayer.play("vlc","horxio.vlc");
    }
}
