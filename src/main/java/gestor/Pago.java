package gestor;
/**
 * Clase Pago que gestiona los datos del proceso de pago.
 */
public class Pago {

    private String idPago;
    private Reserva reservaPago;
    private String metodoPago;
    private double cantidadPagada;
    private String estadoPago;

    /**
     * Constructor completo para crear un objeto Pago con todos sus datos.
     *
     * @param idPago         Identificador del pago.
     * @param reservaPago    Reserva asociada al pago.
     * @param metodoPago     Metodo de pago utilizado.
     * @param cantidadPagada Monto total pagado.
     * @param estadoPago     Estado actual del pago (ej. Pendiente, Procesado).
     */
    public Pago(String idPago, Reserva reservaPago, String metodoPago, double cantidadPagada, String estadoPago) {
        this.idPago = idPago;
        this.reservaPago = reservaPago;
        this.metodoPago = metodoPago;
        this.cantidadPagada = cantidadPagada;
        this.estadoPago = estadoPago;
    }
    /**
     * Constructor vacío de la clase Pago.
     *
     * Este constructor no hace nada por sí mismo. Su propósito es permitir la creación
     * de un objeto de la clase Pago sin necesidad de proporcionar valores inmediatos
     * para los atributos.
     */
    public Pago() {

    }

    /**
     * Metodo que procesa el pago.
     *
     * @return true si se procesa correctamente, false si ocurre un error.
     */
    public boolean procesar() {
        System.out.println("Pago procesado.");
        this.estadoPago = "Procesado";
        return true;
    }

    /**
     * Metodo que reembolsa el pago.
     *
     * @return true si el reembolso fue exitoso, false si no se pudo realizar.
     */
    public boolean reembolsar() {
        System.out.println("Pago reembolsado.");
        this.estadoPago = "Reembolsado";
        return true;
    }
}
