package model;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Being{

    private BufferedImage[] img;

    private int fightStrength;
    private int layer;
    private int level;

    public Being(int fightStrength) {
        this.fightStrength = fightStrength;
        layer=0;
        level=0;
    }

    public String kill(){
        return "Ich töte dich!";
    }

    /**
     * Rückgabe der Kampfstärke
     * @return Kampfstärke
     */
    public int getFightStrength() {
        return fightStrength;
    }


    public int getLayer(){
        return layer;
    }

    public void setLayer(int layer){
        this.layer=layer;
    }

    public void setImage(BufferedImage[] img){
        this.img=img;
    }

    public BufferedImage[] getImg() {
        return img;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void loadImage(BufferedImage[] backgrounds,int index,String path){
        try {
            backgrounds[index] = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.out.println("Filepath wurde nicht richtig angegeben.");
        }
    }

}
