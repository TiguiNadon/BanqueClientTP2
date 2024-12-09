package com.atoudeft.vue;

import javax.swing.*;
import java.awt.*;

// Classe abstraite pour les panneaux d'opérations
abstract class PanneauOperation extends JPanel {
    protected JButton btnValider;

    public PanneauOperation() {
        btnValider = new JButton("Valider");
    }

    public abstract void reinitialiser();
}

// Panneau pour le dépôt
class PanneauDepot extends PanneauOperation {
    private JTextField txtMontant;
    private JLabel lblMontant;

    public PanneauDepot() {
        setLayout(new GridLayout(3, 1));

        lblMontant = new JLabel("Montant du dépôt :");
        txtMontant = new JTextField(10);

        add(lblMontant);
        add(txtMontant);
        add(btnValider);
    }

    public double getMontant() {
        try {
            return Double.parseDouble(txtMontant.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Veuillez entrer un montant valide",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public void reinitialiser() {
        txtMontant.setText("");
    }
}

// Panneau pour le retrait
class PanneauRetrait extends PanneauOperation {
    private JTextField txtMontant;
    private JLabel lblMontant;

    public PanneauRetrait() {
        setLayout(new GridLayout(3, 1));

        lblMontant = new JLabel("Montant du retrait :");
        txtMontant = new JTextField(10);

        add(lblMontant);
        add(txtMontant);
        add(btnValider);
    }

    public double getMontant() {
        try {
            return Double.parseDouble(txtMontant.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Veuillez entrer un montant valide",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    @Override
    public void reinitialiser() {
        txtMontant.setText("");
    }
}

// Panneau pour le transfert
class PanneauTransfert extends PanneauOperation {
    private JTextField txtMontant, txtNumeroCompte;
    private JLabel lblMontant, lblNumeroCompte;

    public PanneauTransfert() {
        setLayout(new GridLayout(5, 1));

        lblMontant = new JLabel("Montant du transfert :");
        txtMontant = new JTextField(10);

        lblNumeroCompte = new JLabel("Numéro de compte destinataire :");
        txtNumeroCompte = new JTextField(10);

        add(lblMontant);
        add(txtMontant);
        add(lblNumeroCompte);
        add(txtNumeroCompte);
        add(btnValider);
    }

    public double getMontant() {
        try {
            return Double.parseDouble(txtMontant.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Veuillez entrer un montant valide",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public String getNumeroCompte() {
        return txtNumeroCompte.getText();
    }

    @Override
    public void reinitialiser() {
        txtMontant.setText("");
        txtNumeroCompte.setText("");
    }
}

// Panneau pour paiement de facture
class PanneauPaiementFacture extends PanneauOperation {
    private JTextField txtMontant, txtNumeroFacture, txtDescriptionFacture;
    private JLabel lblMontant, lblNumeroFacture, lblDescriptionFacture;

    public PanneauPaiementFacture() {
        setLayout(new GridLayout(7, 1));

        lblMontant = new JLabel("Montant de la facture :");
        txtMontant = new JTextField(10);

        lblNumeroFacture = new JLabel("Numéro de facture :");
        txtNumeroFacture = new JTextField(10);

        lblDescriptionFacture = new JLabel("Description de la facture :");
        txtDescriptionFacture = new JTextField(20);

        add(lblMontant);
        add(txtMontant);
        add(lblNumeroFacture);
        add(txtNumeroFacture);
        add(lblDescriptionFacture);
        add(txtDescriptionFacture);
        add(btnValider);
    }

    public double getMontant() {
        try {
            return Double.parseDouble(txtMontant.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Veuillez entrer un montant valide",
                    "Erreur",
                    JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public String getNumeroFacture() {
        return txtNumeroFacture.getText();
    }

    public String getDescriptionFacture() {
        return txtDescriptionFacture.getText();
    }

    @Override
    public void reinitialiser() {
        txtMontant.setText("");
        txtNumeroFacture.setText("");
        txtDescriptionFacture.setText("");
    }
}

