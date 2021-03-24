package Bloc.BlocdeNotas;

import com.company.AgendaTelefonica.Titulo;

public class PantallaCrear {
    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("CREAR NOTA");

        Nota nota = new Nota();

        System.out.println("Titulo del mensaje");
        nota.titulo = Main.scanner.nextLine();

        System.out.println("Contenido del mensaje");
        nota.contenido = Main.scanner.nextLine();

        Main.blocDeNotas.notas.add(nota);
    }
}
