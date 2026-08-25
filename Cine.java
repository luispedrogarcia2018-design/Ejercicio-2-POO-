import java.util.Scanner;
import java.util.ArrayList;
public class Cine {

private static String nombreCine = "MovieSesh Starr";
private static int opcion;
private static String nombrePelicula;
private static String genero;
private static int Limite;
private static ArrayList<Usuario> usuarios = new ArrayList<>();
private static Usuario usuarioActual;

public static void RegistrarPeliculas(){
    Scanner scanner = new Scanner(System.in); 
                System.out.println("Ingrese cuantas películas ingresará: ");
                int x = scanner.nextInt();
                scanner.nextLine();
                int Limite = 10-usuarioActual.getPeliculas().size();
                if (Limite>=x){
                for(int i = 1; i<=x ; i++){
                    Pelicula pelicula = new Pelicula();

                    if (pelicula.getCalificacion()>=1 && pelicula.getCalificacion()<=10){
                    usuarioActual.getPeliculas().add(pelicula);
                    }
                    else{
                    System.err.println("Calificación inválida, se descartará la película");
                    }
                }
            }
                else{
                System.err.println("Error, solo le quedan "+ Limite +
                 " ,se usarán solo esas posiciones");
                for(int i = 1; i<=Limite ; i++){
                    Pelicula pelicula = new Pelicula();

                    if (pelicula.getCalificacion()>=1 && pelicula.getCalificacion()<=10){
                    usuarioActual.getPeliculas().add(pelicula);
                    }
                    else{
                    System.err.println("Calificación inválida, se descartará la película");
                    }
                }
            }
        }

public static void ModificarCalificacion(){
    Scanner scanner = new Scanner(System.in); 
                if (!usuarioActual.getPeliculas().isEmpty()) {

                    System.out.println("Ingrese la peli a modificar la calificación:");
                    String peliculaNueva = scanner.nextLine();
                    boolean encontrada = false;

                for (Pelicula pelicula : usuarioActual.getPeliculas()) {

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

public static void ConsultarCalificaciones(){
                if(usuarioActual.getPeliculas().size()!=0){
                    for (Pelicula pelicula : usuarioActual.getPeliculas()){
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
                if (usuarioActual.getPeliculas().isEmpty()){
                    System.err.println("No ha calificado ninguna película");
            }
                else{
                Pelicula mayor = usuarioActual.getPeliculas().get(0);
                Pelicula menor = usuarioActual.getPeliculas().get(0);

                int suma = 0;
                for (Pelicula pelicula : usuarioActual.getPeliculas()){
                    if(pelicula.getCalificacion()> mayor.getCalificacion()){
                        mayor = pelicula;

                }
                    if(pelicula.getCalificacion()<menor.getCalificacion()){
                        menor = pelicula;

                }
                    suma += pelicula.getCalificacion();
            }
                float Promedio = (float) suma/usuarioActual.getPeliculas().size();

                System.out.println("La película con mayor calificación es: " +mayor.getNombre()+
             " Nota: " + mayor.getCalificacion() );
                System.out.println("La película con menor calificación es: "
                +menor.getNombre()+" Nota: " + menor.getCalificacion());
                System.out.println("El promedio de calificaciones es: " + Promedio );
        }
}

public static void MostrarCalificacion(){
    Scanner scanner = new Scanner(System.in); 
    if (!usuarioActual.getPeliculas().isEmpty()){
        System.out.println("Ingrese el nombre de la película a encontrar: ");
        String mostrarPelicula = scanner.nextLine();
        for(Pelicula pelicula: usuarioActual.getPeliculas()){
            if (pelicula.getNombre().equalsIgnoreCase(mostrarPelicula)){
                System.out.println("----------------------");
                System.out.println("Nombre de la película: " + pelicula.getNombre());
                System.out.println("Nota: " + pelicula.getCalificacion());
                System.out.println("Genero: "+pelicula.getGenero());
                System.out.println("----------------------");
            }
            else{
                System.err.println("No se ha encontrado la película");
            }
        }
    }
    else{
        System.err.println("No ha calificado ninguna película");
    }
}

public static void MostrarPosiciones(){
    System.out.println("Por ahora, le quedan: " + Limite + " películas");
}

public static void CambiarUsuario() {

    Usuario nuevoUsuario = new Usuario();

    usuarios.add(nuevoUsuario);
    usuarioActual = nuevoUsuario;

    System.out.println("Usuario cambiado a: "
            + usuarioActual.getNombreUsuario());
}

public static void Opcion(int opcion){
    
    Scanner scanner = new Scanner(System.in);   
    while (true){

        if (usuarioActual.getPeliculas().size()<10){
            if (opcion==1){
                RegistrarPeliculas();
}
            else if (opcion == 2) {
                ModificarCalificacion();
}
            else if (opcion == 3){
                ConsultarCalificaciones();
            }

            else if (opcion==4){
                ResumenEstadistico();
}
            else if (opcion == 5){
                MostrarCalificacion();
            }
            else if (opcion == 6){
                MostrarPosiciones();
            }
            else if (opcion == 7){
                CambiarUsuario();
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
        System.out.println("5. Mostrar la calificación de una película específica");
        System.out.println("6. Mostrar cuantas películas le quedan para calificar");
        System.out.println("7. Cambiar de usuario");
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
        System.out.println("5. Mostrar la calificación de una película específica");
        System.out.println("6. Mostrar cuantas películas le quedan para calificar");
        System.out.println("7. Cambiar de usuario");
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
    usuarioActual = new Usuario();
    usuarios.add(usuarioActual);
    
    System.out.println("Bienvenido al menú, estas son las opciones:");
    System.out.println("1. Registrar una calificación");
    System.out.println("2. Modificar la calificación");
    System.out.println("3. Consultar la calificación");
    System.out.println("4. Resumen estadístico");
    System.out.println("5. Mostrar la calificación de una película específica");
    System.out.println("6. Mostrar cuantas películas le quedan para calificar");
    System.out.println("7. Cambiar de usuario");
    System.out.println("Pulse 0 para salir");
    int opcion = scanner.nextInt();


    Opcion(opcion);
    
    

}
}

