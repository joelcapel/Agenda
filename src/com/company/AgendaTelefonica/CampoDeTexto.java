package com.company.AgendaTelefonica;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

public class CampoDeTexto {
    String pedir(String prompt) {
        System.out.print("\033[1;31m" + prompt + " " + ":\033[0m ");
        String texto = Agenda.scanner.nextLine();

        while (texto == "") {
            if (texto.equalsIgnoreCase("")) {
                System.out.println("error introduzca un " + prompt);
                System.out.print("\033[1;31m" + prompt + " " + ":\033[0m ");
                texto = Agenda.scanner.nextLine();
            }
        }
        return texto;
    }
}
//
//