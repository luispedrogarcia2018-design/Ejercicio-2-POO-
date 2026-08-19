public class Pelicula {
   private String nombre;
   private int calificacion;
   private String genero;




Pelicula (String nombre, int calificacion, String genero) {
    this.nombre = nombre;
    this.calificacion = calificacion;
    this.genero = genero;
}

public String getNombre(){
    return nombre;

}
public int getCalificacion(){
    return calificacion;
}
public String getGenero(){
    return genero;
}

}
