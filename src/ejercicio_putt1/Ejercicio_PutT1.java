/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_putt1;
import Biblioteca.*;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Ejercicio_PutT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        Pila pila = new Pila();
        
        int opcion;
        String titulo, autor;
        
        do{
            System.out.println("\n---- BIBLIOTECA ----");
            System.out.println("1: Apilar Libro");
            System.out.println("2: Desapilar Libro");
            System.out.println("3: Mostrar Libros");
            System.out.println("0: Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el título: ");
                    titulo = leer.nextLine();
                    System.out.print("Ingrese el autor: ");
                    autor = leer.nextLine();                    
                    System.out.print("Ingrese el año de publicación: ");
                    int anioPublicacion = leer.nextInt();
                    System.out.print("Ingrese el numero de páginas: ");
                    int numeroPaginas = leer.nextInt();

                   Libro libro = new Libro(titulo, autor, numeroPaginas, anioPublicacion);
                    pila.apilar(libro);

                    System.out.println("Libro apilado correctamente.");
                    break;

                case 2:
                    pila.desapilar();
                    break;

                case 3:
                    pila.Mostrar();
                    break;

                case 0:
                    System.out.println("Saliendoooo....");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }while(opcion != 0);
    }
    
}
