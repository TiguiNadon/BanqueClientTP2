package com.atoudeft.controleur;

import com.atoudeft.client.Client;
import com.atoudeft.vue.PanneauConnexion;
import com.atoudeft.vue.PanneauOperationsCompte;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurOperationsCompte implements ActionListener {
    private Client client;
    private PanneauConnexion panneauConnexion;

    public EcouteurOperationsCompte(Client client) {
        this.client = client;
    }

    //Lucas et Guillaume
    @Override
    public void actionPerformed(ActionEvent e) {
        //à compléter :
        Object source = e.getSource();
        String action;
        String alias;

        if(source instanceof JMenuItem){
            action = ((JMenuItem)source).getActionCommand();

            switch(action){
                case "Connect":
                    client.envoyer("Connect"+panneauConnexion.getNumeroCompteClient()+":"+panneauConnexion.getNip());
                    break;
                case "Depot":
                    break;
                case "Retrait":
                    break;
                case "Facture":
                    break;
                case "Transfert":
                    break;
            }
        }
    }
}
