package gestor;

/**
 * Clase Producto que representa un producto disponible para reserva.
 */
public class Producto {

    private String idProducto;

    private String nombreProducto;

    private String descripcionProducto;

    private double precioProducto;

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
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.descripcionProducto = descripcion;
        this.precioProducto = precio;
        this.stock = stock;
    }

    public Producto(String number, String nintendoSwitch, int i) {
    }

    public Producto() {

    }

    /**
     * Metodo que reduce el stock del producto si hay unidades disponibles.
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
     * Metodo que aumenta el stock del producto en una unidad.
     */
    public void aumentarStock() {
        stock++;
    }

    /**
     * Metodo que obtiene el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombreProducto;
    }

    /**
     * Metodo que obtiene el precio del producto.
     *
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precioProducto;
    }

    /**
     * Metodo que devuelve el stock actual.
     *
     * @return Stock disponible.
     */
    public int getStock() {
        return stock;
    }
}
