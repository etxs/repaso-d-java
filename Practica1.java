package practica.pkg1;

import java.util.Scanner;
/**
 *
 * @author Hanny
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo, soy Hannay"); /**imprimir la pantalla junto con un salto de linea*/
        //   <--- PARA COMENTARIOS
        
        //TODOS ESTOS SON DATOS PRIMITIVOS
        int entero = 12; //int es el gipo de variable y entero es el nombre de esta
        System.out.println("Imptimir entero: "+entero); //imprime y + "entero" es para mostrar la variable
        float decimal = 3.45f; //para convertirlo a float necesitamos agregar una "f" al final del numero asignado a la variable
        System.out.println("Imprimir decimal: "+decimal);
        double decimal_1 = 3.35;
        System.out.println("Imprimir decimal 1 :"+decimal_1);
        char caracter = 'a'; //para caracteres se necesitan comillas simples
        System.out.println("Caracter: "+caracter);
        boolean decision = true;
        System.out.println("La desicion es: "+decision);
        
        //TODOS ESTOS SON DATOS NO PRIMITIVOS
        Integer numero = null;
        System.out.println("El numero es: "+numero);
        String palabra = "Hola, soy Hannay"; //declarar una cadena
        System.out.println(palabra); //asi podemos imprimir las cadenas
        
        //CONSTANTES
        final int numero_1; //se agrega la palabra clave "FINAL"
        numero_1 = 10;
        System.out.println(numero_1);
        
        //Entrada y salida de datos por consola
        Scanner entrada = new Scanner(System.in);
        int num; //se declara
        System.out.print("Ingrese un numero: ");//Pide el dato al usuario
        num = entrada.nextInt(); //para almacenar datos se necesita "NextInt"
        System.out.println("El numero es: "+num);
        
        
        Scanner ou = new Scanner (System.in);
        double nume;
        System.out.print("Ingrese un numero double: ");
        nume = ou.nextDouble();
        System.out.println("El numero es: "+nume);
        
        Scanner entradita1 = new Scanner (System.in);
        String ca; //se declara
        System.out.print("Digite una cadena: ");
        ca = entradita1.nextLine(); // se guarda la cadena con espacios
        System.out.println("La cadena es: "+entradita1);
        
        Scanner uu = new Scanner (System.in);
        char let;
        System.out.println("Digite una letra: ");
        let = uu.next().charAt(0); 
        System.out.println("La cadena es: "+let);
        
    }    
}