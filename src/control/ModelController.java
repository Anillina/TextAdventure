package control;

import model.Monster;
import model.Player;
import view.PaintTool;
import view.Story;
import view.MainView;

import java.awt.*;

/**
 * Ist für die Instanziierung der Models und deren Verwaltung zuständig
 */
public class ModelController {

    private Player player;
    private MainView view;
    private Monster[] monsters;
    private Story story;

    public ModelController(){
        player=new Player(1,10);
    }

    public void loadImages(PaintTool paintTool){
        player.setImage(paintTool.createImage(player.getImg(),"assets/characters/mason.png"));
    }

    /**
     * Zeichnet die Models
     */
    public void paint(PaintTool paintTool){
        //paintTool.drawImage(player.getImg(),500,500);
    }

    /**
     * Setzt das Layer auf dem sich der Spieler befindet auf das nächste wenn isNextLayer true zurückgibt
     */
    public void updateLayers(){
       if(view.getFrame().isNextLayer()){
           player.setLayer(player.getLayer()+1);
           System.out.println(getPlayer().getLayer());
           view.getFrame().setNextLayer(false);
       }
    }

    /**
     * Setzt die view dieser Klasse
     * @param mV das angegebene MainView Objekt
     */
    public void setViewController(MainView mV){
        view=mV;
    }

    /**
     *
     * @return das Objekt des Players wird zurückgegeben
     */
    public Player getPlayer() {
        return player;
    }


}
