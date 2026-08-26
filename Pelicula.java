import java.util.Scanner;
enum Genero {
    ACCION, COMEDIA, TERROR, DRAMA, ROMANCE
}

public class Pelicula {
   private String nombre;
   private int calificacion;
   private Genero genero;




Pelicula () {
    this.nombre = setNombre();
    this.genero = setGenero();
    this.calificacion = setCalificacion();
    
}

Scanner scanner = new Scanner(System.in);

public String setNombre(){
        System.out.println("Ingrese la película: ");
        String nombre = scanner.nextLine().toUpperCase();
    return nombre;

}
public String getNombre(){
    return nombre;
}
public Genero setGenero(){
    System.out.println("Ingrese el genero de la pelicula que desea calificar : ");
    Genero genero = Genero.valueOf(scanner.nextLine().toUpperCase());
    return genero;
}
public Genero getGenero(){
    return genero;
}
public int setCalificacion(){
    System.out.println("Ingrese la calificacion nueva (del 1 al 10): ");
    this.calificacion = scanner.nextInt();
    scanner.nextLine();
    return calificacion;
    
}
public int getCalificacion(){
    return calificacion;
}

}
