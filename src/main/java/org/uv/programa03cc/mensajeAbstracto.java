/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public abstract class mensajeAbstracto {
    
    //Ejemplo de clase abstracta, puede tener metodos abstractos y concretos, a diferencia de una interfaz que solamente es abstracta
    
    public void imprimir(){
        Logger.getLogger(mensajeAbstracto.class.getName()).log(Level.INFO, "Hola mundo abstracto");

    }
    
    public abstract void msg();
}
