public class Entrenador extends  Humano{

    private String Federacion;

    public Entrenador(int Id, String nombre, String apellidos, int edad) {
        super(Id, nombre, apellidos, edad);
    }

    public Entrenador(){

    }
    public String getFederacion() {
        return Federacion;
    }

    public void setFederacion(String federacion) {
        Federacion = federacion;
    }

    public void viajar(){
        System.out.println("el entrenador esta viajando y yo no se mañana que sera de mi asi que me voy");
    }

}
