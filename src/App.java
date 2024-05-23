public class App {
    public static void main(String[] args) {
        var entrenador = new Entrenador(1, "Juan", "Perez", 19);

        System.out.println("ID: " + entrenador.getId() + ", Nombre: " + entrenador.getNombre()
                + ", Apellido: " + entrenador.getApellidos() + ", Edad: " + entrenador.getEdad());

        var masajista = new Masajista(1, "Moises", "Juarez", 45, 10);

        System.out.println("ID: " + masajista.getId() + ", Nombre: " + masajista.getNombre()
                + ", Apellido: " + masajista.getApellidos() + ", Edad: " + masajista.getEdad() + ", años de experiencia: " + masajista.getAniosExperiencia());

    }


}
