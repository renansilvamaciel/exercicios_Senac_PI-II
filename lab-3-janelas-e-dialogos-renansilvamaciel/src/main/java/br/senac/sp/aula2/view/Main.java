/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula2.view;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author fernando.fernandes
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new WindowsLookAndFeel());
        
        JFrameCustomizadoView telaInicial = new JFrameCustomizadoView();
        telaInicial.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        telaInicial.setVisible(true);
    }
    
}
