package it.castelli.impiccato.home;

import it.castelli.impiccato.game.multipla.MultiplaFrame;
import it.castelli.impiccato.game.singolo.SingoloFrame;
import it.castelli.impiccato.styles.RoundedBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homePanel extends JPanel{
    private homeFrame frame;
    private JButton singola=new JButton("modalità singola");
    private JButton multipla= new JButton("modilità multipla");
    private JLabel titolo= new JLabel("selezionare modalità di gioco ");

public homePanel(homeFrame frame){
    this.frame=frame;
    setButtonProperties();
    setPanelProperties();
    setLabelProperties();

}

    private void setLabelProperties() {
    titolo.setPreferredSize(new Dimension(400,30));
    titolo.setFont(new Font(null,Font.PLAIN,24));
    titolo.setForeground(Color.white);
    titolo.setBounds(350,50,400,30);
    titolo.setVisible(true);
    }

    private void setPanelProperties() {
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(1000,600));
        this.setLayout(null);
        this.add(singola);
        this.add(multipla);
        this.add(titolo);
        this.setVisible(true);

    }


    private void setButtonProperties() {
        singola.setPreferredSize(new Dimension(300,50));
        singola.setForeground(Color.WHITE);
        singola.setBounds(175,250,300,50);
        singola.setContentAreaFilled(false);
        singola.setFocusPainted(false);
        singola.setBorder(new RoundedBorder(10));
        singola.setVisible(true);
        singola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SingoloFrame();
                frame.dispose();
            }
        });

        multipla.setPreferredSize(new Dimension(300,50));
        multipla.setForeground(Color.WHITE);
        multipla.setBounds(525,250,300,50);
        multipla.setContentAreaFilled(false);
        multipla.setFocusPainted(false);
        multipla.setBorder(new RoundedBorder(10));
        multipla.setVisible(true);
        multipla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MultiplaFrame();
                frame.dispose();
            }
        });

    }
}
