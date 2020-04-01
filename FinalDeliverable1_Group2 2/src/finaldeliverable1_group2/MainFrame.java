package finaldeliverable1_group2;


import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame
{

    ControlPanel mjp;
    public MainFrame()
    {
        super("Group 2");
        MacLayoutSetup();
        mjp = new ControlPanel();
        getContentPane().add(mjp, "Center");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 800);
        setVisible(true);
    }

    public void MacLayoutSetup()
    { 
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
