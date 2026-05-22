package org.antonyperez.controller;
import java.util.Scanner;
public class ControllerTexto {
Scanner sc = new Scanner(System.in);
    public void mostrarMenu() {
            int opcion;
            
            do {
                System.out.println("---- MENU DE EJERCICIOS ----");
                System.out.println("1. Concatenador de Nombre");
                System.out.println("2. Contador de Longitud");
                System.out.println("3. Inversor de Texto");
                System.out.println("4. Detector de Vocales");
                System.out.println("5. Extractor de Iniciales");
                System.out.println("6. Devolvedor a Mayusculas");
                System.out.println("7. Conversor Binario (par o impar)");
                System.out.println("8. Repetidor de Palabras");
                System.out.println("9. Validador de Password");
                System.out.println("10. Generador de Email");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opcion: ");
                
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch(opcion) {
                    case 1 -> {
                        System.out.println("Vamos a concatenar");
                        System.out.print("Ingrese su nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese su apellido: ");
                        String apellido = sc.nextLine();
                        System.out.println("Nombre completo: " + nombre + " " + apellido);
                        break;
                    }
                    case 2 -> {
                         String texto;
                        System.out.println("Vamos a ver la longitud de tu palabra");
                    System.out.print("Ingrese un palabra: ");
                    texto = sc.nextLine();

                    System.out.println("La longitud es: " + texto.length());

                    break;

                    
                    }
                    
                    case 0 -> System.out.println("Saliendo del programa...");
                    
                    default -> System.out.println("Opción inválida");
                }
                
            } while (opcion != 0); {
        }
    }

}


        