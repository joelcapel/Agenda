package com.company.AgendaTelefonica;
import java.util.*;

public class Agenda {
    static Scanner scanner = new Scanner(System.in);
    static AgendaContacto agendaContacto = new AgendaContacto();

    public static void main(String[]args){

        PantallaMenu pantallaMenu = new PantallaMenu();
        while(PantallaMenu.mostrar()) { }
    }

}
