public class ANIDADAS {
    public static void main(String[] args) {

        int operacion = 3;
        int Num_1 = 15;
        int Num_2 = 13;
        int Resultado = 0;

        if (operacion >= 5) {
            System.out.println("Recuerde por favor ingresar un valor entre 1 y 4");

        }else if(operacion == 1) {
            Resultado = Num_1 + Num_2;
            System.out.println("El Resultado es " + Resultado);
        
        }else if(operacion == 2) {
            Resultado = Num_1 - Num_2;
            System.out.println("El Resultado es " + Resultado);
            
        }else if(operacion == 3) {
            Resultado = Num_1 * Num_2;
            System.out.println("El Resultado es " + Resultado);

        }else if(operacion == 4) {
            Resultado = Num_1 / Num_2;
            System.out.println("El Resultado es " + Resultado);
                
        }else {
            System.out.println("Recuerde ingresar un valor valido");
        }



    
    }

}
