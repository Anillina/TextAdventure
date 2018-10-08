package view;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
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

    /**
     *
     * @param x gibt an wohin die Kamera verschoben werden soll (x-Richtung)
     * @param y gibt an wohin die Kamera verschoben werden soll (y-Richtung)
     */
     public void camera(double x,double y){
         if(graphics2D!=null) graphics2D.translate(x,y);
     }

    /**
     *
     * @param angle Winkel in dem das Bild gedreht wird
     * @param x Stelle des Objektes
     * @param y Wert des Objektes
     * @param img Bild was gedreht werden soll
     */
    public void rotate(double angle, double x, double y,BufferedImage img){
        if(graphics2D!=null){
            AffineTransform old = graphics2D.getTransform();
            graphics2D.rotate(angle,x,y);
            drawImage(img,(int)x,(int)y);
            graphics2D.setTransform(old);
        }
    }

    /**
     *
     * @param img Bild welches vergrößert/verkleinert werden soll
     * @param width breite des neuen Bildes
     * @param height  höhe des neuen Bildes
     * @return das neue Bild wird zurückgegeben
     */
    public BufferedImage resize(BufferedImage img,int width,int height){
        Image temp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(temp,0,0,null);
        g2d.dispose();
        return resized;
    }
}
