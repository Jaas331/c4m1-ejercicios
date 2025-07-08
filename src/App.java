import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var input = new Scanner(System.in);
        var salir = false;

        do {
            System.out.print("""
                    .: Ejercicios del Modulo 1 :.
                    =============================
                    1. Verificar numero negativo
                    9. Venta de camisas
                    0. salir

                    Elija una opcion: """);
            var opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    verificarNumero(input);
                    break;
                case 9:
                    ventaCamisas09(input);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
            }

            System.out.println("\nPresione ENTER para continuar");
            input.nextLine();
            limpiarPantalla();

        } while (!salir);
        System.out.println("Hasta pronto!");
        input.close();
    }





    // Funcion de limpiar pantalla
    private static void limpiarPantalla() {
        System.out.println();
    }

    private static void ventaCamisas09(Scanner input) {
        /*
         * Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la
         * cantidad de unidades que le compren. La siguiente tabla muestra la
         * información:
         * 
         * Unidades Precio por unidad
         * [1 - 50] $50.000
         * (50 - 100] $45.000
         * (100 - 150] $40.000
         * (150 - 200] $35.000
         * > 200 $25.000
         * Escriba un programa que dado un número de camisas retorne el precio por
         * unidad.
         */

        limpiarPantalla();
        // Leer del teclado el numero de camisas hasta que ingrese un numero positivo
        // mayor a 0

        var camisas = 0;
        do {
            System.out.print("Por favor ingresa la cantidad de camisas: ");
            camisas = input.nextInt();
            input.nextLine();

            if (camisas > 0) {
                break;
            } 
            System.out.println("El numero de camisas debe ser mayor a 0."); 
            } while (true);


            var precio = camisas <= 50 ? 50_000 
                    : camisas <= 100 ? 45_000 
                            : camisas <= 150 ? 40_000 
                                    : camisas <= 200 ? 35_000  
                                            : 25_000; 

            System.out.printf("El precio por unidad es %,d%n", precio);
    } 


    /*
     * Escriba un programa que permita ingresar un número real e identifique si el
     * número es negativo, positivo o cero.
     */
    private static void verificarNumero(Scanner input) {
        limpiarPantalla();
        System.out.print("Por favor, ingrese el numero real a evaluar: ");
        var real = input.nextDouble();
        input.nextLine();

        if (real == 0) {
            System.out.println("El numero es cero.");
        } else if (real < 0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es positivo.");
        }

    }
}
