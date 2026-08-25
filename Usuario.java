import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {

private String nombre;
private String nombreUsuario;
private int edad;
private ArrayList<Pelicula> peliculas = new ArrayList<>();
Scanner scanner = new Scanner(System.in); 

Usuario () {
    this.nombre = setNombre();
    this.nombreUsuario = setNombreUsuario();
    this.edad = setEdad();
}

 // setNombre es para asignar un valor a la varible nombre
public String setNombre() {
    
    System.out.println("Ingrese su nombre: ");
    this.nombre = scanner.nextLine();
    return nombre;
}

public String setNombreUsuario() {
    System.out.println("Ingrese su nombre de usuario: ");
    this.nombreUsuario = scanner.nextLine();
    return nombreUsuario;
}

public int setEdad() {
    System.out.println("Ingrese su edad: ");
    this.edad = scanner.nextInt();
    scanner.nextLine();
    return edad;
}

public String getNombre() {
    return nombre;
}

public String getNombreUsuario() {
    return nombreUsuario;
}

public int getEdad() {
    return edad;
}
public ArrayList<Pelicula> getPeliculas() {
    return peliculas;
    }

}
