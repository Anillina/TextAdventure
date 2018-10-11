package model;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Backgrounds {
    private BufferedImage [] backgrounds;

    public Backgrounds(int layer)
    {
     setBackgrounds(layer);
    }

    /**
     * Zuweisung von Bildern zu Bufferd Images mithilfe eines Arrays
     *
     * @param layer Gibt die Ebene an auf dem sich der Spieler befindet
     */

    public void setBackgrounds(int layer){
       switch (layer){
           case 1:
               backgrounds = new BufferedImage[3];
               try {
                   backgrounds[0] = ImageIO.read(new File("assests/backgrounds/layer1/beforest"));
               } catch (IOException e) {
                   System.out.println("Filepath wurde nicht richtig angegeben.");
               }
               try {
                   backgrounds[1] = ImageIO.read(new File("assests/backgrounds/layer1/forest"));
               } catch (IOException e) {
                   System.out.println("Filepath wurde nicht richtig angegeben.");
               }
               try {
                   backgrounds[2] = ImageIO.read(new File("assests/backgrounds/layer1/inforest"));
               } catch (IOException e) {
                   System.out.println("Filepath wurde nicht richtig angegeben.");
               }

               break;

            default:System.out.println("Layer wurde nicht richtig angegeben!"); break;


       }
    }

    public BufferedImage[] getBackgrounds() {
        return backgrounds;
    }
}
