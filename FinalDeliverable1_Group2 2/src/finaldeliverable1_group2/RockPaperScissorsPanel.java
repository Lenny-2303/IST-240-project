package finaldeliverable1_group2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RockPaperScissorsPanel extends JPanel
{
    JButton panelExit;
    RockPaperScissors game2;
    public RockPaperScissorsPanel()
    {
     super();
     BorderLayout panelBorder = new BorderLayout();
     setLayout(panelBorder);
     setBackground(Color.black);
     
     panelExit = new JButton("Return to main menu");
     panelExit.setBackground(Color.CYAN);
     add(panelExit, "North");
     
     game2 = new RockPaperScissors();
     //Game 2
     add(game2, "Center");
    }
}
