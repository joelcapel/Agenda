package com.company.AgendaTelefonica;

public class Editar {
    void mostrar() {
        Titulo titulo = new Titulo();

        System.out.println();

        titulo.mostrar("EDITAR CONTACTO");

        CampoDeTexto campoDeTexto = new CampoDeTexto();
        Mensaje mensaje = new Mensaje();
        System.out.println();
        System.out.println("Que contacto desea editar?");

        Buscar buscar = new Buscar();
        buscar.mostrar();

        Persona persona = new Persona();

        System.out.println("\033[1;33mNombre: " + persona.nombre);
        String nuevoNombre = campoDeTexto.pedir("\033[1;36mEditando nombre: ");
        if (!nuevoNombre.isEmpty()) {
            persona.nombre = nuevoNombre;
        }

        System.out.println("\033[1;33mApellidos: " + persona.apellidos);
        String nuevosApellidos = campoDeTexto.pedir("\033[1;36mEditando apellidos: ");
        if (!nuevosApellidos.isEmpty()) {
            persona.apellidos = nuevosApellidos;
        }

        System.out.println("\033[1;33mTelefono: " + persona.telefono);
        String nuevoTelefono = campoDeTexto.pedir("\033[1;36mEditando telefono: ");
        if (!nuevoTelefono.isEmpty()) {
            persona.telefono = nuevoTelefono;
        }

        System.out.println("\033[1;33mEdad: " + persona.edad);
        String nuevaEdad = campoDeTexto.pedir("\033[1;36mEditando edad: ");
        if (!nuevaEdad.isEmpty()) {
            persona.edad = Integer.parseInt(nuevaEdad);
        }

        System.out.println("\033[1;33mMail: " + persona.mail);
        String nuevoMail = campoDeTexto.pedir("\033[1;36mEditando mail: ");
        if (!nuevoMail.isEmpty()) {
            persona.mail = nuevoMail;
        }

        mensaje.mostrarInfo("\033[1;31mCONTACTO GUARDADO!");
    }
}
