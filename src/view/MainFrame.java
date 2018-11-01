
package view;



import control.ModelController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Der Hauptframe des Spiels
 */
public class MainFrame extends JFrame {

    private int maxLayer,x,y,width,height;
    private boolean nextLayer, visibleOfHelp;
    private MainView view;
    private Painting[] paintings;
    private ModelController mC;

    /**
     * Ein Frame wird beim Aufruf dieses Konstruktors erzeugt
     * @param x Stelle des Frames
     * @param y Stelle des Frames
     * @param width ist die Breite des Frames
     * @param height ist die Höhe des Frames
     * @param view ist die MainView
     */
    public MainFrame(int x , int y ,int width, int height,MainView view){
        this.view=view;
        visibleOfHelp =false;
        this.x=x;this.y=y;this.width=width;this.height=height;
        setTitle("Depths of my Mind");
        mC=view.getModelController();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(x,y);
        setSize(width,height);
        setResizable(true);
        maxLayer=2;
        paintings=new Painting[maxLayer];
        for(int i=0;i< paintings.length;i++) {
            paintings[i] = new Painting(view.getModelController());
        }
        setVisible(true);
    }

    /**
     * Diese Methode sorgt dafür die Panels zu verwalten .
     */
    public void managePanels() {
        for(int i=0;i< paintings.length;i++){
            if (view.getLayer() == i) {
                setContentPane(paintings[i]);
            }
        }
    }

    /**
     * Diese Methode erzeigt einen MouseListener , für den ersten Knopf auf der nullten Ebene
     */
    public void createButtonListeners(){
        if(view.getLayer()==0) {
            paintings[0].getButtons()[0].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    nextLayer = true;
                    view.update();
                    paintings[0].remove(paintings[0].getButtons()[0]);
                    view.setLayer(view.getLayer() + 1);
                    drawPaintings();
                }
            });
        }
        if(view.getLayer()==1){
            System.out.println("ave");
            paintings[1].getChoiceButton().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    paintings[1].getChoiceLabel().setVisible(true);
                }
            });
        }
    }

    public void updatePanel(){
        managePanels();
        drawPaintings();
        revalidate();
        repaint();
        System.out.println(mC.getPlayer().getLevel());
    }

    /**
     * Diese Methode malt bzw setzt das Layout von allen Panel/Paintings
     */
    public void drawPaintings(){
        if(view.getLayer()==0) {
            paintings[view.getLayer()].createJButtons(1);
            paintings[view.getLayer()].setLocationAndTitleOfJButton(paintings[view.getLayer()].getButtons()[0], x + width / 2, y + height / 2, "Start");
            createButtonListeners();
        }
        if (view.getLayer()==1 && view.getModelController().getPlayer().getLevel()==0 ){
            Painting painting= paintings[view.getLayer()];
            setContentPane(painting);
            //JLabel
            painting.setLabel(new JLabel());
            painting.getLabel().setBorder(BorderFactory.createMatteBorder(10,10,10,0,new Color(21,30,61)));
            painting.addComponent(painting,painting.getLabel(),0,0,1,1,6,1);
            painting.getLabel().setOpaque(true);
            painting.setChoiceLabel(new JLabel());
            paintings[1].getChoiceLabel().setVisible(false);
            painting.getChoiceLabel().setBorder(BorderFactory.createMatteBorder(10,10,10,10,new Color(21,30,61)));
            painting.getChoiceLabel().setOpaque(true);
            painting.addComponent(painting,painting.getChoiceLabel(),1,0,1,1,0.25,1);
            //JTextField
            painting.setTextField(new JTextField());
            painting.getTextField().setBorder(BorderFactory.createMatteBorder(0,10,10,10,new Color(21,30,61)));
            painting.textFieldKeyPressed();
            painting.addComponent(painting,painting.getTextField(),0,1,1,0,0.25,0.01);
            painting.setChoiceButton(new JButton("Get Choices"));
            painting.addComponent(painting,painting.getChoiceButton(),1,1,1,1,0.25,0.01);
            mC.storyControllerPlay();
            createButtonListeners();
        }
    }

    /**
     *
     * @param next ist der Wahrheitswert den nextLayer übergeben wird
     */
    public void setNextLayer(boolean next){
        nextLayer=next;
    }

    /**
     * @return gibt nextLayer (Wahrheitswert) zurück
     */
    public boolean isNextLayer(){
        return nextLayer;
    }

    public Painting[] getPaintings() {
        return paintings;
    }


}