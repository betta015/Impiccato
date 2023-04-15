/*
        package it.castelli.impiccato;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;


public class Parola {
    private String parola;

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Parola(String parola) {
        this.parola = parola;
    }

    public String ImpostaParola(){
        Random random= new Random();
        String line;
        String[] immagine = new String[2];
        String value = "" + random.nextInt(32) + 1;;
        String imageName = "";
        boolean setted = false;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(parola));
            line = reader.readLine();
            while((line != null) && (setted == false)) {
                immagine = line.split("-");
                if(immagine[0].equals(value)) {
                    imageName = immagine[1];
                    setted = true;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageName;

    }

}

 */
