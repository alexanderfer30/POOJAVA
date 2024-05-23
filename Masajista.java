public class Masajista  extends Humano{
    private String Titulacion;
    private int aniosExperiencia;

    public String getTitulacion() {
        return Titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public Masajista(){

    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(int Id, String nombre, String apellidos, int edad, int aniosExperiencia) {
        super(Id, nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
    }


    public void darMasaje(){
        System.out.println("dar mensaje");
    }
@Override
    public void viajar(){
        System.out.println("el masajista esta viajando");
    }
}
