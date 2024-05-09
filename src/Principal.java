import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        ConsultarMonedas consultarMonedas = new ConsultarMonedas();

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("""
                     ----------------------------------------------------------
                     Bienvenid@ al conversor de monedas.
                                  
                      Por favor seleccione una de las siguientes opciones:
                      
                     1) Convertir Dólar (USD) =>> Peso Mexicano (MXN)
                     2) Convertir Peso Mexicano (MXN) =>> Dólar (USD)
                     3) Convertir Euro (EUR) =>> Dolar (USD)
                     4) Convertir Dolar (USD) =>> Euro (EUR)
                     5) Convertir Euro (EUR) =>> Peso Mexicano (MXN)
                     6) Convertir Peso Mexicano =>> Euro (EUR)
                     7) Otras conversiones
                     8) Salir
                                  
                     ----------------------------------------------------------
                    """);
            try {
                opcion = lectura.nextInt();

                if (opcion > 8 || opcion < 1) {
                    System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 8.");
                    continue;
                }

                if (opcion != 8) {
                    System.out.println("Escriba la cantidad a convertir");
                    double cantidad = lectura.nextDouble();

                    switch (opcion) {
                        case 1:
                            consultarMonedas.divisa("USD", "MXN", cantidad);

                            break;
                        case 2:
                            consultarMonedas.divisa("MXN", "USD", cantidad);

                            break;
                        case 3:
                            consultarMonedas.divisa("EUR", "USD", cantidad);
                            break;
                        case 4:
                            consultarMonedas.divisa("USD", "EUR", cantidad);
                            break;
                        case 5:
                            consultarMonedas.divisa("EUR", "MXN", cantidad);
                            break;
                        case 6:
                            consultarMonedas.divisa("MXN", "EUR", cantidad);
                            break;
                        case 7:
                            System.out.println("Ingrese el codigo de tres letras (Formato ISO4217) " +
                                    "correspondiente a la moneda base que quiere convertir.");
                            String monedaBase = lectura.next().toUpperCase();
                            System.out.println("Ingrese el codigo de tres letras (Formato ISO4217) " +
                                    "correspondiente a la moneda a la que quiere convertir");
                            String monedaDestino = lectura.next().toUpperCase();
                            consultarMonedas.divisa(monedaBase, monedaDestino, cantidad);
                            break;
                        default:
                            System.out.println("Por favor ingrese una opcion valida.");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar una opcion valida");
                lectura.next();
            }
        }
        System.out.println("""
                Programa finalizado.
                Gracias por su visita, vuelva pronto.
                
                Su historial de consultas:
                """);
        for (String consulta : consultarMonedas.getConsultas()) {
            System.out.println(consulta);
        }
    }
}
