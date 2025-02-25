import java.util.Scanner;

public class CONTROLADORES {
    public static void main(String[] args) {
        //CONTROLADORES
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese un valor numerico:");
        int Num_1 = Teclado.nextInt();
        System.out.println("Ingrese otro valor numerico:");
        int Num_2 = Teclado.nextInt();
        System.out.println("Ingrese el valor para la operacion:");
        int Parametro = Teclado.nextInt();

        switch(Parametro) {

            case 1 -> {
                int Resultado = Num_1 + Num_2;
                System.out.println("El resultado fue " + Resultado);
                break;
            }

            case 2 -> {
                int Resultado = Num_1 - Num_2;
                System.out.println("El resultado fue " + Resultado);
                break;
            }

            case 3 -> {
                int Resultado = Num_1 * Num_2;
                System.out.println("El resultado fue " + Resultado);
                break;
            }

            case 4 -> {
                float Resultado = Num_1 / Num_2;
                System.out.println("El resultado fue " + Resultado);
                break;
            }

            default -> {
             System.out.println("Ingreso un parametro invalido.");  
            }








        }






    }
}

