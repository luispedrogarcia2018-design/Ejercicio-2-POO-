public class Usuario {

private String nombre;
private String nombreUsuario;
private int edad;


Usuario (String nombre, String nombreUsuario, int edad) {
    this.nombre = nombre;
    this.nombreUsuario = nombreUsuario;
    this.edad = edad;
}

 // setNombre es para asignar un valor a la varible nombre
public String setNombre(String nombre) {
    this.nombre = nombre;
    return nombre;
}

public String setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
    return nombreUsuario;
}

public int setEdad(int edad) {
    this.edad = edad;
    return edad;
}

// getNombre es para obtener el valor de la variable nombre
public String getNombre() {
    return nombre;
}

public String getNombreUsuario() {
    return nombreUsuario;
}

public int getEdad() {
    return edad;
}


}
