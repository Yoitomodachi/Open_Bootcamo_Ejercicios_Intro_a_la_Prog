/*
    * Autor: Roberto Rico Sandoval.
    * Fille: Programación dirigida por eventos en Java (Básico).
    * Date: 12/ 06/ 2023
*/

                                /*****  Parte 1   *****/

public class practica1_parte1_OpenBootcamp {
     public static void main(String[] args) throws Exception {

        // Invocación de la funciones en el main y definición de valores en los argumentos.
        numeros(25, 45, 60.9547);
        
    }

    // Función númerica.
    public static void numeros(int n_uno, int n_dos, double n_tres){

        // Definición de variable.
        double sumatoria;

        // Inicialización de la variable en 0.
        sumatoria = 0;

        // Actualización de la variable, en donde, se suman los 3 argumentos.
        sumatoria = (n_uno + n_dos + n_tres);

        // Devolver el resultado de la función por medio de una salida de datos.
        System.out.println("El resultado de la sumatoria del num1 + num2 + num3 es: " + sumatoria);
    }

}

