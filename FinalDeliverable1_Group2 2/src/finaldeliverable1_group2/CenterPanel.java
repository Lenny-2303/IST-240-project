package finaldeliverable1_group2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CenterPanel extends JPanel
{

    JButton jb1, jb2, jb3, jb4, jb5, jb6;
    
    public CenterPanel()
    {
        super();
        GridLayout grid = new GridLayout(5, 1);
        setLayout(grid);
        setBackground(Color.black);
        
        //Center Panel, First Button
        jb1 = new JButton("Instructions/Score");
        jb1.setBackground(Color.CYAN);
        add(jb1);
        
        //Center Panel, Second Button
        jb2 = new JButton("Game 1");
        jb2.setBackground(Color.ORANGE);
        add(jb2);
        
        //Center Panel, Third Button
        jb3 = new JButton("Game 2");
        jb3.setBackground(Color.GREEN);
        add(jb3);
        
        //Center Panel, Fourth Button
        jb4 = new JButton("Game 3");
        jb4.setBackground(Color.CYAN);
        add(jb4);
        
        //Center Panel, Fifth Button
        jb5 = new JButton("Quit");
        jb5.setBackground(Color.LIGHT_GRAY);
        add(jb5);
    }
}