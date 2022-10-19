public class App {
    public static void main(String[] args) throws Exception {

        cliente cliente = new cliente();
        cliente.setedad(55);
        cliente.setnombre("Jose");
        cliente.settelefono("5548582237");
        cliente.setcredito(1000);

        System.out.println("El nombre de esta persona es: " + cliente.getnombre() + ". Y su edad es: " + cliente.getedad() + " Y su telefono es: " + cliente.gettelefono());

        trabajador trabajador = new trabajador();

        trabajador.setsalario(3000);
        trabajador.setnombre("Juan");
        trabajador.settelefono("2435464");
        trabajador.setedad(33);


        System.out.println(trabajador.getsalario());
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

class cliente extends Persona{

    private int credito;

    public void setcredito (int credito){
        this.credito = credito;
    }

    public int getcredito (){
        return this.credito;
    }
}

class trabajador extends Persona {

    private int salario;

    public void setsalario(int salario){
        this.salario = salario;
    }

    public int getsalario(){
        return this.salario;
    }
    
}