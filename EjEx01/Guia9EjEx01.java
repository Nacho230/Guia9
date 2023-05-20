/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejex01;


import Entidad.Vectorsito;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia9EjEx01 {

    /**
     * @param args the command line arguments
     * Crea una clase en Java donde declares una variable de tipo array de Strings 
     * que contenga los doce meses del año, en minúsculas. A continuación, 
     * declara una variable mesSecreto de tipo String, y hazla igual a un 
     * elemento del array (por ejemplo, mesSecreto = mes[9]. 
     * El programa debe pedir al usuario que adivine el mes secreto. 
     * Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que 
     * vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Vectorsito v1 = new Vectorsito();
boolean bandera=false;
        do {

            System.out.println("Ingrese el mes secreto: ");
            String mes = leer.nextLine();


                if (mes.equals(v1.getMesSecreto())){
                    System.out.println("encontro el mes secreto");
              bandera =true;
                }else{
                    System.out.println("vuelva a intentarlo");
                }

        } while (!bandera);

    }
}
