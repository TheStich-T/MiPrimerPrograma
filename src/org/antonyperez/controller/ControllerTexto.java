package org.antonyperez.controller;
import java.util.Scanner;
/**
 *
 * @author Antony Perez - 2023350
 */
public class ControllerTexto {
Scanner sc = new Scanner(System.in);
    public void mostrarMenu() {
            int opcion;
            
            do {
                System.out.println("===== MENÚ DE EJERCICIOS =====");
                System.out.println("11. Concatenador de Nombre");
                System.out.println("12. Contador de Longitud");
                System.out.println("13. Inversor de Texto");
                System.out.println("14. Detector de Vocales");
                System.out.println("15. Extractor de Iniciales");
                System.out.println("16. Normalizador a Mayúsculas");
                System.out.println("17. Conversor Binario (par o impar)");
                System.out.println("18. Repetidor de Palabras");
                System.out.println("19. Validador de Password");
                System.out.println("20. Generador de Email");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch(opcion) {
                    case 11 -> {
                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese apellido: ");
                        String apellido = sc.nextLine();
                        System.out.println("Nombre completo: " + nombre + " " + apellido);
                    }
                    
                    case 12 -> {
                        System.out.print("Ingrese una palabra: ");
                        String palabra = sc.nextLine();
                        System.out.println("Longitud: " + palabra.length());
                    }
                    
                    case 13 -> {
                        System.out.print("Ingrese una palabra: ");
                        String texto = sc.nextLine();
                        String invertido = "";
                        for (int i = texto.length() - 1; i >= 0; i--) {
                            invertido += texto.charAt(i);
                        }
                        System.out.println("Texto invertido: " + invertido);
                    }
                    
                    case 14 -> {
                        System.out.print("Ingrese un carácter: ");
                        char letra = sc.next().charAt(0);
                        boolean esVocal = "aeiouAEIOU".indexOf(letra) != -1;
                        System.out.println("¿Es vocal?: " + esVocal);
                    }
                    
                    case 15 -> {
                        System.out.print("Ingrese nombre: ");
                        String nom = sc.nextLine();
                        System.out.print("Ingrese apellido: ");
                        String ape = sc.nextLine();
                        String iniciales = "" + nom.charAt(0) + ape.charAt(0);
                        System.out.println("Iniciales: " + iniciales.toUpperCase());
                    }
                    
                    case 16 -> {
                        System.out.print("Ingrese texto: ");
                        String txt = sc.nextLine();
                        System.out.println("En mayúsculas: " + txt.toUpperCase());
                    }
                    
                    case 17 -> {
                        System.out.print("Ingrese texto binario: ");
                        String binario = sc.nextLine();
                        if (binario.length() % 2 == 0) {
                            System.out.println("Longitud PAR");
                        } else {
                            System.out.println("Longitud IMPAR");
                        }
                    }
                    
                    case 18 -> {
                        System.out.print("Ingrese palabra: ");
                        String rep = sc.nextLine();
                        System.out.print("Ingrese cantidad: ");
                        int n = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            System.out.print(rep + " ");
                        }
                        System.out.println();
                    }
                    
                    case 19 -> {
                        System.out.print("Ingrese contraseña: ");
                        String pass = sc.nextLine();
                        if (pass.length() > 8) {
                            System.out.println("Segura");
                        } else {
                            System.out.println("Insegura");
                        }
                    }
                    
                    case 20 -> {
                        System.out.print("Ingrese nombre: ");
                        String n1 = sc.nextLine().toLowerCase();
                        System.out.print("Ingrese apellido: ");
                        String a1 = sc.nextLine().toLowerCase();
                        System.out.print("Ingrese dominio (ej: gmail.com): ");
                        String dominio = sc.nextLine();
                        String email = n1 + "." + a1 + "@" + dominio;
                        System.out.println("Email generado: " + email);
                    }
                    
                    case 0 -> System.out.println("Saliendo del programa...");
                    
                    default -> System.out.println("Opción inválida");
                }
                
            } while (opcion != 0); {
        }
    }
}
