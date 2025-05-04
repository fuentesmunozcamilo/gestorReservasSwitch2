/**
 * Clase base Usuario que contiene datos y acciones comunes para todos los usuarios del sistema.
 */
public class Usuario {
    /** Identificador único del usuario. */
    protected String id;

    /** Nombre del usuario. */
    protected String nombre;

    /** Correo electrónico del usuario. */
    protected String email;

    /** Contraseña del usuario. */
    protected String contrasena;

    /**
     * Constructor de la clase Usuario.
     *
     * @param id         Identificador del usuario.
     * @param nombre     Nombre completo del usuario.
     * @param email      Dirección de correo electrónico.
     * @param contrasena Contraseña del usuario.
     */
    public Usuario(String id, String nombre, String email, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    /**
     * Verifica si el ID y la contraseña coinciden con los del usuario.
     *
     * @param id         ID proporcionado.
     * @param contrasena Contraseña proporcionada.
     * @return true si las credenciales coinciden, false si no.
     */
    public boolean login(String id, String contrasena) {
        return this.id.equals(id) && this.contrasena.equals(contrasena);
    }

    /**
     * Realiza una reserva simulada.
     */
    public void realizarReserva() {
        System.out.println("Reserva realizada.");
    }

    /**
     * Consulta el estado actual de una reserva.
     */
    public void consultarEstadoReserva() {
        System.out.println("Estado de la reserva consultado.");
    }

    /**
     * Aplica un descuento al usuario.
     *
     * @param d Objeto Descuento que contiene el porcentaje a aplicar.
     */
    public void aplicarDescuento(Descuento d) {
        System.out.println("Descuento aplicado: " + d.getPorcentaje() + "%");
    }
}
