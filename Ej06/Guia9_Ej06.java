/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ej06;

import Entidad.Curso;

/**
 *
 * @author nacho
 */
public class Guia9_Ej06 {

    /**
     * @param args the command line arguments
     * Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa 
     * para organizar la información de cada curso. Para ello, crearemos una clase entidad llamada Curso, 
     * cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
     * precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), 
     * donde se alojarán los nombres de cada alumno. 
     * A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
* Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
* En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
* Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
     * 
     */
    public static void main(String[] args) {
        
        
        Curso c1 = new Curso();
        
        //c1.cargarAlumnos();
        c1.crearCurso();
        c1.calcularGananciaSemanal();
        System.out.println(c1.toString());
    }
    
}
