package it.castelli.impiccato.game.singolo;

import javax.swing.*;
import java.awt.*;

public class SingoloFrame extends JFrame {
    private SingoloPanel panel= new SingoloPanel();

    public SingoloFrame(){
      setFrameProperties();

    }

    private void setFrameProperties() {
        this.setBackground(Color.BLACK) ;
        this.setResizable(false);
        this.setSize(1000,600);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }


}
