package view;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Der Hauptframe des Spiels
 */
public class MainFrame extends JFrame {

    private int maxLayer,x,y,width,height;
    private boolean nextLayer;
    private MainView view;
    private Painting[] paintings;

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
        this.x=x;this.y=y;this.width=width;this.height=height;
        setTitle("Depths of my Mind");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(x,y);
        setSize(width,height);
        setResizable(false);
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
        paintings[0].getButtons()[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                nextLayer=true;
                view.update();
                paintings[0].remove(paintings[0].getButtons()[0]);
                view.setLayer(view.getLayer()+1);
                drawPaintings();
            }
        });
    }

    public void updatePanel(){
        managePanels();
        drawPaintings();
        revalidate();
        repaint();
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
        if (view.getLayer()==1 ){
            Painting painting= paintings[view.getLayer()];
            setContentPane(painting);
            //JTextArea
            painting.setjTextArea(new JTextArea());
            painting.addComponent(painting,painting.getjTextArea(),0,0,1,1,2,1);
            painting.getjTextArea().setLineWrap(true);painting.getjTextArea().setEditable(false);
            painting.getjTextArea().setOpaque(false);
            //Jlist
            painting.addComponent(painting,new JList<>(),1,0,1,1,1,1);
            //JTextField
            painting.setTextField(new JTextField());
            painting.textFieldKeyPressed();
            painting.addComponent(painting,painting.getTextField(),0,1,1,1,2,0.25);
            painting.addComponent(painting,new JButton(),1,1,1,1,0.25,0.25);
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
