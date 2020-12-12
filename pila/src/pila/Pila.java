package pila;

import java.util.Scanner;

public class Pila {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Bienvenido a la pila de datos");
        System.out.println("Digite el tamaño de la pila");
        
        int tamaño= leer.nextInt();
        int dato=0, opc=0;
        pilas a=new pilas(tamaño);
        
        do{
            System.out.println("¡que desea hacer?");
            System.out.println("1: Ingresar dato");
            System.out.println("2. Eliminar dato");
            System.out.println("3: Saber si la pila esta vacia");
            System.out.println("4: Tamaño de la pila");
            System.out.println("5: Salir");
            opc=leer.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Inserte dato");
                    a.insertar(dato=leer.nextInt());
                    System.out.println("Dato insertado");
                    System.out.println("");
                    break;
                    
                case 2:
                    a.eliminar();
                case 3:
                    System.out.println(a.vacio());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(a.tamaño());
                    break;
            }
            
        }while (opc!=5);
        
    }
    
}
