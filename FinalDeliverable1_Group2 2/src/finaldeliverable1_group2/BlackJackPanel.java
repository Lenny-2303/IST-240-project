package finaldeliverable1_group2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BlackJackPanel extends JPanel
{
    JButton panelExit;
    BlackJack game3;
    public BlackJackPanel()
    {
     super();
     BorderLayout panelBorder = new BorderLayout();
     setLayout(panelBorder);
     setBackground(Color.black);
     
     panelExit = new JButton("Return to main menu");
     panelExit.setBackground(Color.CYAN);
     add(panelExit, "North");
     
     game3 = new BlackJack();
     //Game 3
     add(game3, "Center");
    }
}
