/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;

/**
 *
 * @author Administrador
 */
public class ExceptionAnadirUnidades extends Exception{
    
    public ExceptionAnadirUnidades(){
        super("Los datos de entrada no son correctos");
    }
    
    public ExceptionAnadirUnidades(String message){
        super(message);
    }
    
}
