/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.uni.controllers;

import app.uni.panels.PnlTemp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author iGeorge
 */
public class TempController implements ActionListener {

    private final PnlTemp pnlTemp;

    public TempController(PnlTemp pnlTemp) {
        this.pnlTemp = pnlTemp;
        initComponent();
    }

    private void initComponent() {
        pnlTemp.getConvertir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double grados;
        double verify;

        
        grados = Double.parseDouble(pnlTemp.getTemperatura().getText());
        int operacion1 = pnlTemp.getFirstConv().getSelectedIndex();
        
        if(pnlTemp.getTemperatura().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Hola que hace");
        } else {
        }
        
        if (operacion1 == 0) {
            pnlTemp.getRespuesta().setText(Double.toString((grados - 32) * (0.55555555555)));
        } else {
            if (operacion1 == 1) {
                pnlTemp.getRespuesta().setText(Double.toString((grados * 1.8) + 32));
            }
        }
    }
}
