/**
 * Clase Soporte que hereda de Usuario y ofrece soporte técnico a usuarios.
 */
public class Soporte extends Usuario {

    /**
     * Constructor para crear un usuario de Soporte.
     *
     * @param id         Identificador.
     * @param nombre     Nombre completo.
     * @param email      Correo electrónico.
     * @param contrasena Contraseña.
     */
    public Soporte(String id, String nombre, String email, String contrasena) {
        super(id, nombre, email, contrasena);
    }

    /**
     * Permite ver los logs del sistema.
     */
    public void verLogs() {
        System.out.println("Mostrando logs del sistema...");
    }

    /**
     * Consulta los tickets de soporte.
     */
    public void consultarTicket() {
        System.out.println("Consultando tickets de soporte...");
    }
}
