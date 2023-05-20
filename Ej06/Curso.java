/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Curso {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
     //* precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), 
    
    private String nombreCurso;
    private int cantHoras;
    private int cantDias;
    private String turno;
    private double precioHora;
    private String[] alumnos = new String[5];
    
    //Un constructor por defecto.
//Un constructor con todos los atributos como parámetro.
//Métodos getters y setters de cada atributo.

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHoras, int cantDias, String turno, double precioHora) {
        this.nombreCurso = nombreCurso;
        this.cantHoras = cantHoras;
        this.cantDias = cantDias;
        this.turno = turno;
        this.precioHora = precioHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
  
    //Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases.
    //Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, 
            //solicitando en cada repetición que se ingrese el nombre de cada alumno.
    
    
    public String[] cargarAlumnos(){
        for (int i = 0 ; i < 5; i++){
            
            System.out.println("Ingrese el nombre del alumno:  " + "["+  (i+1)  + "]");
            
            Arrays.fill(alumnos, i, (i+1), leer.nextLine());
            
        }
        //System.out.println(Arrays.toString(alumnos));
        return alumnos;
        
    }
    
    //Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
//* En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
    
    
  public void crearCurso(){
          
      cargarAlumnos();
          
      System.out.println("Ingrese el nombre del curso: ");
      
      nombreCurso = leer.nextLine();
      
      System.out.println("Ingrese la cantidad de horas: ");
      
      cantHoras = leer.nextInt();
      
      System.out.println("Ingrese la cantidad de días: ");
      
      cantDias = leer.nextInt();
      
      
      boolean aux = false;
      leer.skip("\n");
      
     System.out.println("Ingrese el turno:   M O T   (mañana o tarde) ");
      do {
          
         turno = leer.nextLine();
          if(turno.equalsIgnoreCase("m") || turno.equalsIgnoreCase("t") ){
            
         aux = true;
          }
         
      }while (aux != true);
      
      
      System.out.println("Ingrese el precio por hora: ");
      precioHora = leer.nextDouble();
  
      
      
      }
  
  //Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
//* Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
  
  
  public void calcularGananciaSemanal(){
      
       double ganancia;
       ganancia = this.cantHoras * this.precioHora * alumnos.length * cantDias;
       
      System.out.println("La ganancia de tu curso es: " + ganancia);
  }

    @Override
    public String toString() {
        return "Curso{ nombreCurso=" + nombreCurso + ", cantHoras=" + cantHoras + ", cantDias=" + cantDias + ", turno=" + turno + ", precioHora=" + precioHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }
  
  
  
      }


    
