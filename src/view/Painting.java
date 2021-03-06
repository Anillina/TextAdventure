package view;

import control.ModelController;
import control.StoryController;

import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;


/**
 * Das JPanel des Spiels
 */
public  class Painting extends JPanel{

    private String choice;
    private JTextField textField;
    private JLabel label,choiceLabel;
    private JButton[] buttons;
    private JButton choiceButton;
    private GridBagLayout layout;
    private PaintTool paintTool;
    private ModelController modelController;
    private StoryController storyController;


    /**
     * Ein neues PaintTool wird erzeugt beim erzeugen der Klasse Painting
     */
    public Painting(ModelController modelC){
        modelController=modelC;
        paintTool=new PaintTool();
        setLayout(layout=new GridBagLayout());
    }

    /**
     * @param g dient zur Setzung des Graphics2D Objektes des PaintTooles
     */
    public void paintComponent(Graphics g){
        paintTool.setGraphics2D((Graphics2D)(g));
        modelController.paint(paintTool);
    }

    public void addComponent(Container container,
                             Component component,

                             int x, int y, int width , int height,
                             double weightX, double weightY)
    {
        GridBagConstraints gBC=new GridBagConstraints();
        gBC.fill=GridBagConstraints.BOTH;
        gBC.gridx=x;gBC.gridy=y;
        gBC.gridwidth=width;gBC.gridheight=height;
        gBC.weightx=weightX;gBC.weighty=weightY;
        layout.setConstraints(component,gBC);
        container.add(component);

    }



    /**
     * Erzeugt beim Aufruf eine festgelegte Anzahl an JButtons
     * @param amount gibt die Anzahl der JButtons an
     */
    public void createJButtons(int amount){
        buttons=new JButton[amount];
        for(int i=0;i<buttons.length;i++){
            buttons[i]=new JButton();
            add(buttons[i]);
            buttons[i].setVisible(true);
        }
    }


    /**
     * Setzt den Punkt und Text des übergebenen JButtons
     * @param button ist der übergebene JButton
     * @param x Stelle des JButtons
     * @param y Wert des JButtons
     * @param text des JButtons
     */
    public void setLocationAndTitleOfJButton(JButton button, int x , int y,String text){
        button.setLocation(x,y);
        button.setText(text);
    }

    public void setImageIconOfLabel(JLabel label, BufferedImage img){
        ImageIcon im=new ImageIcon(img);
        label.setIcon(im);
    }

    /**
     *
     * @return der Array der JButtons wird zurückgegeben
     */
    public JButton[] getButtons(){
        return buttons;
    }

    public void textFieldKeyPressed(){
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    choice=textField.getText();
                    textField.setText("");
                    System.out.println(choice);
                    modelController.storyControllerPlay();
                    choiceLabel.setVisible(false);
                }
            }
        });
    }

    public void setLabelText (String txt){
        label.setText(txt);
    }
    /**
     *
     * @return das textField wird zurückgegeben
     */
    public JTextField getTextField() {
        return textField;
    }


    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public  void setLabel(JLabel labe){
        label= labe;
    }

    public void setChoiceButton(JButton choice) {
        choiceButton = choice;
    }

    public ModelController getModelController() {
        return modelController;
    }

    public void setModelController(ModelController modelController) {
        this.modelController = modelController;
    }

    public void setChoiceLabel(JLabel choiceLabel) {
        this.choiceLabel = choiceLabel;
    }

    public void setText(String help){
        label.setText(help);
    }

    public void setChoiceText(String choice){
        choiceLabel.setText(choice);
    }

    public JLabel getLabel(){
        return label;
    }

    public PaintTool getPaintTool() {
        return paintTool;
    }

    public String getChoice() {
        return choice;
    }

    public JLabel getChoiceLabel() {
        return choiceLabel;
    }

    public JButton getChoiceButton() {
        return choiceButton;
    }
}