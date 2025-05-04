/**
 * Clase Pago que gestiona los datos del proceso de pago.
 */
public class Pago {
    /** Identificador único del pago. */
    private String id;

    /** Reserva asociada al pago. */
    private Reserva reserva;

    /** Método de pago usado (tarjeta, PayPal, etc.). */
    private String metodoPago;

    /** Cantidad de dinero pagada. */
    private double cantidadPagada;

    /** Estado del pago (pendiente, procesado, reembolsado, etc.). */
    private String estado;

    /**
     * Procesa el pago.
     *
     * @return true si se procesa correctamente, false si ocurre un error.
     */
    public boolean procesar() {
        System.out.println("Pago procesado.");
        this.estado = "Procesado";
        return true;
    }

    /**
     * Reembolsa el pago.
     *
     * @return true si el reembolso fue exitoso, false si no se pudo realizar.
     */
    public boolean reembolsar() {
        System.out.println("Pago reembolsado.");
        this.estado = "Reembolsado";
        return true;
    }
}
