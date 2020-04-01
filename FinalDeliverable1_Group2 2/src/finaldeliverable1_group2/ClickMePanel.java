package finaldeliverable1_group2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ClickMePanel extends JPanel
{
    JButton panelExit;
    ClickMe game;
    public ClickMePanel()
    {
     super();
     BorderLayout panelBorder = new BorderLayout();
     setLayout(panelBorder);
     setBackground(Color.black);
     
     panelExit = new JButton("Return to main menu");
     panelExit.setBackground(Color.CYAN);
     add(panelExit, "North");
     
     game = new ClickMe();
     add(game, "Center");
    }
}
