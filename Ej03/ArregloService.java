/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author nacho
 */
public class ArregloService {
    
    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    
    public void inicializarA(double[] a1) {
        for (int i = 0; i < a1.length; i++) {
            a1[i] = Math.random() * 50;
        }
    }
    public void Mostrar(double[] a1) {

        for (int i = 0; i < a1.length; i++) {
            // System.out.println(a1[i]);
            System.out.println("[" + a1[i] + "]");
        }
    }
    public void Ordenar(double[] a1) {
        // Arrays.sort(a1.length,1);
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[j] > a1[i]) {
                    double aux = a1[j];
                    a1[j] = a1[i];
                    a1[i] = aux;
                }
            }
        }
        //for (int i = 0; i < a1.length; i++) {

          //  System.out.println(a1[i]);
        //}s
    
    }
    public void inicializarB(double[] a1,double[] b1){
    Arrays.fill(b1,10,20,0.5);
    System.arraycopy(a1,0,b1,0,10);
        
    }
}
    
 