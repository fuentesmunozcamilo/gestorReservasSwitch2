import java.util.Date;

/**
 * Clase Reserva que representa una reserva realizada por un usuario.
 */
public class Reserva {
    /** Identificador único de la reserva. */
    private String id;

    /** Usuario que realiza la reserva. */
    private Usuario usuario;

    /** Producto reservado. */
    private Producto producto;

    /** Fecha de la reserva. */
    private Date fecha;

    /** Estado de la reserva (pendiente, confirmada, cancelada, etc.). */
    private String estado;

    /**
     * Cancela la reserva.
     */
    public void cancelar() {
        System.out.println("Reserva cancelada.");
        this.estado = "Cancelada";
    }

    /**
     * Confirma que el pago de la reserva ha sido recibido.
     */
    public void confirmarPago() {
        System.out.println("Pago confirmado.");
        this.estado = "Pagada";
    }

    /**
     * Devuelve el estado de la reserva.
     *
     * @return Estado actual de la reserva.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Aplica un descuento a la reserva.
     *
     * @param d Objeto Descuento a aplicar.
     */
    public void aplicarDescuento(Descuento d) {
        System.out.println("Descuento aplicado a la reserva: " + d.getPorcentaje() + "%");
    }
}
