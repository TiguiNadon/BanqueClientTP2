package com.atoudeft.controleur;

import com.atoudeft.client.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurOperationsCompte implements ActionListener {
    private Client client;

    public EcouteurOperationsCompte(Client client) {
        this.client = client;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            JButton button = (JButton) source;
            //String actionCommand = button.getActionCommand(); // Assumes buttons have an ActionCommand set
            String nomAction = ((JButton)source).getActionCommand();
            switch (nomAction) {
                case "DEPOT":
                    //handleDeposit();
                    break;

                case "EPARGNE":
                    //methode epargne
                    break;

                case "RETRAIT":
                    //handleWithdraw();
                    break;

                case "HIST":
                    client.envoyer("HIST");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Action non reconnue : " + nomAction);
                    break;
            }
        }
    }



}

