package finaldeliverable1_group2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlPanel extends JPanel implements ActionListener
{

    CenterPanel cp;
    InstructionsPanel p1;
    ClickMePanel p2;
    RockPaperScissorsPanel p3;
    BlackJackPanel p4;

    public ControlPanel()
    {
        super();
        BorderLayout border = new BorderLayout();
        setLayout(border);
        setBackground(Color.gray);
        
        cp = new CenterPanel();
        p1 = new InstructionsPanel();
        p2 = new ClickMePanel();
        p3 = new RockPaperScissorsPanel();
        p4 = new BlackJackPanel();
        add(cp, "Center");
        
        cp.jb1.addActionListener(this);
        cp.jb2.addActionListener(this);
        cp.jb3.addActionListener(this);
        cp.jb4.addActionListener(this);
        cp.jb5.addActionListener(this);
        p1.panelExit.addActionListener(this);
        p2.panelExit.addActionListener(this);
        p3.panelExit.addActionListener(this);
        p4.panelExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) 
    {
        Object obj = event.getSource();
        
        // Instructions
        if(obj == cp.jb1)
        {
           removeAll();
           add(p1, "Center");
           validate();
           repaint();
        }
        // Game 1
        if(obj == cp.jb2)
        {
           removeAll();
           add(p2, "Center");
           validate();
           repaint();
        }
        // Game 2
        if(obj == cp.jb3)
        {
           removeAll();
           add(p3, "Center");
           validate();
           repaint();
        }
        // Game 3
        if(obj == cp.jb4)
        {
           removeAll();
           add(p4, "Center");
           validate();
           repaint();
        }
        // Exit Button
        if(obj == cp.jb5)
        {
            System.exit(0);
        }
        //Instructions Return
        if(obj == p1.panelExit)
        {
           removeAll();
           add(cp, "Center");
           validate();
           repaint();
        }
        //Game 1 Return
        if(obj == p2.panelExit)
        {
           removeAll();
           add(cp, "Center");
           validate();
           repaint();
        }
        //Game 2 Return
        if(obj == p3.panelExit)
        {
           removeAll();
           add(cp, "Center");
           validate();
           repaint();
        }
        //Game 3 Return
        if(obj == p4.panelExit)
        {
           removeAll();
           add(cp, "Center");
           validate();
           repaint();
        }
        
    }
}
