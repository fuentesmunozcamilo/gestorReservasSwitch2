package gestor;

/**
 * La clase Soporte que hereda de Usuario y ofrece soporte técnico a los diferentes usuarios.
 */
public class Soporte extends Usuario {

    /**
     * Constructor para crear un usuario de Soporte.
     *
     * @param id         Identificador de soporte.
     * @param nombre     Nombre completo soporte.
     * @param email      Correo electrónico de soporte.
     * @param contrasena Contraseña de soporte.
     */
    public Soporte(String id, String nombre, String email, String contrasena) {
        super(id, nombre, email, contrasena);
    }

    /**
     * Metodo que permite ver los logs del sistema.
     */
    public void verLogs() {
        System.out.println("Mostrando logs del sistema...");
    }

    /**
     * Metodo que consulta los tickets de soporte.
     */
    public void consultarTicket() {
        System.out.println("Consultando tickets de soporte...");
    }
}
