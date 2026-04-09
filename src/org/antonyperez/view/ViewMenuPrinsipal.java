package org.antonyperez.view;
import java.util.Scanner;
/**
 *
 * @author Antony Perez
 */
public class ViewMenuPrinsipal {
    Scanner sc = new Scanner(System.in);
    int opcionMenu = 0;
    
    public void mostraMenu(){
        while (opcionMenu == 0){
        System.out.println("Bienvenido al menu, Seleccione una opcion");
        System.out.println("1. Operaciones Matematicas");
        System.out.println("2. Operaciones de texto");
        System.out.println("3. Operaciones de Logica");
        System.out.println("4. Salir de del sistema");
       
        opcionMenu = Integer.parseInt(sc.nextLine());
        }
    }
    
    public void mostraMenuMatematica(){
        System.out.println("Menu de operaciones Matematicas");

}
}
