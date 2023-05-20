/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej05;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia9Ej05 {

    /**
     * @param args the command line arguments
     * 
     * Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
     * constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        
        //ps.crearPersona();
        
        ps.calcularEdad(p1);
        System.out.println("Ingrese la edad a comparar");
        System.out.println(ps.menorQue(p1, leer.nextInt()));
        
        ps.mostrarPersona(p1);
    }
    
}
