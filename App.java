public class App {
    public static void main(String[] args) {
        var entrenador = new Entrenador(1, "Juan", "Perez", 19);

        System.out.println("ID: " + entrenador.getId() + ", Nombre: " + entrenador.getNombre()
                + ", Apellido: " + entrenador.getApellidos() + ", Edad: " + entrenador.getEdad());
    }
}
