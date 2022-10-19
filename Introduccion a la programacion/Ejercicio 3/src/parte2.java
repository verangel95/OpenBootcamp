public class parte2 {
    public static void main(String[] args) throws Exception {
        coche micoche; // creacion del objeto
        micoche = new coche();
        micoche.agregarpuerta();
        micoche.agregarpuerta();
        System.out.println(micoche.puertas);

    }
    static class coche { //creacion de la clase
        
        public int puertas = 0; // declaramos las variables

        public void agregarpuerta(){ // declaramos la funcion para agregar puertas
            this.puertas++;
        }
        
        }

    }
