package model;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Sound {

    private AudioStream stream;

    public Sound(String filepath ,boolean directStart){
        if(directStart){
            loadAndStartSound(filepath);
        }else{
            loadSound(filepath);
        }
    }

    public void loadAndStartSound(String filepath) {
        try {
            InputStream in=new FileInputStream(new File(filepath));
            stream=new AudioStream(in);
            AudioPlayer.player.start(stream);
        }catch (Exception e){
            System.out.println("Ein Fehler mit dem Sound ist aufgetreten");
        }
    }

    public void loadSound(String filepath){
        try {
            InputStream in=new FileInputStream(new File(filepath));
            stream=new AudioStream(in);
        }catch (Exception e){
            System.out.println("Ein Fehler mit dem Sound ist aufgetreten");
        }
    }

    public void startAudio(){
        AudioPlayer.player.start(stream);
    }

    public void stopAudio(){
        AudioPlayer.player.stop(stream);
    }

}
