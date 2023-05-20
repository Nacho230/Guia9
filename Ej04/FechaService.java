/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nacho
 */

public class FechaService {
    
    //Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento
    
    
    
    public FechaService init(){
        FechaService fs = new FechaService();
        return fs;
        
    }
    

   
    
    public Date fechaNacimiento(FechaService fs){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese día, mes y año de tu fecha de nacimiento: ");
        int dia = leer.nextInt();
        int mes =  leer.nextInt()-1;
        int year = leer.nextInt()-1900;
        
        
        
        Date fecha = new Date(year, mes, dia);
        
        System.out.println("Tu fecha de nacimiento es: " + fecha);
        return fecha;
    }
    
    
    //Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.
    
  public Date fechaActual(FechaService fs){
      
      Date fechaActual= new Date();
      System.out.println("La fecha actual es: " + fechaActual);
      
      return fechaActual;
      
  }  
    
    
    //Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    
    public void diferencia(FechaService fs, Date fechaDeNacimiento, Date fechaActual){
        
       double difEdad =    fechaActual.getYear() - fechaDeNacimiento.getYear();
       
        System.out.println("Los años de diferencia son:   "  + difEdad);
       
       
       
        
    }
    
    
    
    
    
}

