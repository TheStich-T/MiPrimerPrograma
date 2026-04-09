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
        opcionMenu = Integer.parseInt(sc.nextLine());
        }
    }
    
    public void mostraMenuMatematica(){
        System.out.println("Menu de operaciones Matematicas");

}
}
