package it.castelli.impiccato.start;

import it.castelli.impiccato.styles.RoundedBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.castelli.impiccato.home.homeFrame;

public class startPanel extends JPanel {
    private startFrame frame;
    private JButton start= new JButton("START");

 public startPanel(startFrame frame){
     this.frame=frame;
   setPanelProperties();
   setButtonProperties();
    start.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             new homeFrame();
             frame.dispose();
         }
    });
 }

    private void setButtonProperties() {
        start.setPreferredSize(new Dimension(200,100));
        start.setForeground(new Color(255,152,0));
        start.setBounds(380,200,200,100);
        start.setContentAreaFilled(false);
        start.setFocusPainted(false);
        start.setBorder(new RoundedBorder(10));
        start.setVisible(true);
    }


    private void setPanelProperties(){
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(1000,600));
        this.add(start);
        this.setVisible(true);

    }

}
