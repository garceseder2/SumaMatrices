/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumamatrices;

import java.util.Scanner;

/**
 *
 * @author garceseder2
 */
public class SumaMatrices{
    
    Scanner t = new Scanner(System.in);
    int matrizA[][] = new int [2][3];
    int matrizB[][] = new int [2][3];
    int matrizC[][] = new int [2][3];
    int valor = 0;
    
    public void LlenarMatrizA(){
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.println("M1 Ingresa Valor X" + (i+1) + " J" + (j+1));
                valor = t.nextInt();
                matrizA[i][j]=valor;
            }
            
        }
    
    }
    
    
    public void LlenarMatrizB(){
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.println("M2 Ingresa Valor X" +  (i+1) + " J" + (j+1));
                valor = t.nextInt();
                matrizB[i][j]=valor;
            }
            
        }
    
    }
    
    public void Suma(){
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 3; j++) {
                matrizC[i][j]=matrizA[i][j]+matrizB[i][j];
                System.out.println("El valor de la suma  de las pocisiones X" +  (i+1)+" X="+matrizA[i][j] + " J" + (j+1)+"="+(matrizB[i][j]) +" es igual a "+ (matrizC[i][j]));
            }
            
        }
    
    }
    
    
    
    
    
    
}
