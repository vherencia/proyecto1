/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Administrador
 */
public class ManejadorListaUnidades implements ListSelectionListener{

    MyWindowSwing2 mv;
    
    public ManejadorListaUnidades(MyWindowSwing2 mv){
        this.mv = mv;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        UnidadKOW unidad = (UnidadKOW)this.mv.jl.getSelectedValue();
        this.mv.lbInfoArmy.setText("El army es " + unidad.getArmy());
        this.mv.lbInfoNombre.setText("La unidad es " + unidad.getNombre());
        this.mv.lbInfoPuntos.setText("Puntos: " + unidad.getPuntos());
    }
    
}
