public class Libro {
    private String titulo;
    private String autor;
    private boolean disponibilidad;

    public Libro(String titulos, String autors, boolean disponibilidads){
        titulo = titulos;
        autor = autors;
        disponibilidad = disponibilidads;
    }
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autora){
        autor = autora;
        return;
    }
    public void setTitulo(String title){
        titulo = title;
        return;
    }
    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean dis){
        disponibilidad = dis;
        return;
    }

    // retorna true si el libro no estaba prestado y lo logra prestar
    public boolean prestar() {
        if (this.getDisponibilidad()) {
            this.setDisponibilidad(false);
            return true;
        }
        return false;
    }

    //retorna true si el libro estaba prestado y lo devuelve
    public boolean devolver() {
        if (!this.getDisponibilidad()) {
            this.setDisponibilidad(true);
            return true;
        }
        return false;
    }

}
