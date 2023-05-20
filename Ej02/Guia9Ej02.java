/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej02;
import Entidad.ParDeNumeros;
import Servicio.ParDeNumeroService;

/**
 *
 * @author nacho
 */
public class Guia9Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
ParDeNumeroService ps = new ParDeNumeroService();
        
        ParDeNumeros n1 = ps.init();
        
        ps.mostrarValores(n1);
        ps.devolverMayor(n1);
        ps.calcularPotencia(n1);
        ps.calcularRaiz(n1);

   
     }   
    }
   