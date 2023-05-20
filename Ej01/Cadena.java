/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nacho
 */
public class Cadena {
    //Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase 
     //(String) y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. 
     //El constructor con frase como atributo debe setear la longitud de la frase de manera automática. 
    
    
    private String frase;
    private  double longitud;

    public Cadena() {
    }

    public Cadena(String frase, double longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
  
}
