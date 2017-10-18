/*
 * INTERFAZ FUNCIONAL -> aquella interfz que sólo contiene un único método abtracto.
 * NOTA: Una Interfaz Funcional, puede considerarse como tal aunque incluya métodos por defecto
 * Los método por defecto son una funcionalida de las interfaces en JAVA SE 8 -> JDK 1.8
 */
package com.cice.interfaces;

/**
 *
 * @author cice
 */
public interface IFuncional {
    
    void suma (int a,int b); //Método abstracto
    
    //Estos métodos por defecto pueden definir una funiconalidad del método pero también puede ser sobreescritos para cambiar su funcionalidad.
    
    default void resta(int a, int b){
        System.out.println("La resta es: "  + (a-b));
    }
    
}
