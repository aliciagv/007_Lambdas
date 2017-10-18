/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.interfaces.IFuncional;

/**
 *
 * @author cice
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IFuncional ifuncional = new IFuncional() {
            @Override
            public void suma(int a, int b) {
               System.out.print("La suma es:" + (a+b));
            }
        };
        
        //Expresión lambda
        IFuncional ifuncional1= (a,b) -> (System.out.print("La suma es:" + (a+b)));
        //ANALISIS DE LA EXPRESIÓN LAMBDA
        //(a,b) Esto es los parámetros de entrada
        // -> Esto es operador Lambda
        //(..) Funcionalidad del método
        ifuncional1.suma(4,6);
        
        ifuncional1 = (a,b) -> (System.out.print("La suma es otra cosa ahora"));
        ifuncional1.suma(2, 3);
        
        //Otro tipo de cuerpo para las expresiones lambda
        ifuncional1 = (a,b) -> {
            //Esto es un bloque de código
        };
        
        
    }
    
}
