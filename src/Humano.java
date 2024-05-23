public class Humano {


    private int Id;
    private String   nombre ;
    private String apellidos;
    private int edad;

    public Humano(){

    }
    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Humano(int pId, String pNombre, String pApellidos, int pEdad) {
        this.Id = pId;
        this.nombre = pNombre;
        this.apellidos= pApellidos;
        this.edad = pEdad;
    }

   public void concentrarse(){
       System.out.println("concentrado");
   }

   public void viajar(){
       System.out.println("viajando");
   }
}


