package it.castelli.impiccato.home;

import it.castelli.impiccato.styles.RoundedBorder;

import javax.swing.*;
import java.awt.*;

public class homeFrame extends JFrame {
    private homePanel panel=new homePanel(this);

    public homeFrame(){
        this.setBackground(Color.BLACK) ;

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,600);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }



}
