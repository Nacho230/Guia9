/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class PersonaService {
    
    
    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la fecha de nacimiento de la persona: ");
        int dia = leer.nextInt();
        int mes =  leer.nextInt()-1;
        int year = leer.nextInt()-1900;
        
        Date fecha = new Date(year, mes, dia);
        
        p1.setFecha(fecha);
        
        
        //System.out.println(p1.getNombre());
        //System.out.println(p1.getFecha());
        return p1;
        
        
    }
    
    //Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    
    public int calcularEdad(Persona p1){
            
        Date fechaNacimiento = p1.getFecha();
        Date fechaActual = new Date();
//        System.out.println(Math.abs(fechaActual.getYear()-persona.getFechaNacimiento().getYear())+" Años");
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() ||
                (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        
        return anios;
        
        
        
    }
    
  //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
    
    public boolean menorQue(Persona p1, int edad){
        
         return calcularEdad (p1) < edad;
         

}
    
    //Método mostrarPersona que muestra la información de la persona deseada.
    
    public void mostrarPersona(Persona p1){
        
        System.out.println("La información de la persona es: ");
        System.out.println(p1.getNombre());
        System.out.println(p1.getFecha());
        
        
    }
    
    
}
    
    
    
    

