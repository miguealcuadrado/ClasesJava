import java.util.Scanner;

public class CICLO_FOR {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de promedio.");
        System.out.println("Por favor ingrese que materia da:");
        String Materia = Teclado.nextLine();

        System.out.println("Listo profe de " + Materia);
        System.out.println("Cuantos estudiantes ingresara:");
        int Cantidad_Estudiantes = Teclado.nextInt();
        Teclado.nextLine();
        

        for(int i = 1; i <= Cantidad_Estudiantes; i++ ) {
            System.out.println("Ingrese el nombre del estudiante:");
            String Nombre_Estudiante = Teclado.nextLine();
            System.out.println("Ingrese la cantidad de notas:");
            int Cantidad_Notas = Teclado.nextInt(); 
            Teclado.nextLine();
            int Nota = 0;
            int Valor = 0;
            


            for (int a = 1; a <= Cantidad_Notas; a++) {
                System.out.println("Ingrese la nota:");
                float Notas = Teclado.nextFloat();
                
                if(Notas < 0 || Notas > 5.0 ) {
                    Valor += 2;
                    Teclado.nextLine();
                    break;


                }else if(Notas >= 0 && Notas <= 5.0) {
                    Nota += Notas;
                    Teclado.nextLine();
                    Valor = 0;
            
                }
                
                
                
                
            
            
            }
            
            switch(Valor) {

                case 0 -> {
                    float promedio = Nota / Cantidad_Notas;
                    System.out.println("El estudiante " + Nombre_Estudiante + " obtuvo " + promedio + " en " + Materia);
                }
                
                case 2 -> {
                    System.out.println("ERROR");
                    Teclado.nextLine();
                }
            }
        }

        Teclado.close();
    }
}



