/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa_02_da;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Singleton {

    private static Singleton s = null;

    public static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }

    private Singleton() {

    }
    
    public void imprimir(){
        Logger.getLogger(Singleton.class.getName()).log(Level.INFO,"Hola...");
    }
}
