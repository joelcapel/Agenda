package com.company.AgendaTelefonica;
import java.util.*;

public class Agenda {
    static Scanner scanner = new Scanner(System.in);

    public static void main (String argumentos[]){

        Persona persona1 = new Persona();

        Titulo titulo = new Titulo();
        System.out.println();
        titulo.mostrar();

        System.out.println("\033[1;36mCreando nuevo contacto...");

        CampoDeTexto campoDeTexto = new CampoDeTexto();
        persona1.nombre = campoDeTexto.pedir("Nombre");

        persona1.apellidos = campoDeTexto.pedir("Apellidos");

        persona1.telefono = campoDeTexto.pedir("Telefono");

        persona1.edad = Integer.parseInt(campoDeTexto.pedir("Edad"));

        persona1.mail = campoDeTexto.pedir("Mail");


        System.out.println();
        System.out.println();


        System.out.println("Contacto añadido correctamente con los dados siguientes: ");
        System.out.println();
        System.out.println("\033[1;33mNombre: \033[0m" + persona1.nombre);
        System.out.println("\033[1;33mApellidos: \033[0m" + persona1.apellidos);
        System.out.println("\033[1;33mTelefono: \033[0m" + persona1.telefono);
        System.out.println("\033[1;33mEdad: \033[0m" + persona1.edad);
        System.out.println("\033[1;33mMail: \033[0m" + persona1.mail);
    }
}
