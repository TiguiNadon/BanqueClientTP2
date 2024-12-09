package com.atoudeft.vue;

import com.atoudeft.client.Client;
import com.atoudeft.controleur.EcouteurConnexion;
import com.atoudeft.controleur.EcouteurListeComptes;

import javax.swing.*;
import java.awt.*;

/**
 * Main panel for the banking application.
 * Handles login, account management, and operation panels.
 *
 * @author Abdelmoumène Toudeft
 * @version 1.1
 * @since 2024-11-01
 */
public class PanneauPrincipal extends JPanel {
    private Client client;
    private PanneauConnexion panneauConnexion;
    private JPanel panneauCompteClient;
    private JPanel panneauOperations;

    private DefaultListModel<String> numerosComptes;
    private JList<String> jlNumerosComptes;

    public PanneauPrincipal(Client client) {
        this.client = client;

        // Initialize the connection panel
        panneauConnexion = new PanneauConnexion();
        panneauConnexion.setEcouteur(new EcouteurConnexion(client, panneauConnexion));

        // Initialize the account client panel
        panneauCompteClient = new JPanel(new BorderLayout());
        panneauCompteClient.setBackground(Color.WHITE);

        // Initialize the operations panel container with CardLayout
        panneauOperations = new JPanel(new CardLayout());
        panneauOperations.setBackground(Color.WHITE);

        // Create account list
        numerosComptes = new DefaultListModel<>();
        jlNumerosComptes = new JList<>(numerosComptes);
        jlNumerosComptes.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        jlNumerosComptes.setBorder(BorderFactory.createTitledBorder("Comptes bancaires"));
        jlNumerosComptes.setPreferredSize(new Dimension(250, 500));
        jlNumerosComptes.addMouseListener(new EcouteurListeComptes(client));

        // Add components to the account client panel
        panneauCompteClient.add(panneauOperations, BorderLayout.CENTER);
        panneauCompteClient.add(jlNumerosComptes, BorderLayout.WEST);
        panneauCompteClient.setVisible(false);

        // Set layout and add panels to the main panel
        this.setLayout(new BorderLayout());
        this.add(panneauConnexion, BorderLayout.NORTH);
        this.add(panneauCompteClient, BorderLayout.CENTER);
    }

    /**
     * Clear all displayed elements in the main panel.
     */
    public void vider() {
        numerosComptes.clear();
        panneauOperations.removeAll();
    }

    /**
     * Hide the login panel.
     */
    public void cacherPanneauConnexion() {
        panneauConnexion.effacer();
        panneauConnexion.setVisible(false);
    }

    /**
     * Show the login panel.
     */
    public void montrerPanneauConnexion() {
        panneauConnexion.setVisible(true);
    }

    /**
     * Hide the account management panel.
     */
    public void cacherPanneauCompteClient() {
        panneauCompteClient.setVisible(false);
        numerosComptes.clear();
    }

    /**
     * Show the account management panel.
     */
    public void montrerPanneauCompteClient() {
        panneauCompteClient.setVisible(true);
    }

    /**
     * Add an account number to the JList of accounts.
     *
     * @param str the account number
     */
    public void ajouterCompte(String str) {
        numerosComptes.addElement(str);
    }

    /**
     * Display the operations panel in the account management interface.
     *
     * @param panneauOperations the panel containing operations
     */
    public void afficherPanneauOperations(JPanel panneauOperations) {
        this.panneauOperations.removeAll(); // Clear any existing panels
        this.panneauOperations.add(panneauOperations, BorderLayout.CENTER);
        this.panneauOperations.revalidate(); // Revalidate the layout
        this.panneauOperations.repaint(); // Repaint to reflect changes
    }
}
