package model;
import view.PaintTool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Background {

    private BufferedImage [] backgrounds;

    private int x,y;
    private final int width,height;

    public Background(int layer,int width , int height) {
         setBackgrounds(layer);
         this.width=width;
         this.height=height;
    }

    /**
     * Zuweisung von Bildern zu Bufferd Images mithilfe eines Arrays
     *
     * @param layer Gibt die Ebene an auf dem sich der Spieler befindet
     */

    public void setBackgrounds(int layer){
       switch (layer){
           case 0:
               backgrounds=new BufferedImage[1];
               loadImage(backgrounds,0,"assets/backgrounds/start.png");
               break;
           case 1:
               backgrounds = new BufferedImage[3];
               loadImage(backgrounds,0,"assets/backgrounds/layer1/beforest.png");
               loadImage(backgrounds,1,"assets/backgrounds/layer1/inforest.png");
               loadImage(backgrounds,2,"assets/backgrounds/layer1/layer1.png");
               break;
       }
    }

    public void drawBackgrounds(PaintTool paintTool,int layer){
        switch(layer){
            case 0:
                paintTool.drawImage(paintTool.resize(backgrounds[0],width,height),x,y);
        }
    }

    public void manageScene(int layer , double dt){
        switch (layer){
            case 0:
                y-=100*dt;
        }
    }

    public BufferedImage[] getBackgrounds() {
        return backgrounds;
    }

    public void loadImage(BufferedImage[] backgrounds,int index,String path){
        try {
            backgrounds[index] = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.out.println("Filepath wurde nicht richtig angegeben.");
        }
    }

}
