# Biblioteca_Simple

Por motivos de práctica y retoma de contacto con Java he decidido hacer algunas prácticas.

# Desafío de Programación: Sistema de Gestión de Biblioteca

Estás creando un sistema simple de gestión de biblioteca. Necesitas implementar las siguientes funcionalidades:

1. `Libro`: Crea una clase `Libro` con los siguientes atributos: `titulo`, `autor` y `disponibilidad` (un booleano que indica si el libro está disponible para prestar). La clase `Libro` debe tener un método `prestar()` que cambia el estado de disponibilidad a no disponible (falso), y un método `devolver()` que cambia el estado de disponibilidad a disponible (verdadero).

2. `Biblioteca`: Crea una clase `Biblioteca` que contenga una lista de libros. Esta clase debe tener los siguientes métodos:

   - `añadirLibro(Libro libro)`: Este método añade un libro a la lista de libros de la biblioteca.

   - `prestarLibro(String titulo)`: Este método busca un libro por su título y, si está disponible, lo presta (es decir, cambia su estado de disponibilidad).

   - `devolverLibro(String titulo)`: Este método busca un libro por su título y lo devuelve (es decir, cambia su estado de disponibilidad a disponible).

   - `mostrarLibrosDisponibles()`: Este método muestra todos los libros que están disponibles en la biblioteca.

Por favor, asegúrate de que tu código maneje correctamente los casos en los que se intenta prestar o devolver un libro que no existe en la biblioteca. 

Recuerda probar tu código con varios libros y varias acciones para asegurarte de que funciona correctamente.


