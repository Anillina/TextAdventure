package control;

import model.Background;
import model.Monster;
import model.Player;
import view.PaintTool;
import model.Story;
import view.MainView;

/**
 * Ist für die Instanziierung der Models und deren Verwaltung zuständig
 */
public class ModelController {

    private Player player;
    private MainView view;
    private Background background;
    private Story story;
    private StoryController storyController;

    public ModelController(){
        player=new Player(1,10);
        story=new Story();
        storyController=new StoryController(player,story);
    }

    public void loadImages(PaintTool paintTool){
        player.setImage(paintTool.createImage(player.getImg(),"assets/characters/mason.png"));
    }

    /**
     * Zeichnet die Models
     */
    public void paint(PaintTool paintTool){
        //paintTool.drawImage(player.getImg(),500,500);
        //paintTool.drawImage(background.getBackgrounds()[0],0,0);
    }

    public void move(){
        background.manageScene(player.getLayer(),player.getElapsedTime());
    }

    /**
     * Setzt das Layer auf dem sich der Spieler befindet auf das nächste wenn isNextLayer true zurückgibt
     */
    public void updateLayers(){
       if(view.getFrame().isNextLayer()){
           player.setLayer(player.getLayer()+1);
           view.getFrame().drawPaintings();
           //storyController.checkAnswer();
           view.getFrame().setNextLayer(false);
       }
    }

    /**
     * Setzt die view dieser Klasse
     * @param mV das angegebene MainView Objekt
     */
    public void setViewController(MainView mV){
        view=mV;
        background=new Background(player.getLayer(),view.getWidthDevice(),view.getHeightDevice());
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
     *

    public String[][] getSentencesAndChoices(){
        return story.getSentencesAndChoices(0);
    }*/
    public StoryController getStoryController() {
        return storyController;
    }

    public void storyControllerPlay(){
        if(view!=null) {
            if(storyController.getPainting()==null) {
                storyController.setPainting(view.getFrame().getPaintings()[player.getLayer()]);
            }
            storyController.checkAnswer();
        }
    }
}
