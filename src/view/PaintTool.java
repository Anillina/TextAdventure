package view;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * Diese Klasse ist ein Werkzeug um Sachen graphisch darzustellen
 */
public class PaintTool  {

    private Graphics2D graphics2D;

    /**
     * Erzeugt ein neues Bild
     * @param img das angegebene Objekt der BufferedImage
     * @param filepath der Pfad zur Datei des Bildes
     */
    public BufferedImage createImage(BufferedImage img,String filepath){
        try{
            img= ImageIO.read(new File(filepath));
            return  img;
        }catch (Exception e){
            System.out.println(filepath +" : wurde nicht richtig angegeben.");
            return null;
        }
    }

    /**
     * Zeichnet die angegebene BufferedImage img
     * @param img angegebene Bufferedimage
     * @param x Stelle des Bildes
     * @param y Wert des Bildes
     */
    public void drawImage(BufferedImage img,int x , int y){
        graphics2D.drawImage(img,x,y,null);
    }

    /**
     * Setzt graphics2D
     * @param g2D übergebene Graphics2D Objekt
     */
    public void setGraphics2D(Graphics2D g2D){
        graphics2D=g2D;
    }




}
