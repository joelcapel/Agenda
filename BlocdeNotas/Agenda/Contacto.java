package Bloc.BlocdeNotas.Agenda;

class Contacto {
    String nombre;
    int telefono;

    Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    String getNombre(){
        return nombre;
    }
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    int getTelefono(){
        return telefono;
    }
    void setTelefono(int telefono){
        this.telefono = telefono;
    }

    boolean equals(Contacto c){
        if (this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }
        return false;
    }
    public String toString(){
        return "nombre= " + nombre + ", telefono= " + telefono;
    }
}
