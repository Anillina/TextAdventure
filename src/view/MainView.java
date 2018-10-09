package view;

import control.ModelController;

import java.awt.*;

/**
 * Die MainView kümmert sich um die Aktualisierung der Paintings
 */
public class MainView {
   //Attribute
   private int layer;
   //Referenzen
   private MainFrame frame;
   private ModelController modelController;
   private String shownText;
   private String[] buttonText;

   public MainView(ModelController mC){
       modelController=mC;
       layer=modelController.getPlayer().getLayer();
       GraphicsDevice gd= GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
       int width=1500;
       int height=1000;
       int x=(int)(gd.getDisplayMode().getWidth()-gd.getDisplayMode().getWidth()/2)-(width/2);
       int y=(int)(gd.getDisplayMode().getHeight()-gd.getDisplayMode().getHeight()/2)-(height/2);
       frame=new MainFrame(x,y,width,height,this);
   }

    /**
     * Sorgt dafür den Frame up to date zu halten
     *
     */
   public void update(){
       System.out.println(frame.isNextLayer());
       layer=modelController.getPlayer().getLayer();
       modelController.updateLayers();
       frame.updatePanel();
   }

   public void updateLabel(){
       for(int i=0;i<modelController.getSentencesAndChoices().length;i++){
           for(int j=0;j<modelController.getSentencesAndChoices()[i].length;j++){
               shownText=modelController.getSentencesAndChoices()[i][j]+" ";
           }
           buttonText=new String[modelController.getSentencesAndChoices()[1].length];
           for(int k=0;k<buttonText.length;k++){
               buttonText[k]=modelController.getSentencesAndChoices()[1][k];
           }
       }
   }

    /**
     *
     * @return das Objekt des MainFrames wird zurückgegeben
     */
    public MainFrame getFrame() {
        return frame;
    }

    /**
     *
     * @return das Objekt des ModelController wird zurückgegeben
     */
    public ModelController getModelController() {
        return modelController;
    }

    public int getLayer(){
        return layer;
    }

    public void setLayer(int layer){
        this.layer=layer;
    }

}
