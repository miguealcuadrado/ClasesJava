import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {

        Scanner Teclado2 = new Scanner(System.in);
        System.out.println("Ingrese su nombre por favor:");
        String Nombre = Teclado2.nextLine();
        int Sueldo = Teclado2.nextInt();


        if(Sueldo < 100000) {
            System.out.println(Nombre + " No te alcanza para nada");

        }else if(Sueldo > 100000 && Sueldo < 250000) {
            System.out.println(Nombre + " Algo es algo, campeon");

        }else if(Sueldo >= 250000 && Sueldo < 400000) {
            System.out.println("WOAAH");

        }
    


        











    }
}
