package gestor;

/**
 * Clase base Usuario que contiene los datos y comportamientos comunes para todos los usuarios del sistema.
 */
public class Usuario {

    protected String id;
    protected String nombre;
    protected String email;
    protected String contrasena;

    /**
     * Constructor de la clase Usuario.
     *
     * @param id         Identificador único del usuario.
     * @param nombre     Nombre completo del usuario.
     * @param email      Dirección de correo electrónico del usuario.
     * @param contrasena Contraseña de acceso del usuario.
     */
    public Usuario(String id, String nombre, String email, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }
    /**
     * Constructor vacío de la clase Usuario.
     *
     * Este constructor no hace nada por sí mismo. Su propósito es permitir la creación
     * de un objeto de la clase Usuario sin necesidad de proporcionar valores inmediatos
     * para los atributos.
     */
    public Usuario() {

    }

    /**
     * Verifica si las credenciales de inicio de sesión coinciden.
     *
     * @param id         ID proporcionado.
     * @param contrasena Contraseña proporcionada.
     * @return true si las credenciales coinciden, false en caso contrario.
     */
    public boolean login(String id, String contrasena) {
        return this.id.equals(id) && this.contrasena.equals(contrasena);
    }

    /**
     * Realiza una reserva genérica.
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
     * Aplica un descuento al usuario al realizar una reserva.
     *
     * @param d Objeto Descuento que contiene el porcentaje a aplicar.
     */
    public void aplicarDescuento(Descuento d) {
        System.out.println("Descuento aplicado: " + d.getPorcentajeDescuento() + "%");
    }
}
