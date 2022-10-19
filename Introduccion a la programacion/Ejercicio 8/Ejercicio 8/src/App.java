public class App {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        persona.setedad(55);
        persona.setnombre("Jose");
        persona.settelefono("5548582237");

        System.out.println("El nombre de esta persona es: " + persona.getnombre() + ". Y su edad es: " + persona.getedad() + " Y su telefono es: " + persona.gettelefono());
    }
}

class Persona{

    private int edad;
    private String telefono;
    private String nombre;


    public void setedad (int edad){
        this.edad = edad;
    }

    public int getedad (){
        return this.edad;
    }
    public void settelefono (String telefono){
        this.telefono = telefono;
    }

    public String gettelefono (){
        return this.telefono;
    }
   
    public void setnombre (String nombre){
        this.nombre = nombre;
    }

    public String getnombre (){
        return this.nombre;
    }
}