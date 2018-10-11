package model;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Backgrounds {
    private BufferedImage [] backgrounds;
    private Player player;
    private int layer;

    public Backgrounds() {
        setBackgrounds();
    }
    public void setBackgrounds(){
        layer=player.getLayer();
        for(int i=0;i<layer;i++) {
            backgrounds = new BufferedImage[layer];
            try {
                backgrounds[0] = ImageIO.read(new File("assests/backgrounds/layer"+layer+"/layer"+layer+".png"));
            } catch (IOException e) {
                System.out.println("Filepath wurde nicht richtig angegeben.");
            }
        }
    }

    public BufferedImage[] getBackgrounds() {
        return backgrounds;
    }
}
