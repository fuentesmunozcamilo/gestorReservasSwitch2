/**
 * Clase Producto que representa un producto disponible para reserva.
 */
public class Producto {
    /** Identificador único del producto. */
    private String id;

    /** Nombre del producto. */
    private String nombre;

    /** Descripción del producto. */
    private String descripcion;

    /** Precio del producto. */
    private double precio;

    /** Stock disponible del producto. */
    private int stock;

    /**
     * Constructor de la clase Producto.
     *
     * @param id          Identificador del producto.
     * @param nombre      Nombre del producto.
     * @param descripcion Descripción del producto.
     * @param precio      Precio del producto.
     * @param stock       Cantidad disponible en stock.
     */
    public Producto(String id, String nombre, String descripcion, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Reduce el stock del producto si hay unidades disponibles.
     *
     * @return true si se redujo el stock correctamente, false si no hay stock.
     */
    public boolean reducirStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    /**
     * Aumenta el stock del producto en una unidad.
     */
    public void aumentarStock() {
        stock++;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve el stock actual.
     *
     * @return Stock disponible.
     */
    public int getStock() {
        return stock;
    }
}
