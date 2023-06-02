import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        boolean menú = true;
        String titulo;

        Libro libroh = new Libro("1","2",true);
        biblioteca.añadirLibro(libroh);

        while (menú) {
            System.out.println(
                    "___  _ ___  _    _ ____ ___ ____ ____ ____ \n" +
                    "|__] | |__] |    | |  |  |  |___ |    |__| \n" +
                    "|__] | |__] |___ | |__|  |  |___ |___ |  | \n" +
                    "                                           \n");
            System.out.println(" ");
            System.out.println("1- Añadir Libro");
            System.out.println("2- Pedir Libro");
            System.out.println("3- Devolver Libro");
            System.out.println("4- Listar Libros");
            System.out.println("5- Salir");
            String opción = scanner.nextLine();

            switch (opción){
                case "1":
                    System.out.println("Ingrese el título: ");
                    titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor: ");
                    String autor = scanner.nextLine();
                    Libro libro = new Libro(titulo,autor,true);
                    biblioteca.añadirLibro(libro);
                    break;
                case "2":
                    System.out.println("Ingrese el título: ");
                    titulo = scanner.nextLine();
                    if(biblioteca.prestarLibro(titulo)){
                        System.out.println("Libro prestado con éxito.");
                    }else {
                        System.out.println("El libro deseado no estaba disponible.");
                    }
                    break;
                case "3" :
                    System.out.println("Ingrese el título del libro a devolver: ");
                    titulo = scanner.nextLine();
                    if(biblioteca.devolverLibro(titulo)){
                        System.out.println("Libro devuelto con éxito.");
                    }else{
                        System.out.println("El libro que intentas devolver ya estaba devuelto.");
                    }
                    break;
                case "4":
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case "5":
                    menú = false;
                    break;
            }
        }
        System.exit(0);
    }
}
