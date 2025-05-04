/**
 * Clase Descuento que representa un porcentaje de descuento aplicable.
 */
public class Descuento {
    /** Porcentaje de descuento. */
    private int porcentaje;

    /**
     * Constructor de la clase Descuento.
     *
     * @param porcentaje Porcentaje del descuento.
     */
    public Descuento(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * Obtiene el porcentaje del descuento.
     *
     * @return Porcentaje actual.
     */
    public int getPorcentaje() {
        return porcentaje;
    }
}
