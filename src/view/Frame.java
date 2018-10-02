package view;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(int width, int height){
        GraphicsDevice gd= GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int x=(int)(gd.getDisplayMode().getWidth()-gd.getDisplayMode().getWidth()/2)-(width/2);
        int y=(int)(gd.getDisplayMode().getHeight()-gd.getDisplayMode().getHeight()/2)-(height/2);
        setLocation(x,y);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(width,height);
        setContentPane(new GamePanelHandler().getPanel1());
        setVisible(true);
    }
}
