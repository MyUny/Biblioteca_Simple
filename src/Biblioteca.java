import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> biblioteca = new ArrayList<Libro>();
    private int largo = 0;

    /* public Libro getLibro(int n){
        return biblioteca.get(n);
    } */
    public void añadirLibro(Libro libro) {
        biblioteca.add(libro);
        largo++;
    }

    public Libro test(){
        return biblioteca.get(0);
    }
    public boolean prestarLibro(String titulo) {

        for (int i = 0; i < largo; i++) {
            if ((biblioteca.get(i)).getTitulo().equals(titulo)) {
                return biblioteca.get(i).prestar();
            }
        }
        return false;
    }

    public boolean devolverLibro(String titulo) {
        for (int i = 0; i < largo; i++) {
            if ((biblioteca.get(i)).getTitulo().equals(titulo)) {
                return biblioteca.get(i).devolver();
            }
        }
        return false;
    }

    public void mostrarLibrosDisponibles() {
        for (int i = 0; i < largo; i++) {
            if(biblioteca.get(i).getDisponibilidad()){
                System.out.println(biblioteca.get(i).getTitulo() + " by " + biblioteca.get(i).getAutor());
            }
        }
    }

}
