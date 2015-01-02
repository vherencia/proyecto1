/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Administrador
 */
public class ManejadorSliderPuntosUnidad implements ChangeListener{

    MyWindowSwing2 mv;
    public ManejadorSliderPuntosUnidad(MyWindowSwing2 mv){
        this.mv = mv;
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        Integer valor = this.mv.jslPuntos.getValue();
        this.mv.jtfPuntos.setText(valor.toString());
    }
    
}
