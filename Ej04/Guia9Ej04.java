/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej04;

import Servicio.FechaService;
import java.util.Date;



/**
 *
 * @author nacho
 */
public class Guia9Ej04 {

    /**
     * @param args the command line arguments
     * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
* Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
      FechaService fecha =new FechaService();
      //Date Nac= fecha.fechaNacimiento();
      //Date Act= fecha.fechaActual();
     
       
      Date fechaNacimiento = fecha.fechaNacimiento(fecha);
      Date fechaActual = fecha.fechaActual(fecha);
      
       //fecha.fechaNacimiento(fecha);
       //fecha.fechaActual(fecha);
       fecha.diferencia(fecha, fechaNacimiento, fechaActual);
       
       
    }
}