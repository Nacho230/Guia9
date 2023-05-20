/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ej01;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia9Ej01 {

    /**
     * Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase 
     * (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
     * El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
     * Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

     * 
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.init();

        int menu;

        do {

            System.out.println( "\u001B[32m" + " ¡¡EL MENU DE LAS FRASES!!" + "\u001B[32m");
            System.out.println("\u001B[35m" + "------------------------------------------" + "\u001B[35m");
            System.out.println("\u001B[36m" + "1. Ver cuantas vocales tiene tu frase \n"
                    + "\u001B[36m"+  "2. Inverti tu frase (Gratis)  \n"
                    + "\u001B[37m"+"3. Cuantas veces se repite una letra \n"
                    + "\u001B[37m"+"4. Comparar longitud de frases \n"
                    + "\u001B[33m"+"5. Uni tu frase \n"
                    + "\u001B[37m"+"6. Reemplaza la letra A de tu frase por el caracter deseado  \n"
                    + "\u001B[36m"+ "7. Busca una letra en tu frase \n"
                    + "8. Salir"  + "\u001B[36m");
              System.out.println("\u001B[31m"+ "Ingrese la opcion"+ "\u001B[31m");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("La cantidad de vocales son: " + cs.mostrarVocales(c1));
                    System.out.println("");
                    break;
                case 2:
                    cs.invertirFrase(c1);
                    System.out.println("");
                    break;
                case 3:
                    cs.vecesRepetido(c1);
                    System.out.println("");
                    break;
                case 4:
                    cs.compararLongitud(c1);
                    System.out.println("");
                    break;
                case 5:
                    cs.unirFrases(c1);
                    System.out.println("");
                    break;
                case 6:
                    cs.reemplazar(c1);
                    System.out.println("");
                    break;
                case 7:
                    cs.contiene(c1);
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    
                    break;
                default:
                    System.out.println("Ingreseaste mal una opción del menú, aprendé a contar");
            }

        } while (menu != 8);

    }

}
