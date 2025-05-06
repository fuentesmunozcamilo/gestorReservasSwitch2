package gestor;
/**
 * Esta clase representa a un Administrador que hereda de la clase Usuario y gestiona funcionalidades administrativas dentro de nuestro gestor de reservas.
 */
public class Administrador extends Usuario {

    /**
     * Constructor para crear un Administrador.
     *
     * @param id         Identificación de administrador.
     * @param nombre     Nombre de administrador.
     * @param email      Email de administrador.
     * @param contrasena Contraseña de administrador.
     */
    public Administrador(String id, String nombre, String email, String contrasena){
        super(id, nombre, email, contrasena);
    }


    /**
     * Metodo que cancela una reserva existente.
     */
    public void cancelarReserva() {
        System.out.println("La reserva ha sido cancelada.");
    }

    /**
     * Metodo que gestiona el stock de productos.
     */
    public void gestionarStock() {
        System.out.println("El stock ha sido gestionado correctamente.");
    }
}

