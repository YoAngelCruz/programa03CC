/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Programa03CC {

    public static void main(String[] args) {
        MensajeAbstracto ma=null;
        
        ma= new MensajeSaludo();
        ma.msg();
        
        ma = new MensajeDespedida();
        ma.msg();
        
        ma = new MensajeAbstracto() {
            @Override
            public void msg() {
                Logger.getLogger(Programa03CC.class.getName()).log(Level.INFO, "Otro...");

            }
        };
        ma.msg();
        
        IMensaje ms = null;
        
        ms = new MensajeSaludoI();
        ms.msg();
        
        ms = new MensajeDespedidaI();
        ms.msg();
        
        //Intancia anonima
        ms = new IMensaje() {
            @Override
            public void msg() {
                Logger.getLogger(Programa03CC.class.getName()).log(Level.INFO, "Otro...");         
            }
        };
        ms.msg();
    }
}
