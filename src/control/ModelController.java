package control;

import model.*;
import view.PaintTool;
import view.MainView;

/**
 * Ist für die Instanziierung der Models und deren Verwaltung zuständig
 */
public class ModelController {

    private Player player;
    private Being monster;
    private MainView view;
    private Background background;
    private Story story;
    private Sound[] effect;
    private StoryController storyController;

    public ModelController(){
        player=new Player(1,10);
        monster=new Monster(1);
        story=new Story();
        storyController=new StoryController(player,story);
        effect=new Sound[7];
        effect[0]=new Sound("assets/spoopySounds/guitarhero.wav",false);
        effect[0].startAudio();
        effect[1]=new Sound("assets/spoopySounds/uhm.wav",false);
        effect[2]=new Sound("assets/spoopySounds/buff.wav",false);
        effect[3]=new Sound("assets/spoopySounds/krikelakrak.wav",false);
        effect[4]=new Sound("assets/spoopySounds/steigernd.wav",false);
        effect[5]=new Sound("assets/spoopySounds/Xeno.wav",false);
    }

    /**
     * Zeichnet die Models
     */
    public void paint(PaintTool paintTool){
        if(player.getPosition().equals("1,1")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[0],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,2a")){
            effect[1].startAudio();
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[2],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,2b")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[1],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,3ba")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[4],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,3bc") || player.getPosition().equals("1,4bca" ) || player.getPosition().equals("1-4bcb")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[5],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,4baa") || player.getPosition().equals("1,4bab")){
            effect[2].startAudio();
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[3],view.getWidthDevice(),view.getHeightDevice()),0,0);
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[7],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,4bac") ){
            effect[2].startAudio();
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[3],view.getWidthDevice(),view.getHeightDevice()),0,0);
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[8],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,3bb") || player.getPosition().equals("1,5baaa" ) ){
            effect[3].startAudio();
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[6],view.getWidthDevice(),view.getHeightDevice()),0,0);
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[9],view.getWidthDevice()/2,view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("1,4bba") || player.getPosition().equals("1,4bbb" ) ){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[6],view.getWidthDevice(),view.getHeightDevice()),0,0);
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[10],view.getWidthDevice()/2,view.getHeightDevice()),0,0);
        }
        //layer 2
        if(player.getPosition().equals("2,1")  ){
            effect[5].startAudio();
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[11],view.getWidthDevice(),view.getHeightDevice()),0,0);
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[17],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("2,2a")  ){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[12],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("2,2b")  ){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[13],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("2,3ba")  ){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[14],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("2,3bb")  ){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[15],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("2,3bb")  ){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[16],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        //layer 3
        if(player.getPosition().equals("3,1") ||player.getPosition().equals("3,3aa")||player.getPosition().equals("3,3ab")||player.getPosition().equals("3,4aba")||player.getPosition().equals("3,3bb") ){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[18],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("3,2a")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[19],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("3,2b")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[20],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("3,3ba")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[21],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("3,4baa")){
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[25],view.getWidthDevice(),view.getHeightDevice()),0,0);
            effect[6]=new Sound("assets/spoopySounds/endScreenSong.wav",true);
        }
        if(player.getPosition().equals("3,4aaa")){
            effect[4].startAudio();
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[23],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
        if(player.getPosition().equals("3,4aab")){
            effect[4].startAudio();
            paintTool.drawImage(paintTool.resize(background.getBackgrounds()[24],view.getWidthDevice(),view.getHeightDevice()),0,0);
        }
    }


    /**
     * Setzt das Layer auf dem sich der Spieler befindet auf das nächste wenn isNextLayer true zurückgibt
     */
    public void updateLayers(){
       if(view.getFrame().isNextLayer()){
           player.setLayer(player.getLayer()+1);
           view.getFrame().drawPaintings();
//           storyController.checkAnswer();
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

            storyController.updateSentencesAndChoices();
            storyController.checkAnswer();
            background.setBackgrounds(player.getLayer());
        }
    }

    public MainView getView() {
        return view;
    }

    public void setView(MainView view) {
        this.view = view;
    }
}
