package com.atoudeft.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PanneauConfigServeur extends JPanel {
    private JTextField txtAdrServeur, txtNumPort;

    public PanneauConfigServeur(String adr, int port) {

        txtAdrServeur = new JTextField(adr, 20);
        txtNumPort = new JTextField(Integer.toString(port), 20);


        JLabel lblAdrServeur = new JLabel("Adresse IP :");
        JLabel lblPortServeur = new JLabel("Port :");


        setLayout(new GridLayout(2, 2, 3, 3));
        add(lblAdrServeur);
        add(txtAdrServeur);
        add(lblPortServeur);
        add(txtNumPort);


        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    public String getAdresseServeur() {
        return txtAdrServeur.getText().trim();
    }

    public String getPortServeur() {
        return txtNumPort.getText().trim();
    }

}
