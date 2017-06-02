/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.ceff.ict3.sdajcemanager.actions;

import ch.ceff.ict3.sdajcemanager.listeners.AppListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author cp-14luf
 */
public class OuvrirAideAction extends Action {
    
    public OuvrirAideAction(String text, ImageIcon icon, String desc, int mnemonic, AppListener listener) {
        super(text, icon, desc, mnemonic, listener);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.listener.ouvrirAide();
    }
}
