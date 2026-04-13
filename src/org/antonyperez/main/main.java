package org.antonyperez.main;
import org.antonyperez.controller.ControllerTexto;
/**
 *
 * @author Antony Perez
 */
public class main {
    public static void main(String[] args) {
        ControllerTexto menu = new ControllerTexto();
        
        System.out.println("Mi primer programa");
        menu.mostrarMenu();
    }
}
