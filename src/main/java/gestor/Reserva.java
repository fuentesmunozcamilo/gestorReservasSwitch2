package gestor;

/**
 * Clase Reserva que representa una reserva realizada por un usuario.
 */
public class Reserva {

    private String idReserva;
    private Usuario usuario;
    private Producto producto;
    private String fechaReserva;
    private String estadoReserva;

    /**
     * Constructor completo para crear una reserva.
     *
     * @param idReserva     Identificador de la reserva.
     * @param usuario       Usuario que realiza la reserva.
     * @param producto      Producto reservado.
     * @param fechaReserva  Fecha de la reserva.
     * @param estadoReserva Estado inicial de la reserva.
     */
    public Reserva(String idReserva, Usuario usuario, Producto producto, String fechaReserva, String estadoReserva) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.producto = producto;
        this.fechaReserva = fechaReserva;
        this.estadoReserva = estadoReserva;
    }

    /**
     * Constructor vacío de la clase Reserva.
     * Este constructor no hace nada por sí mismo. Su propósito es permitir la creación
     * de un objeto de la clase Reserva sin necesidad de proporcionar valores inmediatos
     * para los atributos.
     */

    public Reserva() {

    }

    /**
     * Metodo que cancela la reserva.
     */
    public void cancelar() {
        System.out.println("Reserva cancelada.");
        this.estadoReserva = "Cancelada";
    }

    /**
     * Metodo que confirma que el pago de la reserva ha sido recibido.
     */
    public void confirmarPago() {
        System.out.println("Pago confirmado.");
        this.estadoReserva = "Pagada";
    }

    /**
     * Metodo que devuelve el estado de la reserva.
     *
     * @return Estado actual de la reserva.
     */
    public String getEstadoReserva() {
        return estadoReserva;
    }

    /**
     * Metodo que establece el estado de la reserva.
     *
     * @param estadoReserva Nuevo estado que se asignará a la reserva.
     */

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    /**
     * Metodo que aplica un descuento a la reserva.
     *
     * @param d Objeto Descuento a aplicar.
     */
    public void aplicarDescuento(Descuento d) {
        System.out.println("Descuento aplicado a la reserva: " + d.getPorcentajeDescuento() + "%");
    }
    /**
     * Metodo que devuelve el usuario.
     *
     * @return Usuario actual.
     */
    public Usuario getUsuario() {
        return usuario;
    }

}
