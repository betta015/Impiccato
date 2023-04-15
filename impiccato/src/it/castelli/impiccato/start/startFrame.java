package it.castelli.impiccato.start;

import javax.swing.*;
import java.awt.*;

public class startFrame extends JFrame {
 private startPanel panel= new startPanel(this);

    public startFrame(){
        this.setBackground(Color.BLACK) ;
        this.setResizable(false);
        this.setSize(1000,600);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

   }


}
