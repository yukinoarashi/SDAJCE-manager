/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.ceff.ict3.sdajcemanager.composants;

import ch.ceff.ict3.sdajcemanager.listeners.AppListener;
import ch.ceff.ict3.sdajcemanager.modele.Carte;
import ch.ceff.ict3.sdajcemanager.modele.Conteneur;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author cp-13jru
 */
public class PageCarte extends JPanel {

    private FormPanelCarte panelCarte;
    private TablePanelCarte tablePanel;

    public PageCarte() {
        initComponents();
    }

    public void initComponents() {

        //toolBar = new ToolBar();
        tablePanel = new TablePanelCarte();
        panelCarte = new FormPanelCarte();

        List<Carte> temp_data = new ArrayList<Carte>();
        tablePanel.setData(temp_data);
        tablePanel.refresh();
        tablePanel.setAutoCreateRowSorter();
        tablePanel.setSorter();
        this.add(panelCarte, BorderLayout.NORTH);
        this.add(tablePanel, BorderLayout.SOUTH);

    }

    public void searchByText(String text) {
        tablePanel.searchByText(text);
    }

    public void searchByType(String text) {
        tablePanel.searchByType(text);
    }

    public void searchBySphere(String text) {
        tablePanel.searchBySphere(text);
    }

    public void searchByConteneur(String text) {
        tablePanel.searchByConteneur(text);
    }

    public void setListener(AppListener appListener) {
        panelCarte.setSearchCarteListener(appListener);
    }

    public void delFilters() {
        tablePanel.delFilters();
    }
}
