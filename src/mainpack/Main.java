package mainpack;

import javax.swing.*;

public class Main {

    JFrame jfl;
    Draw draw;

    public Main() {
        //Neues JFrame Fenster
        jfl = new JFrame();
        //Größe Festlegen
        jfl.setSize(400,600);
        //Programm mit Klick auf X schließen
        jfl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //In der Mitte des Bilschirms platzieren
        jfl.setLocationRelativeTo(null);
        //Fenster darf nicht vergrößert/verkleinert werden
        jfl.setResizable(false);
        jfl.setTitle("Geometrische Formen");

        draw = new Draw();
        draw.setBounds(0,0,400,600);
        jfl.add(draw);


        jfl.setVisible(true);
    }


    public static void main(String[] args) {
        new Main();


    }
}
