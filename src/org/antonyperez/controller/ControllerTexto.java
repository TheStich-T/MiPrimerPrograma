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
                    }
                    
                    case 2 -> {
                        System.out.println("Vamos a contar las palabras");
                        System.out.print("Ingresa una palabra: ");
                        String palabra = sc.nextLine();
                        System.out.println("Longitud: " + palabra.length());
                    }
                    
                    case 3 -> {
                        System.out.println("Vamos a invertir las palabras");
                        System.out.print("Ingresa una palabra: ");
                        String texto = sc.nextLine();
                        String invertido = "";
                        for (int i = texto.length() - 1; i >= 0; i--) {
                            invertido += texto.charAt(i);
                        }
                        System.out.println("El texto invertido: " + invertido);
                    }
                    
                    case 4 -> {
                        System.out.println("Vamos a ver si es una vocal");
                        System.out.print("Ingrese un carácter: ");
                        char letra = sc.next().charAt(0);
                        boolean esVocal = "aeiouAEIOU".indexOf(letra) != -1;
                        System.out.println("¿Es vocal?: " + esVocal);
                    }
                    
                    case 5 -> {
                        System.out.println("Vamos a extrar las inciales ");
                        System.out.print("Ingresa tu nombre: ");
                        String nom = sc.nextLine();
                        System.out.print("Ingresa tu apellido: ");
                        String ape = sc.nextLine();
                        String iniciales = "" + nom.charAt(0) + ape.charAt(0);
                        System.out.println("Iniciales: " + iniciales.toUpperCase());
                    }
                    
                    case 6 -> {
                        System.out.println("Te lo devolvemos en Mayusculos lo que ingreses");
                        System.out.print("Ingrese texto: ");
                        String txt = sc.nextLine();
                        System.out.println("En mayúsculas: " + txt.toUpperCase());
                    }
                    
                    case 7 -> {
                        System.out.print("Ingresa un texto binario: ");
                        String binario = sc.nextLine();
                        if (binario.length() % 2 == 0) {
                            System.out.println("Longitud PAR");
                        } else {
                            System.out.println("Longitud IMPAR");
                        }
                    }
                    
                    case 8 -> {
                        System.out.print("Ingresa una palabra: ");
                        String rep = sc.nextLine();
                        System.out.print("Ingresa una cantidad: ");
                        int n = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            System.out.print(rep + " ");
                        }
                        System.out.println();
                    }
                    
                    case 9 -> {
                        System.out.println("Veamos si es una buena contraseña");
                        System.out.print("Ingresa una contraseña: ");
                        String pass = sc.nextLine();
                        if (pass.length() > 8) {
                            System.out.println("Segura");
                        } else {
                            System.out.println("Insegura");
                        }
                    }
                    
                    case 10 -> {
                        System.out.println("Creamos un correo para ti");
                        System.out.print("Ingrese su nombre: ");
                        String n1 = sc.nextLine().toLowerCase();
                        System.out.print("Ingrese su apellido: ");
                        String a1 = sc.nextLine().toLowerCase();
                        System.out.print("Ingrese un dominio (ej: gmail.com): ");
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
