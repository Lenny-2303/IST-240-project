package finaldeliverable1_group2;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;




public class RockPaperScissors extends JPanel implements ActionListener
{
   JButton rock, paper, scissor, sb, win, winCounter;
   int score = 0; 
   int getRPS; 
   int totalWins =0;
    
   public RockPaperScissors()
    {
        super();
        GridLayout grid = new GridLayout(6, 1);
        setLayout(grid);
        setBackground(Color.white);
        rock = new JButton("Rock");
        rock.setBackground(Color.LIGHT_GRAY);
        add(rock);
        paper = new JButton("Paper");
        paper.setBackground(Color.WHITE);
        add(paper);
        scissor = new JButton("Scissors");
        scissor.setBackground(Color.LIGHT_GRAY);
        add(scissor);
          
        sb = new JButton("Computer's Choice");
        sb.setBackground(Color.WHITE);
        add(sb);
        
        win = new JButton("Win, Lose, or Draw");
        win.setBackground(Color.ORANGE);
        add(win);
        
        winCounter = new JButton("Amount of wins: " + totalWins);
        winCounter.setBackground(Color.PINK);
        add(winCounter);
        
        
        
        rock.addActionListener(this);
        paper.addActionListener(this);
        scissor.addActionListener(this);
    }

    public String randomCon(){
        String[] list = {"Computer Chooses: Rock", "Computer Chooses: Paper","Computer Chooses: Scissors"};
        Random random = new Random();
        
        String con = list[random.nextInt(list.length)];
        return con;
       
    }

    public void actionPerformed(ActionEvent event) 
    {

        Object obj = event.getSource();
        String choice = event.getActionCommand();
        
        if (obj == rock) 
        {
            sb.setText(randomCon());
            if (sb.getText().equals("Computer Chooses: Scissors")){
                win.setText("WIN");
            }else if (sb.getText().equals("Computer Chooses: Paper")){
                win.setText("LOSE");
            }else if (sb.getText().equals("Computer Chooses: Rock")){
                win.setText("DRAW");    
            }
            if (win.getText().equals("WIN"))
            {
                totalWins++;
                winCounter.setText("Amount of wins: " + totalWins);
            }
        }
    
        if (obj == paper) 
        {
            sb.setText(randomCon());
            if (sb.getText().equals("Computer Chooses: Scissors")){
                win.setText("LOSE");
            }else if (sb.getText().equals("Computer Chooses: Paper")){
                win.setText("DRAW");
            }else if (sb.getText().equals("Computer Chooses: Rock")){
                win.setText("WIN");    
            }
            if (win.getText().equals("WIN"))
            {
                totalWins++;
                winCounter.setText("Amount of wins: " + totalWins);
            }
        }
    
        if (obj == scissor) 
        {
            sb.setText(randomCon());
            if (sb.getText().equals("Computer Chooses: Scissors")){
                win.setText("DRAW");
            }else if (sb.getText().equals("Computer Chooses: Paper")){
                win.setText("WIN");
            }else if (sb.getText().equals("Computer Chooses: Rock")){
                win.setText("LOSE");    
            }
        
            if (win.getText().equals("WIN"))
            {
                totalWins++;
                winCounter.setText("Amount of wins: " + totalWins);
            }
        }
    }
}