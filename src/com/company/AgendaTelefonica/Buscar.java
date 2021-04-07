package com.company.AgendaTelefonica;

public class Buscar {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("BUSCAR CONTACTO");

        System.out.println();

        System.out.println("\033[1;36mIntroduce cualquier dato del contacto que quieras buscar: ");

        String textoABuscar = Agenda.scanner.nextLine();


        for(Persona persona: Agenda.agendaContacto.personas){
            if(textoABuscar.equals(persona.nombre)
            || textoABuscar.equals(persona.apellidos)
            || textoABuscar.equals(persona.mail)
            || textoABuscar.equals(persona.telefono)) {
                System.out.println("\033[1;33mNombre: \033[0m" +  persona.nombre);
                System.out.println("\033[1;33mApellidos: \033[0m" + persona.apellidos);
                System.out.println("\033[1;33mTelefono: \033[0m" + persona.telefono);
                System.out.println("\033[1;33mEdad: \033[0m" + persona.edad);
                System.out.println("\033[1;33mMail: \033[0m" + persona.mail);

            } else {
                System.out.println("no extise el contacto");
            }
        }

    }
}
