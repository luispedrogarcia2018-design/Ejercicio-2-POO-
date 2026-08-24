import java.util.Scanner;
import java.util.ArrayList;
public class Cine {

private static String nombreCine = "MovieSesh Starr";
private static int opcion;
private static String nombrePelicula;
private static String genero;
private static ArrayList<Pelicula> peliculas = new ArrayList<>();

public static void RegistrarPeliculas(){
    Scanner scanner = new Scanner(System.in); 
                System.out.println("Ingrese cuantas películas ingresará: ");
                int x = scanner.nextInt();
                scanner.nextLine();
                int Lim = 10-peliculas.size();
                if (Lim>=x){
                for(int i = 1; i<=x ; i++){
                    Pelicula pelicula = new Pelicula();

                    if (pelicula.getCalificacion()>=1 && pelicula.getCalificacion()<=10){
                    peliculas.add(pelicula);
                    }
                    else{
                    System.err.println("Calificación inválida, se descartará la película");
                    }
                }
            }
                else{
                System.err.println("Error, solo le quedan "+ Lim +
                 " ,se usarán solo esas posiciones");
                for(int i = 1; i<=Lim ; i++){
                    Pelicula pelicula = new Pelicula();

                    if (pelicula.getCalificacion()>=1 && pelicula.getCalificacion()<=10){
                    peliculas.add(pelicula);
                    }
                    else{
                    System.err.println("Calificación inválida, se descartará la película");
                    }
                }
            }
        }



public static void ModificarCalificacion(){
    Scanner scanner = new Scanner(System.in); 
                if (!peliculas.isEmpty()) {

                    System.out.println("Ingrese la peli a modificar la calificación:");
                    String peliculaNueva = scanner.nextLine();
                    boolean encontrada = false;

                for (Pelicula pelicula : peliculas) {

                    if (pelicula.getNombre().equalsIgnoreCase(peliculaNueva)) {
                        pelicula.setCalificacion();
                        encontrada = true;
                        break;
            }
        }

                if (!encontrada) {
                    System.out.println("Película no encontrada");
    }

    }           else {
                    System.out.println("No ha calificado ninguna película");
    }
}

public static void ConsultarCalificacion(){
                if(peliculas.size()!=0){
                    for (Pelicula pelicula : peliculas){
                        System.out.println("Película: "+pelicula.getNombre());
                        System.out.println("Calificacion: "+pelicula.getCalificacion());
                        System.out.println("Genero: "+pelicula.getGenero());
                        System.out.println("------------------------");}
            }
                else{
                    System.out.println("No ha calificado ninguna película");
                }
        }

public static void ResumenEstadistico(){
                if (peliculas.isEmpty()){
                    System.err.println("No ha calificado ninguna película");
            }
                else{
                Pelicula mayor = peliculas.get(0);
                Pelicula menor = peliculas.get(0);

                int suma = 0;
                for (Pelicula pelicula : peliculas){
                    if(pelicula.getCalificacion()> mayor.getCalificacion()){
                        mayor = pelicula;

                }
                    if(pelicula.getCalificacion()<menor.getCalificacion()){
                        menor = pelicula;

                }
                    suma += pelicula.getCalificacion();
            }
                float Promedio = (float) suma/peliculas.size();

                System.out.println("La película con mayor calificación es: " +mayor.getNombre()+
             " Nota: " + mayor.getCalificacion() );
                System.out.println("La película con menor calificación es: "
                +menor.getNombre()+" Nota: " + menor.getCalificacion());
                System.out.println("El promedio de calificaciones es: " + Promedio );
        }
}

public static void Opcion(int opcion){
    
    Scanner scanner = new Scanner(System.in);   
    while (true){

        if (peliculas.size()<10){
            if (opcion==1){
                RegistrarPeliculas();
}
            else if (opcion == 2) {
                ModificarCalificacion();
}
            else if (opcion == 3){
                ConsultarCalificacion();
            }

            else if (opcion==4){
                ResumenEstadistico();
}
            else if(opcion==0){
                System.out.println("Saliendo...");
                break;
            }
            else{
    System.err.println("Esta opción no está disponible");
}
        System.out.println("Desea realizar otras opciones:");
        System.out.println("1. Registrar una calificación");
        System.out.println("2. Modificar la calificación");
        System.out.println("3. Consultar la calificación");
        System.out.println("4. Resumen estadístico");
        System.out.println("Pulse 0 para salir");
        opcion = scanner.nextInt();
        scanner.nextLine();
    }


        else{
        System.out.println("Ya ha calificado más de 10 películas");
        System.out.println("Desea realizar otras opciones:");
        System.out.println("2. Modificar la calificación");
        System.out.println("3. Consultar la calificación");
        System.out.println("4. Resumen estadístico");
        System.out.println("Pulse 0 para salir");
        opcion = scanner.nextInt();
        scanner.nextLine();
        }
    }
}



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
    System.out.println("Bienvenido al menú, estas son las opciones:");
    System.out.println("1. Registrar una calificación");
    System.out.println("2. Modificar la calificación");
    System.out.println("3. Consultar la calificación");
    System.out.println("4. Resumen estadístico");
    System.out.println("Pulse 0 para salir");
    int opcion = scanner.nextInt();


    Opcion(opcion);
    
    

}
}

