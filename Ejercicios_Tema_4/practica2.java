/*
    * Roberto: Roberto Rico Sandoval.
    * Fille: Estructuras de control y loops (bucles).
    * Date: 02/ 07/ 2023
*/

public class practica2 {
    public static void main(String[] args) throws Exception {

        // Declaración e iniciaclización de variables.
        int numeroIf = -14;

        int numeroWhile = 0;
        int numeroDoWhile = 0;

        int numeroFor;

        String estacion = "verano";


        // Estructura de control else if.
        
        if(numeroIf > 0){

            System.out.println("\nEs un número entero: " + numeroIf);
        }
        else if(numeroIf < 0){

            System.out.println("\nEs un número negativo: " + numeroIf);
        }
        else if(numeroIf == 0){

            System.out.println("\nNeutralida: " + numeroIf);
        } 


        // Incremento hasta llegar a 3 en bucle while.
        while(numeroWhile <= 3){

            System.out.println("Control en While: " + numeroWhile);
            numeroWhile++;

        }


        // Bucle do while.
        do{

            System.out.println("\nControl en do while: " + numeroDoWhile);
            numeroDoWhile++;

            System.out.println("Control en do while: " + numeroDoWhile);
            numeroDoWhile++;

            System.out.println("Control en do while: " + numeroDoWhile);
            numeroDoWhile++;

            System.out.println("Control en do while: " + numeroDoWhile + "\n");
            numeroDoWhile++;

        }while(numeroDoWhile <= 3);


        // Bucle for.
        for(numeroFor = 0; numeroFor <= 3; numeroFor += 1){

            System.out.println("Control en for: " + numeroFor);
        }


        // Estructura Switch case.
        switch(estacion){

            case "verano":
                System.out.println("\nEsamos en: " + estacion);
                break;

            case "invierno":
                System.out.println("\nEsamos en: " + estacion);
                break;

            case "otoño":
                System.out.println("\nEsamos en: " + estacion);
                break;

            case "primavera":
                System.out.println("\nEsamos en: " + estacion);
                break;

            default:
                System.out.println("\nEsa no es una estación del año: " + estacion);
        }
    }
}

