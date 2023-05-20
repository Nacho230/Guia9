/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 */
public class AhorcadoServicio {
    //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
    //Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    //Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
    //     en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Ahorcado a1 = new Ahorcado();

    private char[] encontro; 
    
    public Ahorcado crearJuego(Ahorcado a1) {

        a1.setLetrasEncontradas(0);
        
        
        String cadena = JOptionPane.showInputDialog("Ingrese la palabra: ");

        a1.setLongitud(cadena.length());

        a1.setPalabra(cadena.toCharArray());
        //System.out.println("La longitud de la palabra es: " + a1.getLongitud());

        a1.setJugadas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de jugadas maxima: ")));

        System.out.println(Arrays.toString(a1.getPalabra()));
        
         encontro = new char[a1.getPalabra().length];
        Arrays.fill(encontro, '_');
        return a1;

        //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.
    }

    public void longitud(Ahorcado a1) {
        JOptionPane.showMessageDialog(null, "La longitud de la palabra es: " + a1.getLongitud());

    }

    //Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
    //si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    
    public boolean buscarLetra(Ahorcado a1) {
        boolean aux = false;
        
        a1.setLetra(Character.toLowerCase(JOptionPane.showInputDialog("Ingrese la letra a buscar " ).charAt(0)));
        
        for (int i = 0; i < a1.getLongitud(); i++) {
            if (a1.getLetra() == a1.getPalabra()[i]) {
                
               aux =  true;
            }
        }
       
        return aux;
    }
    
    
    
            //Método encontradas(letra):  que reciba una letra ingresada por el usuario 
            // y muestre cuantas letras han sido encontradas y cuántas le faltan. 
            //       Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, 
            //             cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.

    public boolean encontradas(Ahorcado a1){
      boolean alcides = buscarLetra(a1);
      int cont = 0;
//System.out.print(Arrays.toString(a1.getAux()));
  //           System.out.println("");
    //         System.out.println("La letra aparece: " + cont + " veces ");
             
    for (int i = 0 ; i < a1.getLongitud(); i++){
        if (a1.getLetra() == a1.getPalabra()[i]) {
            //if(a1.getLetra() == encontro[i]){
                // JOptionPane.showMessageDialog(null, "La letra ya ha sido ingresada previamente");
            
            encontro[i] = a1.getLetra();
            cont++;
            a1.setLetrasEncontradas(a1.getLetrasEncontradas()+1);
            
        }
        
        
        
    }
    
         JOptionPane.showMessageDialog(null,Arrays.toString(encontro));
         JOptionPane.showMessageDialog(null,"La letra se encontró " + cont + " veces" + " y le faltan " + (a1.getPalabra().length - a1.getLetrasEncontradas()) + " letras ");
    return alcides;
    
    }
    



         //Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
         
         public void intentos(Ahorcado a1){
             
             JOptionPane.showMessageDialog(null, "Le quedan " + a1.getJugadas() + " intentos ");
             
         }
         
         //Método juego(): el método juego se encargará de llamar todos los métodos 
         //previamente mencionados e informará cuando el usuario descubra toda la palabra 
           //      o se quede sin intentos. Este método se llamará en el main.
         
         
         public void juego(Ahorcado a1){

        crearJuego(a1);
        for (int i = 0 ; i < 15; i++){
            System.out.println("");
        }
        longitud(a1);
        intentos(a1);
        do {
            if (!encontradas(a1)) {
                a1.setJugadas(a1.getJugadas() - 1);
                intentos(a1);
            }
            
        } while (a1.getJugadas() > 0 && a1.getLetrasEncontradas() < a1.getPalabra().length);
       
             if (a1.getJugadas() == 0) {
                 
                 JOptionPane.showMessageDialog(null, "Lamentablemente PERDISTE");
                 JOptionPane.showMessageDialog(null, "La palabra era: " + Arrays.toString(a1.getPalabra()));
             }else{
                 JOptionPane.showMessageDialog(null, "GANASTE");
             }
    }
}
