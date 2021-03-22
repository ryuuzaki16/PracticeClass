/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.uni.controllers;

import app.uni.panels.PnlMoney;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author iGeorge
 */
public class MoneyController implements ActionListener{
    
    private PnlMoney pnlMoney;
    
    public MoneyController (PnlMoney pnlMoney){
      this.pnlMoney = pnlMoney;
      initComponent();
    }
    
    private void initComponent() {
        pnlMoney.getChange().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double af1;
        af1 = Double.parseDouble(pnlMoney.getPrimero().getText());
        
        if(pnlMoney.getDolar().isSelected()){
           pnlMoney.getSegundo().setText(String.valueOf(af1*34.79));
        }else if(pnlMoney.getCordoba().isSelected()){
            pnlMoney.getSegundo().setText(String.valueOf(af1*0.029));
        }
    }

    
    
    
}
