package com.company.AgendaTelefonica;

public class Crear {

    void mostrar() {
        Titulo titulo = new Titulo();

        System.out.println();

        titulo.mostrar("CREAR CONTACTO");

        Persona persona1 = new Persona();
        System.out.println();
        System.out.println("\033[1;36mCreando nuevo contacto...");

        CampoDeTexto campoDeTexto = new CampoDeTexto();


        persona1.nombre = campoDeTexto.pedir("Nombre");

        persona1.apellidos = campoDeTexto.pedir("Apellidos");

        persona1.telefono = campoDeTexto.pedir("Telefono");

        persona1.edad = Integer.parseInt(campoDeTexto.pedir("Edad"));

        persona1.mail = campoDeTexto.pedir("Mail");


        System.out.println();
        System.out.println();


        System.out.println("\033[1;36mContacto añadido correctamente con los dados siguientes: ");
        System.out.println();

        Agenda.agendaContacto.personas.add(persona1);
    }
}
