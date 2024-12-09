package com.atoudeft.controleur;

import com.atoudeft.client.Client;
import com.atoudeft.vue.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurOperationsCompte implements ActionListener {
    private Client client;
    private JPanel panneauOperations;

    public EcouteurOperationsCompte(Client client, JPanel panneauOperations) {
        this.client = client;
        this.panneauOperations = panneauOperations;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();

        if (source instanceof JButton) {
            String action = ((JButton)source).getActionCommand();

            switch (action) {
                case "DEPOT":
                    client.envoyer("DEPOT");
                    break;
                case "RETRAIT":
                    client.envoyer("RETRAIT");
                    break;
                case "TRANSFER":
                    client.envoyer("TRANSFER");
                    break;
                case "FACTURE":
                    client.envoyer("FACTURE");
                    break;
                case "HIST":
                    client.envoyer("HIST");
                    break;
                case "EPARGNE":
                    // Logique pour créer un compte épargne si nécessaire
                    break;
                default:
                    JOptionPane.showMessageDialog(panneauOperations,
                            "Action non reconnue : " + action);
                    break;
            }
        }
    }
}