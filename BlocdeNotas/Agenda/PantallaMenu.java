package Bloc.BlocdeNotas.Agenda;

import java.util.InputMismatchException;


public class PantallaMenu {
    boolean mostrar(){
        int opcion;

        while (!salir) {
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Existe contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();

                switch (opcion){
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre el 1 y 7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
}
