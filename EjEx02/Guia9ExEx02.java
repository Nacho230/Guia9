/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9exex02;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;

/**
 *
 * @author nacho
 */
public class Guia9ExEx02 {

    /**
     * @param args the command line arguments
     * 
     * Juego Ahorcado: Crear una clase Ahorcado (como el juego), 
     * la cual deberá contener como atributos, un vector con la palabra a buscar, 
     * la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
     * Definir los siguientes métodos en AhorcadoService:

     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado a1 = new Ahorcado();
 
        as.juego(a1);
    }
    
}
