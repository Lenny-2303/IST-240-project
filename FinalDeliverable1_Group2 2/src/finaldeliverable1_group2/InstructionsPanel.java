package finaldeliverable1_group2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InstructionsPanel extends JPanel
{
    JButton panelExit, GameOneInstructions, GameTwoInstructions, GameThreeInstructions;
    
    public InstructionsPanel()
    {
     super();
     GridLayout grid = new GridLayout(4, 1);
    setLayout(grid);
     setBackground(Color.blue);
     
     panelExit = new JButton("Return to main menu");
     panelExit.setBackground(Color.CYAN);
     add(panelExit, "North");
     
     GameOneInstructions = new JButton("Game 1: Click on the box as many times as possible in the allotted timeframe");
     GameOneInstructions.setBackground(Color.GRAY);
     add(GameOneInstructions, "Center");
     
     GameTwoInstructions = new JButton("Game 2: Choose rock, paper or scissors. Your choice will be compared to the computer's randomly assigned choice and the winner will be decided. Rock > Scissors, Scissors > Paper, Paper > Rock");
     GameTwoInstructions.setBackground(Color.GRAY);
     add(GameTwoInstructions, "Center");
     
     GameThreeInstructions = new JButton("Game 3: Reach 21, or as close to it as possible, without going over. Your hand will then compare to the dealers and the closest to 21 wins.");
     GameThreeInstructions.setBackground(Color.GRAY);
     add(GameThreeInstructions, "Center");
     
    }
}
