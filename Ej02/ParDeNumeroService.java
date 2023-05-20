/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;
import Entidad.ParDeNumeros;
/**
 *
 * @author nacho
 */
public class ParDeNumeroService {
    
 
   //Método mostrarValores que muestra cuáles son los dos números guardados.
    
    public ParDeNumeros init(){
        ParDeNumeros n1 = new ParDeNumeros();
        return n1;
    }
    
    public void mostrarValores(ParDeNumeros n1){
        
        System.out.println("Los numeros guardados son:");
        System.out.println(n1.getNum1());
        System.out.println(n1.getNum2());
        
    }
    
    //Método devolverMayorp para retornar cuál de los dos atributos tiene el mayor valor
    
    public void devolverMayor(ParDeNumeros n1){
        
        System.out.println("El numero más alto es: " + Math.max(n1.getNum1(), n1.getNum2()));
        
    }
    
    //Método calcularPotencia para calcular la potencia del 
    //mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    
    public void calcularPotencia(ParDeNumeros n1){
        
        Math.round(n1.getNum1());
        System.out.println(Math.round(Math.max(n1.getNum1(), n1.getNum2() ) ));
        System.out.println(Math.round(Math.min(n1.getNum1(), n1.getNum2() )));
        System.out.println("La potencia del mayor numero y del menor numero es: ");
        System.out.println(Math.pow((Math.round(Math.max(n1.getNum1(), n1.getNum2()))), (Math.round(Math.min(n1.getNum1(), n1.getNum2()) ))));
    }
    
    //Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
  //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    
    
    public void calcularRaiz(ParDeNumeros n1){
        System.out.println("La raiz del menor numero absoluteado es: ");
        System.out.println(Math.min(n1.getNum1(), n1.getNum2()));
        System.out.println(Math.abs(Math.min(n1.getNum1(), n1.getNum2())));
        System.out.println(Math.sqrt(Math.abs(Math.min(n1.getNum1(), n1.getNum2()))));
    }
    
    
}
