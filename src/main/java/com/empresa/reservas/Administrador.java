/**
 * Clase Administrador que hereda de Usuario y gestiona funcionalidades administrativas.
 */
public class Administrador extends Usuario {

    /**
     * Constructor para crear un Administrador.
     *
     * @param id         Identificador del administrador.
     * @param nombre     Nombre del administrador.
     * @param email      Email del administrador.
     * @param contrasena Contraseña del administrador.
     */
    public Administrador(String id, String nombre, String email, String contrasena) {
        super(id, nombre, email, contrasena);
    }

    /**
     * Cancela una reserva existente.
     *
     * @return true si se canceló correctamente, false en caso contrario.
     */
    public boolean cancelarReserva() {
        System.out.println("Reserva cancelada.");
        return true;
    }

    /**
     * Gestiona el stock de productos.
     */
    public void gestionarStock() {
        System.out.println("Stock gestionado.");
    }
}
