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
public class MensajeDespedidaI implements IMensaje{

    @Override
    public void msg() {   
        Logger.getLogger(MensajeDespedidaI.class.getName()).log(Level.INFO, "Adios desde interface");
    }
    
}
