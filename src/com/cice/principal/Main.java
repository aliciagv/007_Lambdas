/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.interfaces.IFuncional;
import com.cice.interfaces.IFuncionalLista;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

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
        IFuncional ifuncional1= (a,b) -> (System.out.println("La suma es:" + (a+b)));
        //ANALISIS DE LA EXPRESIÓN LAMBDA
        //(a,b) Esto es los parámetros de entrada
        // -> Esto es operador Lambda
        //(..) Funcionalidad del método
        ifuncional1.suma(4,6);
        
        ifuncional1 = (a,b) -> (System.out.println("La suma es otra cosa ahora"));
        ifuncional1.suma(2, 3);
        
        //Otro tipo de cuerpo para las expresiones lambda
        ifuncional1 = (a,b) -> {
            //Esto es un bloque de código
        };
        /************************************************************/
        
        // D A C M
        // A D C M
        // A C D M
        
        List<String> nombres = new ArrayList<>();
        nombres.add("Gustavo");
        nombres.add("Pedro");
        nombres.add("Marcela");
        nombres.add("Ana");
        nombres.add("Virginia");
        nombres.add("Sergio");
        nombres.add("Sara");
       // ordenar(nombres);
        
       
        IFuncionalLista ifuncionalista2 = (a) -> (new ArrayList<>(new PriorityQueue<>(a)));
        ifuncionalista2.ordenarLista(nombres);
        for (String nombre: nombres){
            System.out.println(nombre);
        }

        
        
      
        
    }
     public static List<String> ordenar(List<String> lista) {
     /*Una cola es un tipo de colección en la que los elementos se colocan siguiendo el orden natural
        del tipo de objeto que se trate. Pro ejemplo, en una cola de cadenas de caracteres el orden
        natural se correspondería con la ordenación alfabética de los elementos*/
   
        PriorityQueue<String> cola = new PriorityQueue<>(lista);
        //return new ArrayList(cola);
        
        int size=cola.size();
        for (int i =0; i<size;i++){
            
            System.out.println("Nombre: "+ cola.poll());
            lista.add(i, cola.poll());
        }
        
     return lista;
     }
    
}
