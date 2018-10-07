package model;


import java.awt.image.BufferedImage;

public class Being{

    private BufferedImage img;

    private int fightStrength;
    private int layer;

    public Being(int fightStrength) {
        this.fightStrength = fightStrength;
        layer=0;
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

    public void setImage(BufferedImage img){
        this.img=img;
    }

    public BufferedImage getImg() {
        return img;
    }
}
