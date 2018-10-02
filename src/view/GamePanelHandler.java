package view;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanelHandler {

    private String choice;

    private JLabel label;
    private JPanel panel1;
    private JTextField textField1;
    private JButton choices;
    private JTextArea textArea1;


    public GamePanelHandler(){


        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                    choice = textField1.getText();
                    textField1.setText("");
                    System.out.println(choice);
                }
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public String giveChoice(){
        return choice;
    }

}
