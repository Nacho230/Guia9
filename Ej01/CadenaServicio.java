/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena init(){
    Cadena c1 = new Cadena();
        System.out.println("Ingrese la frase: ");
    c1.setFrase(leer.nextLine());
    return c1;
    
}
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
    public int mostrarVocales(Cadena c1){
        int cont = 0;
        for (int i = 0 ; i < c1.getFrase().length(); i++){
            char letra = c1.getFrase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cont ++;
            }
        }
        
        return cont;
    }
    
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    
    public void invertirFrase(Cadena c1){
        
        System.out.println("Entrada: ");
        System.out.println(c1.getFrase());
        
        System.out.println("Salida: ");
       for (int i = c1.getFrase().length()-1; i >= 0 ; i--){
           char letra = c1.getFrase().charAt(i);
           System.out.print(letra);
       }
           System.out.println("");
    }
    
    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    public void vecesRepetido(Cadena c1){
        System.out.println("Ingrese la letra a buscar en la frase: ");
        String letra = String.valueOf(leer.nextLine().charAt(0));
        char l1;
        int num = 0;
        for (int i = 0 ; i < c1.getFrase().length(); i++){
            if (letra.equalsIgnoreCase(String.valueOf(c1.getFrase().charAt(i)))) {
                num ++;
            }
        }
        System.out.println("El caracter = " + letra + " Se repite " + num + " veces " );
}
    
    
    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
    
    public void compararLongitud(Cadena c1){
        
        System.out.println("Ingrese la frase a comparar");
        String frase = leer.nextLine();
       
        //if (c1.getFrase().compareTo(frase) == 0) {
           // System.out.println("Son iguales");
        //}else{
          //  System.out.println("No son iguales, pelotudo");
        //}
        
        if (c1.getFrase().length() == frase.length()) {
            System.out.println("La longitud de las frases son iguales, campeon");
        }else{
            System.out.println("No son iguales, pelotudo");
        }
    }
    
    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    
    public void unirFrases(Cadena c1){
    System.out.println("Ingrese la frase a concatenar");
    String frase = leer.nextLine();
    
        System.out.println("Tu frase de mierda concatenada es: ");
        System.out.println(c1.getFrase().concat(frase));  
    }
    
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    
    public void reemplazar(Cadena c1){
    System.out.println("Ingrese el caracter que va a reemplazar por 'a' : ");
        char letra = (leer.nextLine().charAt(0));
        
        System.out.println(c1.getFrase().replace('a', letra));
}
    
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    
    public void contiene(Cadena c1){
        System.out.println("Ingrese la letra a buscar ");
        String letra = leer.nextLine();
        
        if (c1.getFrase().contains(letra)) {
            System.out.println("La frase contiene la letra");
        }else{
            System.out.println("La frase NO contiene la letra");
        }
    }
}