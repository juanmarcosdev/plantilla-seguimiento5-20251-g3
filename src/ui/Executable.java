package ui;

import java.util.Scanner;
import model.Controladora;

public class Executable {

    private Scanner reader;
    private Controladora cont;
    private static boolean flag;

    private Executable() {
        reader = new Scanner(System.in);
        cont = new Controladora();
    }

    public void run(boolean flag) {
        flag = false;
        while (!flag) {
            System.out.println("\n\nBienvenido al menu de Libreria y Papeleria ARISTI:\n");
            System.out.println("Opciones:");
            System.out.println("1. Registrar articulo");
            System.out.println("2. Procesar venta");
            System.out.println("3. Salir");

            int option = reader.nextInt();
            reader.nextLine();

            switch (option) {
                case 1:
                    registrarArticulo();
                    break;
                case 2:
                    procesarVenta();
                    break;
                case 3:
                    flag = true;
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Executable app = new Executable();
        app.run(flag);
    }

    public void registrarArticulo() {
        // TODO: implementar registro de articulo llamando a métodos de Controladora
    }

    public void procesarVenta() {
        // TODO: implementar procesamiento de venta llamando a métodos de Controladora
    }
}