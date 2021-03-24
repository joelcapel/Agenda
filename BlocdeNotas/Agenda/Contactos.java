package Bloc.BlocdeNotas.Agenda;

public class Contactos {
    int id;
    String nombres;
    String apellidos;
    String direccion;

    Contactos(int id, String nombres, String apellidos, String direccion){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getNombres() {
        return nombres;
    }

    void setNombres(String nombres) {
        this.nombres = nombres;
    }

    String getApellidos() {
        return apellidos;
    }

    void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    String getDireccion() {
        return direccion;
    }

    void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
