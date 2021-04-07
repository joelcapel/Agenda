package com.company.AgendaTelefonica;

public class Eliminar {
    void mostrar() {
        Titulo titulo = new Titulo();

        System.out.println();

        titulo.mostrar("ELIMINAR CONTACTO");

        CampoDeTexto campoDeTexto = new CampoDeTexto();
        Mensaje mensaje = new Mensaje();
        System.out.println();
        System.out.println("Que contacto desea eliminar?");

        Buscar buscar = new Buscar();
        buscar.mostrar();

        Persona persona = new Persona();

        persona.nombre = "";
        persona.apellidos = "";
        persona.telefono = "";
        persona.edad = Integer.parseInt("");
        persona.mail = "";
    }
}
