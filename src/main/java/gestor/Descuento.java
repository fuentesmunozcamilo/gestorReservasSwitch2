package gestor;
/**
 * Clase Descuento que representa un porcentaje de descuento aplicable.
 */
public class Descuento {

    private int porcentajeDescuento;

    /**
     * Constructor de la clase Descuento.
     *
     * @param porcentajeDescuento Porcentaje del descuento. Este valor se asignará a la variable
     *                   de instancia porcentajeDescuento.
     */
    public Descuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    /**
     * Metodo que obtiene el porcentaje del descuento.
     *
     * @return Porcentaje actual del descuento.
     */
    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
}
