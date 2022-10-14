public class App {
    public static void main(String[] args) throws Exception {
        // Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = -1;

        if(numeroIf>0){
            System.out.println("Es positivo");
        }
        else if(numeroIf == 0){
            System.out.println("Es igual a 0");
        }
        else{
            System.out.println("Es negativo");
        }


        /*  Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

             --Incrementar el valor de la variable en uno cada vez que se ejecute.

             --Mostrarlo por pantalla cada vez que se ejecute.*/

        int numeroWhile = 0;

        while (numeroWhile<3) {
            numeroWhile++;
            System.out.println(numeroWhile);

        }

        // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile<3);

       

        /*Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será 
        que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y 
        deberá mostrarse por pantalla. */

        for(int numerofor = 0;numerofor<=3;numerofor++){
            System.out.println(numerofor);
        }



        /*Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro 
        estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por 
        consola informando de la estación en la que está. También habrá que poner un default para cuando 
        el valor de la variable no sea una estación. */


        String estacion = "VERANO";

        switch(estacion){
            case "VERANO": System.out.println("La estacion es VERANO"); 
            break;
            case "INVIERNO": System.out.println("La estacion es INVIERNO");
            break;
            case "PRIMAVERA": System.out.println("La estacion es PRIMAVERA");
            break;
            case "OTOÑO": System.out.println("La estacion es OTOÑO");
            break;
            default: System.out.println("el valor de la variable no sea una estación");

        }



    }
}
