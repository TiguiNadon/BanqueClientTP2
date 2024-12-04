package com.atoudeft.vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

//Lucas et Guillaume
public class PanneauOperations extends JPanel {
    private JLabel lblMontant, lblDepot, lblRetrait, lblNumFacture, lblDescription, lblNumCompte;
    private JTextField fldMontant, fldDepot, fldRetrait, fldNumFacture, fldDescription, fldNumCompte;
    private JButton btnConfirm;

    private PanneauOperationsCompte panneauOperationsCompte;


    public PanneauOperations(){
        btnConfirm = new JButton("Confirmer");

        lblMontant = new JLabel("Montant");
        lblDepot = new JLabel("Depot");
        lblRetrait = new JLabel("Retrait");
        lblNumFacture = new JLabel("Numero facture");
        lblDescription = new JLabel("Description");
        lblNumCompte = new JLabel("Numero de compte");

        fldMontant = new JTextField();
        fldDepot = new JTextField();
        fldRetrait = new JTextField();
        fldNumFacture = new JTextField();
        fldDescription = new JTextField();
        fldNumCompte = new JTextField();
    }


//    public void Depot(){
//
//    }
//    public void Retrait(){
//
//    }
//    public void PayerFacture(){
//
//    }
//    public void Transfert(){
//
//    }
}
