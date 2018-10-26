package model;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Monster extends Being {

    public Monster(int fightStrength) {
        super(fightStrength);
        System.out.println(kill());
    }

    public String kill(){
        return "Ich töte dich noch schlimmer!Ich Johanna das Spukgespenst!";
    }

    /*
       unnötige Methode of doom , juckt Johanna aber nicht.
     */
    public void loadImage(BufferedImage[] backgrounds, int index, String path){
        try {
            backgrounds[index] = ImageIO.read(new File(path));
        } catch (IOException e) {
            System.out.println("Filepath wurde nicht richtig für das Monsterbild angegeben.");
        }
    }

}
