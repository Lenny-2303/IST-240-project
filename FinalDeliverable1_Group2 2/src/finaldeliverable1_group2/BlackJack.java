package finaldeliverable1_group2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BlackJack extends JPanel implements ActionListener{

JButton b1,b5,b6,b7,b8,b9;

double firstCard, secondCard, firstDealerCard, secondDealerCard, wholeHand, wholeDealerHand;
int Wins = 0;


public BlackJack(){
super();
GridLayout grid = new GridLayout(5, 1);
setLayout(grid);
setBackground(Color.CYAN);
b1 = new JButton("Deal");
b1.setBackground(Color.GREEN);
b1.addActionListener((ActionListener) this);
add(b1);
b7 = new JButton("Your Hand");
b7.setBackground(Color.RED);
add(b7);
b8 = new JButton("Dealer's Hand");
b8.setBackground(Color.GREEN);
add(b8);
b5 = new JButton("Results");
b5.setBackground(Color.red);
add(b5);
b6 = new JButton("Wins: " + Wins);
b6.setBackground(Color.GREEN);
add(b6);


}
public double getHand(){
firstCard = (int)(Math.random() * 11)+ 1;
secondCard = (int)(Math.random()* 11)+ 1;
wholeHand = firstCard + secondCard;
return wholeHand;
}
public double getDealerHand(){
firstDealerCard = (int)(Math.random() * 11)+ 1;
secondDealerCard = (int)(Math.random() * 11)+ 1;
wholeDealerHand = firstDealerCard + secondDealerCard;
return wholeDealerHand;
}

@Override
public void actionPerformed(ActionEvent event) {

Object obj = event.getSource();
if(obj == b1){
b7.setText((String.format("Your hand is: %.0f ",getHand())));
b8.setText((String.format("The Dealer's hand is: %.0f ",getDealerHand())));
}
if (wholeDealerHand == 21){
b5.setText("You have lost");
}
else if(wholeDealerHand > 21) {
b5.setText("You have Won");
Wins++;
b6.setText("Wins: " + Wins);
}
else if(wholeHand == 21 & wholeDealerHand < 21){
b5.setText("You have Won");
Wins++;
b6.setText("Wins: " + Wins);
}
else if(wholeHand == wholeDealerHand & wholeDealerHand <= 21){
b5.setText("You have lost");
}
else if(wholeHand > wholeDealerHand & wholeHand <= 21){
b5.setText("You have Won");
Wins++;
b6.setText("Wins: " + Wins);
}
else if (wholeHand < wholeDealerHand){
b5.setText("You have lost");
}
else if (wholeHand > 21){
b5.setText("You have lost");
}
}
}
