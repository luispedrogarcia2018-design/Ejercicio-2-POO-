import java.util.Scanner;

enum Genero {
    ACCION, COMEDIA, TERROR, DRAMA, ROMANCE
}

public class Cine {

private static String nombreCine = "MovieSesh Starr";
private static int opcion;
private static String nombrePelicula;
private static String genero;




public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);    
    

    System.out.println("|||||||||||||||||||||||||||||||||");
    System.out.println("Bienvenido al cine " + nombreCine);
    System.out.println("|||||||||||||||||||||||||||||||||");

    System.out.println("Ingrese su nombre de usuario: ");
    String nombreUsuario = scanner.nextLine();

    System.out.println("Ingrese su edad:");
    int edad = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Ingrese el genero de la pelicula que desea calificar : ");
    String genero = scanner.nextLine().toUpperCase();
   
    
    System.out.println("Género seleccionado: " + genero);
    
 
  
}
}

