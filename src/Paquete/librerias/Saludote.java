/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete.librerias;

/**
 *
 * @author Batman
 */
public class Saludote {
    String Nombre;

    public Saludote(String Nombre) {
        this.Nombre= Nombre;
    }
    
    public String Msg(){
        return("Bienvenido " + Nombre + ", estamos usando librerias");
    }
    
    
}
