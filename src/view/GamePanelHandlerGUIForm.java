package view;

import model.Story;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanelHandlerGUIForm {
    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public JLabel getLableArea() {
        return lableArea;
    }

    private MainView view;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel lableArea;
    private javax.swing.JPanel JPanel;

    //Titel Lable and Button
    private JLabel titleNameLable;
    private JButton startButton;
    private Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 30);
    //Start Button Alternative
    TitleScreenHandler tsHandler = new TitleScreenHandler();

    public GamePanelHandlerGUIForm() {

        // Title size, text, font and other things
        titleNameLable = new JLabel();
        titleNameLable.setBounds(100,100,600,150);
        titleNameLable.setForeground(Color.gray);
        titleNameLable = new JLabel("Depths Of My Mind");
        titleNameLable.add(titleNameLable);
        titleNameLable.setFont(titleFont);

        startButton = new JButton();
        startButton.setBounds(300,400,200, 100);
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.darkGray);
        startButton.setFont(normalFont);
        //Alternative
        startButton.addActionListener(tsHandler);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createGameScreen();
                //view.getLayer() = 1;
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //lableArea.("")
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    // Start Buttons Functions (Alternative)
    public class TitleScreenHandler implements ActionListener{
         public void actionPerformed(ActionEvent event){
             createGameScreen();
         }
    }

    public void createGameScreen() {
        titleNameLable.setVisible(false);
        startButton.setVisible(false);

        lableArea.setBounds(100,100,600,250);
        lableArea.setBackground(Color.black);
        lableArea.setForeground(Color.WHITE);
        lableArea.setFont(normalFont);
        //lableArea.setLineWrap(true);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Depths Of My Mind");
        frame.setSize(800,600);
        frame.setContentPane(new GamePanelHandlerGUIForm().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
