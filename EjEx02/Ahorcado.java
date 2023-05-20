/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author nacho
 */
public class Ahorcado {
    // Crear una clase Ahorcado (como el juego), 
    // * la cual deberá contener como atributos, un vector con la palabra a buscar, 
    // * la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
    
   
    private int letrasEncontradas;
    private int jugadas;
    private int longitud;
    private char letra;
    private char[] palabra = new char[longitud];
    private char[] aux;

    public Ahorcado() {
    }

    public Ahorcado(int letrasEncontradas, int jugadas, int longitud, char letra, char[] palabra, char aux) {
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
        this.longitud = longitud;
        this.letra = letra;
        
    }

    //public void ayudin(int posi, char dato){
       // aux[posi] = dato;
   // }
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public char[] getAux() {
        return aux;
    }

    public void setAux(char[] aux) {
        this.aux = aux;
    }

    
}