package poo.unam.mx;
import java.util.Scanner;
public class Tarea2Poo {

    public static void main(String[] args) {
        //se piden los datos
        Scanner texto = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String datos = texto.nextLine();
        System.out.println("El texto introducido fue: " + datos);
        char uno = datos.charAt(0);

        //se hace la conversion a codigo ascii y se imprime 
        int decimal = (int) uno;

        System.out.println("El valor decimal de " + uno + " es: " + decimal);
        for (int i = 0; i < datos.length(); i++) {
            System.out.println((int) datos.charAt(i));
        }
        // se hace la condicion para determinar si son consecutivos o no utilizando un boolean
        boolean numero = true;
        if (uno >= 97 && uno <= 122) {
            for (int i = 1; i < datos.length(); i++) {

                if (datos.charAt(i) != datos.charAt(i - 1) + 1) {
                    numero = false;
                }
            }
            System.out.println();
            System.out.println(numero);

        } else {
            System.out.println("error, texto fuera de condiciones ");
        }
    }
}
