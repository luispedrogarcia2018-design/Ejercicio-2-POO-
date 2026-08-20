# Ejercicio-2-POO-
Ejercicio dos de POO UVG

# Analisis-Ejercicio
Para este ejercicio se usaron dos clases aparte de la main, película, con los atributos de nombre (string), la calificación (int) y el género (string); y la clase de usuario, con los atributos del nombre  (string), nombre de usuario(string), las calificaciones (int) y las películas (string). Todos estos atributos serán privados, por lo que no se le proporcionará acceso al usuario para alterarlos.

Dentro de los métodos de la clase de películas: dos métodos, uno para preguntar el nombre y para mandar a llamar el nombre, ambos devolverán un string; y dos métodos, uno para asignar la calificación y otro para mandar a llamar a la calificación. Estos métodos tienen una visibilidad pública
Para la clase de Usuario están los siguientes métodos: dos, los cuales preguntan el nombre y mandan a llamar al nombre, regresando un string y dos métodos, para asignar y mandar a llamar el nombre de usuario. Para estos métodos se les da una visibilidad pública

Se utilizará un arreglo para almacenar las calificaciones de los usuarios, esto para evitar que excedan el máximo de estas. Este arreglo almacenará datos de tipo entero. Aparte, se usará un arreglo para almacenar los nombres de las películas, para que los usuarios sepan las películas que han calificado

En la clase main, se han determinado cuatro métodos, uno para cada opción: registrar la calificación, modificar la calificación, mostrar las calificaciones y un resumen estadístico de las calificacions, estos se distinguiran entre sí mediante el atributro asignado en la interfaz, en este caso, una opción para el usuario

A los objetos iniciales se les asignará un valor de none, en lo que el usuario ingresa un valor, se los proveeremos mediante preguntas al usuario y scanners.

Las posiciones las recorreremos mediante un bucle while, con una variable contador que indica que el usuario ha alcanzado el límite de calificaciones, así determinando las posiciones y la siguiente.