public class Futbolista extends Humano {

    private int Dorsal;

    public Futbolista(int Id, String nombre, String apellidos, int edad, int dorsal) {
        super(Id, nombre, apellidos, edad);
        Dorsal = dorsal;
    }

    private String Desmarcacion;

    public Futbolista(){

    }

    public int getDorsal() {
        return Dorsal;
    }

    public String getDesmarcacion() {
        return Desmarcacion;
    }


    public void setDorsal(int dorsal) {
        Dorsal = dorsal;
    }

    public void setDesmarcacion(String desmarcacion) {
        Desmarcacion = desmarcacion;
    }

    public void Jugar(){
        System.out.println("Jugando");
    }

    public void Entrenar(){
        System.out.println("Entrenando esta el futbolistas");
    }

    @Override
    public void viajar(){
        System.out.println("el futbolista esta viajando");
    }

}
