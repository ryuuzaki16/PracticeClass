/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.uni.controllers;

import app.uni.panels.PnlCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author iGeorge
 */
public class CalculateController implements ActionListener {
    
    private PnlCalculator pnlCalculate;

    public CalculateController(PnlCalculator pnlCalculate) {
        this.pnlCalculate = pnlCalculate;
        initComponent();
    }

    private void initComponent() {
        pnlCalculate.getCalculate().addActionListener(this);
    }
    
    
     @Override
    public void actionPerformed(ActionEvent a) {
        if (a.getActionCommand().equalsIgnoreCase("Calcular")) {
            double n1, n2;
            n1 = Double.parseDouble(pnlCalculate.getNumber1().getText());
            n2 = Double.parseDouble(pnlCalculate.getNumber2().getText());
            int operacion = pnlCalculate.getOperations().getSelectedIndex();

            switch (operacion) {
                case 0:
                    pnlCalculate.getResultado().setText(String.valueOf((n1 + n2)));
                    break;
                case 1:
                    pnlCalculate.getResultado().setText(String.valueOf((n1 - n2)));
                    break;
                case 2:
                    pnlCalculate.getResultado().setText(String.valueOf((n1 * n2)));
                    break;
                case 3:
                    pnlCalculate.getResultado().setText(String.valueOf((n1 / n2)));
                    break;
                default:
                    break;
            }
        }
    }

   
   
    
}
