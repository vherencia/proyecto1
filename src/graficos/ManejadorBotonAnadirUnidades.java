/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class ManejadorBotonAnadirUnidades implements ActionListener {

    MyWindowSwing2 mv;
            
    public ManejadorBotonAnadirUnidades(MyWindowSwing2 mv){
        this.mv = mv;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        try{
            String army = (String)this.mv.cb.getSelectedItem();
            String nombre = this.mv.jtfNombre.getText();
            Integer puntos = Integer.parseInt(this.mv.jtfPuntos.getText());

            UnidadKOW unidad = new UnidadKOW(army, nombre, puntos);

            this.mv.dlm.addElement(unidad);
            this.mv.dtm.addRow(new Object[]{army, nombre, puntos.toString()});
        }
        catch(NumberFormatException ex){
            try {
                throw new ExceptionAnadirUnidades("El campo puntos no es un número");
            } catch (ExceptionAnadirUnidades ex1) {
                this.mv.lbError.setText(ex1.getMessage());
            }
        }
        catch(Exception ex){
            try {
                throw new ExceptionAnadirUnidades();
            } catch (ExceptionAnadirUnidades ex1) {
                this.mv.lbError.setText(ex1.getMessage());
            }
        }
        
    }
    
}
