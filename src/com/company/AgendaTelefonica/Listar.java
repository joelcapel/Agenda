package com.company.AgendaTelefonica;
import static com.company.AgendaTelefonica.Agenda.scanner;

public class Listar {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar ("LISTAR CONTACTO:");

        for(Persona persona: Agenda.agendaContacto.personas) {
            System.out.println();
            System.out.println("\033[1;33mNombre: \033[0m" + persona.nombre);
            System.out.println("\033[1;33mApellidos: \033[0m" + persona.apellidos);
            System.out.println("\033[1;33mTelefono: \033[0m" + persona.telefono);
            System.out.println("\033[1;33mEdad: \033[0m" + persona.edad);
            System.out.println("\033[1;33mMail: \033[0m" + persona.mail);
            System.out.println();

            System.out.println("\033[1;34mDesea hacer alguna otra operacion?(Si/No)");
            String respuesta = scanner.next();
            if (respuesta.equals("No")) {

            } else if (respuesta.equals("Si")) {
                System.out.println();
            }
        }
    }
}
