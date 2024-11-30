package com.atoudeft.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * @version 1.0
 * @since 2023-11-01
 */
public class PanneauConfigServeur extends JPanel {
    private JTextField txtAdrServeur, txtNumPort;
    private JButton bOk, bAnnuler;

    public PanneauConfigServeur(String adr, int port) {

        txtAdrServeur = new JTextField(adr, 30);
        txtNumPort = new JTextField(Integer.toString(port), 30);

        txtAdrServeur.setBorder(BorderFactory.createLineBorder(Color.black));
        txtNumPort.setBorder(BorderFactory.createLineBorder(Color.black));

        bOk = new JButton("OK");
        bAnnuler = new JButton("Annuler");

        bOk.setActionCommand("OK");
        bAnnuler.setActionCommand("Annuler");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel pTout = new JPanel(new GridLayout(3,1));

        p1.add(txtAdrServeur);
        p2.add(txtNumPort);

        p3.add(bOk);
        p3.add(bAnnuler);

        this.setLayout(new BorderLayout());
        pTout.add(p1);
        pTout.add(p2);
        pTout.add(p3);
        this.add(pTout, BorderLayout.NORTH);
        this.setBorder(BorderFactory.createLineBorder(new Color(0x00000000,true),200));
    }

    public void setEcouteur(ActionListener ecouteur) {
        bOk.addActionListener(ecouteur);
        bAnnuler.addActionListener(ecouteur);
    }
    public String getAdresseServeur() {
        return txtAdrServeur.getText();
    }
    public String getPortServeur() {
        return txtNumPort.getText();
    }
}
