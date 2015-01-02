/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graficos;


public class UnidadKOW {
    
    private String army;
    private String nombre;
    private int puntos;
    
    
    public UnidadKOW(){}
    
    public UnidadKOW(String army, String nombre, int puntos){
    
        this.army = army;
        this.nombre = nombre;
        this.puntos = puntos;
    }
    
    public String getArmy(){
        return this.army;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
    
    public void setArmy(String army){
        this.army = army;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
}
