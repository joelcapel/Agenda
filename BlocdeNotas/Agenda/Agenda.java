package Bloc.BlocdeNotas.Agenda;

public class Agenda {
    Contacto[] contactos;

    Agenda(){
        this.contactos = new Contacto[10];
    }
    Agenda(int tamaño){
        this.contactos = new Contacto[tamaño];
    }

}
