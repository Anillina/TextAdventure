
package view;



import javax.swing.*;
import javax.swing.border.Border;
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
            painting.setLabel(new JLabel());
            painting.getLabel().setBorder(BorderFactory.createMatteBorder(10,10,10,0,new Color(21,30,61)));
            painting.addComponent(painting,painting.getLabel(),0,0,1,1,6,1);
            painting.getLabel().setOpaque(false);
            painting.setjList(new JList());
            painting.getjList().setBorder(BorderFactory.createMatteBorder(10,0,10,10,new Color(21,30,61)));
            painting.getjList().setBackground(new Color(0,0,0,4));
            painting.addComponent(painting,painting.getjList(),1,0,1,1,0.25,1);
            //JTextField
            painting.setTextField(new JTextField());
            painting.getTextField().setBorder(BorderFactory.createMatteBorder(0,10,10,10,new Color(21,30,61)));
            painting.textFieldKeyPressed();
            painting.addComponent(painting,painting.getTextField(),0,1,1,0,0.25,0.01);
            painting.addComponent(painting,new JButton("Get Choices"),1,1,1,1,0.25,0.01);
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