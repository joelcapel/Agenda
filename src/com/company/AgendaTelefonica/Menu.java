package com.company.AgendaTelefonica;

import static com.company.AgendaTelefonica.Agenda.scanner;

public class Menu {

    String elegirOpcion(String[] opciones){

        boolean seguirPidiendo = true;
        String opcion = "";
        while (seguirPidiendo){
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            System.out.print("\n\033[1;31mOpcion: ");

            opcion = Agenda.scanner.nextLine();

            if (Integer.parseInt(opcion) > opciones.length) {
                Mensaje mensaje = new Mensaje();
                mensaje.mostrarError("Esa opción no existe");
                mensaje.mostrarError("Porfavor, escoja una opción válida");
            }else {
                seguirPidiendo = false;
            }
        }

        return opcion;
    }
}