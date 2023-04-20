/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa03cc;

/**
 *
 * @author Angel
 */
public abstract class mensajeAbstracto {
    
    //Ejemplo de clase abstracta, puede tener metodos abstractos y concretos, a diferencia de una interfaz que solamente es abstracta
    
    public void imprimir(){
        System.out.println("hola mundo concreto");
    }
    
    public abstract void msg();
}
