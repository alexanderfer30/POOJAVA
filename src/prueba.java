public class prueba extends Humano {
    public static void main(String[] args) {
        var Futbolista = new Futbolista(1, "mario", "casas", 19, 10);
        System.out.println("el id es "+ Futbolista.getId()+ "el nombre es "+Futbolista.getNombre()+ "el apellido es "+ Futbolista.getApellidos()+
                "la edad es "+ Futbolista.getEdad()+ "el dorsal es "+ Futbolista.getDorsal());
        Futbolista.Entrenar();
    }
}


