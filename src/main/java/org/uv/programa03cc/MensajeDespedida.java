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
public class MensajeDespedida extends MensajeAbstracto {

    @Override
    public void msg() {
        Logger.getLogger(MensajeDespedida.class.getName()).log(Level.INFO, "Adios mundo");
    }
    
}
