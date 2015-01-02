/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.event.*;

public class ManejadorBotonConvertir implements ActionListener{
 
    MyWindowSwing mv;
    public ManejadorBotonConvertir(MyWindowSwing mv) {
        this.mv = mv;
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double cantidad = Double.parseDouble(this.mv.txteuros.getText());
        double resultado = 0.0;
        String moneda = "";
        
        //ptas
        if (this.mv.op1.isSelected()){
            resultado = cantidad * 166.386;
            moneda = "pesetas";
        }
        
        //libras
        if (this.mv.op2.isSelected()){
            resultado = cantidad * 0.78;
            moneda = "libras";
        }
        
        //dolares
        if (this.mv.op3.isSelected()){
            resultado = cantidad * 1.35;
            moneda = "dólares";
        }
        
        this.mv.txtlbre.setText(resultado + moneda);
        
    }
    
}
