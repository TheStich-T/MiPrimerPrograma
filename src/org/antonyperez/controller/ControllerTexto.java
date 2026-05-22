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
                    
                    case 3 -> {

                    String palabra;
                    String invertido = "";
                        System.out.println("Vamos a invertir tu texto aqui: ");
                    System.out.print("Ingrese un texto: ");
                    palabra = sc.nextLine();

                    for (int i = palabra.length() - 1; i >= 0; i--) {

                        invertido = invertido + palabra.charAt(i);
                    }

                    System.out.println("Texto invertido: " + invertido);

                    break;
                    }
                    case 4 -> {

                    String frase;
                    int vocales = 0;

                    System.out.print("Ingrese un texto: ");
                    frase = sc.nextLine();

                    frase = frase.toLowerCase();

                    for (int i = 0; i < frase.length(); i++) {

                        char letra = frase.charAt(i);

                        if (letra == 'a' || letra == 'e' || letra == 'i'
                                || letra == 'o' || letra == 'u') {

                            vocales++;
                        }
                    }

                    System.out.println("Cantidad de vocales: " + vocales);

                    break;
                    }
                    case 5 -> {

                    String nombreCompleto;

                    System.out.print("Ingrese su nombre completo: ");
                    nombreCompleto = sc.nextLine();

                    String[] partes = nombreCompleto.split(" ");

                    System.out.print("Iniciales: ");

                    for (String parte : partes) {
                        System.out.print(parte.charAt(0) + " ");
                    }

                    System.out.println();

                    break;
                    }
                    case 6 -> {

                    String mayusculas;

                    System.out.print("Ingrese un texto: ");
                    mayusculas = sc.nextLine();

                    System.out.println("En mayusculas: " + mayusculas.toUpperCase());

                    break;
                    }
                    
                    case 7 -> {

                    int numero;

                    System.out.print("Ingrese un numero: ");
                    numero = sc.nextInt();

                    System.out.println("Binario: " + Integer.toBinaryString(numero));

                    if (numero % 2 == 0) {

                        System.out.println("Es PAR");

                    } else {

                        System.out.println("Es IMPAR");
                    }

                    break;
                    }
                    
                     case 8 -> {

                    String repetir;
                    int veces;

                    System.out.print("Ingrese una palabra: ");
                    repetir = sc.nextLine();

                    System.out.print("Cuantas veces repetir: ");
                    veces = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= veces; i++) {

                        System.out.println(repetir);
                    }

                    break;
                     }
                    case 9 -> {

                    String password;

                    System.out.print("Ingrese una contraseña: ");
                    password = sc.nextLine();

                    if (password.length() >= 8) {

                        System.out.println("Password valida");

                    } else {

                        System.out.println("Password muy corta");
                    }

                    break;
                    }
                }

                    
                    
                    case 0 -> System.out.println("Saliendo del programa...");
                    
                    default -> System.out.println("Opción inválida");
                }
                
            } while (opcion != 0); {
        }
    }

}


        