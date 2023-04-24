/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa_02_da;

public class Programa_02_DA {

    public static void main(String[] args) {
        //Singleton singleton = new Singleton
        Singleton singleton=Singleton.getInstance();
        singleton.imprimir();
        
    }
}
