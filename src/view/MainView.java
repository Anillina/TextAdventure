package view;

import control.ModelController;

import java.awt.*;

/**
 * Die MainView kümmert sich um die Aktualisierung der Paintings
 */
public class MainView {
   //Attribute
   private int layer;
   private final int widthDevice,heightDevice;
   //Referenzen
   private MainFrame frame;
   private ModelController modelController;

   public MainView(ModelController mC){
       modelController=mC;
       layer=modelController.getPlayer().getLayer();
       GraphicsDevice gd= GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
       widthDevice=gd.getDisplayMode().getWidth();
       heightDevice=gd.getDisplayMode().getHeight();
       frame=new MainFrame(0,0,widthDevice,heightDevice,this);
   }

    /**
     * Sorgt dafür den Frame up to date zu halten
     *
     */
   public void update(){
       frame.getContentPane().invalidate();
       frame.updatePanel();
       modelController.updateLayers();
       frame.revalidate();
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

    public int getWidthDevice() {
        return widthDevice;
    }

    public int getHeightDevice() {
        return heightDevice;
    }
}
