/*
    * Autor: Roberto Rico Sandoval.
    * Fille: Programación dirigida por eventos en Java (Básico) y simulación de POO.
    * Date: 12/ 06/ 2023
*/

                                /*****  Parte 2   *****/

public class practica1_parte2_OpenBootcamp {

    // Definición de la clase Coche.
    public static class Coche {

        // Definición inicial de las puertas del coche.
        int puertas = 4;

        // Función de incremento de las puertas del coche.
        public int Incremento(int N_puerta){

            int nuevas_puertas = puertas + N_puerta;
            return nuevas_puertas;
        }

    }
    public static void main(String[] args) throws Exception {

        // Creación del objeto MiCoche.
        Coche MiCoche = new Coche();

        // Dar el valor del incremento más 1
        int nuevas_puertas = MiCoche.Incremento(2) + 1;

        // Imprimir el total de puertas.
        System.out.println(nuevas_puertas);
        
    }
}

