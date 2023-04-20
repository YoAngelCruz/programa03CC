/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03cc;

/**
 *
 * @author Angel
 */
public class Programa03CC {

    public static void main(String[] args) {
        //mensajeAbstracto ma=null;
        
        //ma= new MensajeSaludo();
        //ma.msg();
        
        //ma = new MensajeDespedida();
        //ma.msg();
        
        //ma = new mensajeAbstracto() {
         //   @Override
          //  public void msg() {
            //    System.out.println("otro...");
            //}
        //};
        //ma.msg();
        
        IMensaje ma = null;
        
        ma = new MensajeSaludoI();
        ma.msg();
        
        ma = new MensajeDespedidaI();
        ma.msg();
        
        //Intancia anonima
        ma = new IMensaje() {
            @Override
            public void msg() {
                System.out.println("otro...");            
            }
        };
        ma.msg();
    }
}
