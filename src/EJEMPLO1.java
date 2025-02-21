import java.util.Scanner;

public class EJEMPLO1 {
    public static void main(String[] args) {

        Scanner Teclado1 = new Scanner(System.in);
        String Nombre = "";
        int Edad = 0;

        System.out.println("Ingrese por favor su nombre:");
        Nombre = Teclado1.nextLine();
        System.out.println("Ingrese por favor su edad:");
        Edad = Teclado1.nextInt();

        if( Edad >= 1 && Edad <= 12){
            String Plan = "Plan infantil";
            System.out.println("Señor@ " + Nombre + " Usted ha sido asignado al " + Plan);

        }else if(Edad > 12 && Edad <= 17) {
            String Plan = "Plan Juvenil";
            System.out.println("Señor@ " + Nombre + " Usted ha sido asignado al " + Plan);

        }else if(Edad >= 18 && Edad <= 35) {
            String Plan = "Plan adulto joven";
            System.out.println("Señor@ " + Nombre + " Usted ha sido asignado al " + Plan);
        
        }else if(Edad > 35 && Edad <= 55) {
            String Plan = "Plan adulto" ;
            System.out.println("Señor@ " + Nombre + " Usted ha sido asignado al " + Plan);

        }else if(Edad > 55 && Edad <= 70) {
            String Plan = "Plan adulto 2";
            System.out.println("Señor@ " + Nombre + " Usted ha sido asignado al " + Plan);

        }else if(Edad > 70 && Edad <= 99) {
            String Plan = "Plan adulto 3";
            System.out.println("Señor@ " + Nombre + " Usted ha sido asignado al " + Plan);

        }else {
            System.out.println("POR FAVOR INGRESE UNA EDAD VALIDA");
        }


        





    }




}


