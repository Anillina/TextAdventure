package control;

import model.Monster;
import model.Player;
import view.PaintTool;
import model.Story;
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
    private StoryController sc;

    public ModelController(){
        player=new Player(1,10);
        story=new Story(player.getLayer());
    }

    public void loadImages(PaintTool paintTool){
        player.setImage(paintTool.createImage(player.getImg(),"assets/characters/mason.png"));
    }

    /**
     * Zeichnet die Models
     */
    public void paint(PaintTool paintTool){
        paintTool.drawImage(player.getImg(),500,500);
    }

    /**
     * Setzt das Layer auf dem sich der Spieler befindet auf das nächste wenn isNextLayer true zurückgibt
     */
    public void updateLayers(){
       if(view.getFrame().isNextLayer()){
           player.setLayer(player.getLayer()+1);
           story.setSentencesAndChoices(player.getLayer());
           System.out.println(getPlayer().getLayer());
           view.getFrame().setNextLayer(false);
           sc.updateText();
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

    /**
     *
     * @return das 2d Array sentencesAndChoices der Story wird zurückgegeben
     */

    public String[][] getSentencesAndChoices(){
        return story.getSentencesAndChoices();
    }

}
