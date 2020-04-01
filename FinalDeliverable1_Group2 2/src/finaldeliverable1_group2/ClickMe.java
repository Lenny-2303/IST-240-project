package finaldeliverable1_group2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class ClickMe extends JPanel implements ActionListener
{

    JButton start, stop, character, pScore;
    Timer tim;
    Timer BarTim;
    int limit = 0;
    int delay = 0;
    int delay2 = 0;
    int i = 0;
    int x = 100;
    int y = 100;
    int s = 100;
    int score = 0;
    int score1;
    JProgressBar pbVertical;
    int j=60;

    public ClickMe()
    {
        super();
        start = new JButton("start");
        stop = new JButton("stop");
        character = new JButton("click me");
        pScore = new JButton("Score Here");
        //button set up
        start.addActionListener(this);
        add(start);
        Rectangle rs = new Rectangle(5, 5, 90, 30);
        start.setBounds(rs);
        
        stop.addActionListener(this);
        add(stop); 
         Rectangle rss = new Rectangle(90, 5, 90, 30);
         stop.setBounds(rss);
        
        pScore.addActionListener(this);
        Rectangle sc = new Rectangle(190, 5, 120, 30);
        add(pScore);
        pScore.setBounds(sc);
        
        character.addActionListener(this);
        Rectangle ch = new Rectangle(x, y, s, s);
        add(character);
        character.setBounds(ch);
        
        delay = 1000; //milliseconds
        tim = new Timer(delay, this);
        
      //  delay2 =10000;
       // BarTim = new Timer(delay2,this);
        
        
        pbVertical = new JProgressBar(JProgressBar.VERTICAL, 0, 60);// 60 the maximun number of intervals that th progress bar will show
        pbVertical.setStringPainted(true);
        pbVertical.setString("Vertical");
        add(pbVertical,"East");
        
        
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawString("score = " + score, 10, 520);
        g.drawString("Press Spacebar to start the game", 10, 540);
        g.drawString("You have 60 seconds to keep clicking on the button to score", 10, 560);
    }
    public void actionPerformed(ActionEvent event) {

        Object obj = event.getSource();
        String choice = event.getActionCommand();
        if (obj == stop) {
            tim.stop();
        }
        if (obj == start) {
            tim.start();
        }
        if (obj == character) {
            score = score + 1;
            score1 = score;
            pScore.setText("Score: " + score);
        }
 
       
    // every tick of the timer clock will call
        if (obj == tim) {
            i = i + 1;
            double r = Math.random();
            double e = Math.random();
            int dx = (int) (r * 575);
            int dy = (int)(e*850);
            Rectangle ch = new Rectangle(dx, dy, s, s);
            character.setBounds(ch);

        }
        if(obj==tim){
            j = j - 1;
            pbVertical.setValue(j);
            pbVertical.setValue(j);
            pbVertical.setString("" + j);

            
        }
    }    
   
}
