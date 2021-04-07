package com.company.AgendaTelefonica;

public class PantallaMenu {
    static boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("Agenda de contactos");    // // titulo = "BLOC DE NOTAS"

        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"\033[1;34mCrear Contacto", "Listar Contacto", "Editar Contacto","Buscar Contacto", "Eliminar Contacto", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            Crear crear = new Crear();
            crear.mostrar();
        } else if("2".equals(opcion)) {
            Listar listar = new Listar();
            listar.mostrar();
        } else if ("3".equals(opcion)) {
            Editar editar = new Editar();
            editar.mostrar();
        } else if("4".equals(opcion)){
            Buscar buscar = new Buscar();
            buscar.mostrar();
        } else if ("5".equals(opcion)){
            Eliminar eliminar = new Eliminar();
            eliminar.mostrar();
        } else if ("6".equals(opcion)){
            return false;
        }
        return true;
    }
}

