import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double var1, var2, resultado;

        System.out.println("*** APP CALCULADORA ***");
        System.out.println("\n 1. SUMA \n 2. RESTA \n 3. MULTIPLICACIÓN \n 4. DIVISIÓN \n 5. SALIR \n");

        System.out.print("Escoge una opción: ");
        int option = sc.nextInt();

        if(option >=1 && option <= 4 ){
            System.out.println("Ingresa el primer valor: ");
            var1 = sc.nextDouble();

            System.out.println("Ingresa el segundo valor: ");
            var2 = sc.nextDouble();

            switch (option){
                case 1:
                    resultado = suma(var1, var2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = resta(var1, var2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = multiplicacion(var1, var2);
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;
                case 4:
                    resultado = division(var1, var2);
                    System.out.println("El resultado de la division es: " + resultado);
                    break;
                default:
                    System.out.println("Opción erronea: " + option);
            }
        } else if (option == 5) {
            System.out.println("Hasta pronto");
        }else {
            System.out.println("Opción erronea: " + option);
        }


    }

    public static double suma(double var1, double var2){
        return var1 + var2;
    }
    public static double resta(double var1, double var2){
        return var1 - var2;
    }
    public static double multiplicacion(double var1, double var2){
        return var1 * var2;
    }
    public static double division(double var1, double var2){
        return var1 / var2;
    }
}
