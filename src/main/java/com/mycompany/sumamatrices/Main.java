/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumamatrices;


/**
 *
 * @author garceseder2
 */
public class Main {
    
     public static void main(String[] arg) {
        
         System.out.println("Hola Mundo Cruel");
         SumaMatrices sumaMatrices = new SumaMatrices();
         System.out.println("Valores Matriz 1");
         sumaMatrices.LlenarMatrizA();
         System.out.println("Valores Matriz 2");
         sumaMatrices.LlenarMatrizB();
         System.out.println("Suma de las Marices");
         sumaMatrices.Suma();
         

    }
    
}
