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
               backgrounds = new BufferedImage[26];
               loadImage(backgrounds,0,"assets/backgrounds/prolog.png");
               loadImage(backgrounds,1,"assets/backgrounds/layer1/beforest.png");
               loadImage(backgrounds,2,"assets/backgrounds/layer1/level1.png");
               loadImage(backgrounds,3,"assets/backgrounds/layer1/inforest.png");
               loadImage(backgrounds,4,"assets/backgrounds/layer1/inforestWTF.png");
               loadImage(backgrounds,5,"assets/backgrounds/layer1/flower.png");
               loadImage(backgrounds,6,"assets/backgrounds/layer1/layer1.png");
               loadImage(backgrounds,7,"assets/backgrounds/layer1/masonEating.png");
               loadImage(backgrounds,8,"assets/backgrounds/layer1/masonEatingEye.png");
               loadImage(backgrounds,9,"assets/monsters/pressure/1.png");
               loadImage(backgrounds,10,"assets/characters/sister/standing.png");
               //layer 2
               loadImage(backgrounds,11,"assets/backgrounds/layer2/first.png");
               loadImage(backgrounds,12,"assets/backgrounds/layer2/1.png");
               loadImage(backgrounds,13,"assets/backgrounds/layer2/second.png");
               loadImage(backgrounds,14,"assets/backgrounds/layer2/third.png");
               loadImage(backgrounds,15,"assets/backgrounds/layer2/closet.png");
               loadImage(backgrounds,16,"assets/backgrounds/layer2/deadMom.png");
               loadImage(backgrounds,17,"assets/monsters/torso/white.png");
               //layer3
               loadImage(backgrounds,18,"assets/backgrounds/layer3/corridor.png");
               loadImage(backgrounds,19,"assets/backgrounds/layer3/corridorG.png");
               loadImage(backgrounds,20,"assets/backgrounds/layer3/photo.png");
               loadImage(backgrounds,21,"assets/backgrounds/layer3/masonMad.png");
               loadImage(backgrounds,22,"assets/backgrounds/layer3/corridorG1.png");
               loadImage(backgrounds,23,"assets/backgrounds/layer3/badend.png");
               loadImage(backgrounds,24,"assets/backgrounds/layer3/badend2.png");
               loadImage(backgrounds,25,"assets/backgrounds/layer4/Ave.png");
               break;
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
