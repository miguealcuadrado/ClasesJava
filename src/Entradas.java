import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        String Nombre = "" , Apellido1 = "";

        System.out.println("¿Cual es tu nombre?");
        Nombre = Teclado.nextLine();

        System.out.println("Cual es tu apellido?");
        Apellido1 = Teclado.nextLine();

        System.out.println("Bienvendio " + Nombre + Apellido1 + " Al sistema");





    }

}
