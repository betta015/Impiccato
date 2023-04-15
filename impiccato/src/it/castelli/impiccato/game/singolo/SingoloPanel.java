package it.castelli.impiccato.game.singolo;


import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

public class SingoloPanel extends JPanel {
private String p;
private Vector<Character> lettere= new Vector<Character>();
private Vector<Character> lettereNascoste= new Vector<Character>();
JLabel par=new JLabel();
    JLabel parn=new JLabel();
SingoloPanel(){
    p=ImpostaParola();
    for(int i=0;i<p.length();i++){
      lettere.add(p.charAt(i));
      if(i==0 || i==(p.length()-1)){
          lettereNascoste.add(p.charAt(i));
      }else {
          lettereNascoste.add('_');
      }
    }
 par.setText(String.valueOf(lettere));
    parn.setText(String.valueOf(lettereNascoste));

    par.setVisible(true);
    parn.setVisible(true);

}

    public  static String ImpostaParola(){
        Random random= new Random();
        String line;
        String[] immagine = new String[2];
        String value = "" + random.nextInt(32) + 1;;
        String parola;
        boolean setted = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("parola.txt"));
            line = reader.readLine();
            while((line != null) && (setted == false)) {
                immagine = line.split("-");
                if(immagine[0].equals(value)) {
                    parola = immagine[1];
                    setted = true;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return parola;

    }


}

