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

    /**
     * Constructor de la clase Producto.
     *
     * Este constructor está definido con tres parámetros: un String (number), un String (nintendoSwitch),
     * y un entero (i). Sin embargo, actualmente no realiza ninguna acción, ya que no tiene cuerpo.
     * Esto podría ser un error o un constructor que se planeaba implementar más adelante.
     *
     * Es importante revisar si se desea usar este constructor o eliminarlo si no tiene una implementación
     * específica o si no se va a utilizar.
     *
     * @param number       Un identificador o número asociado al producto (posiblemente su ID).
     * @param nintendoSwitch El nombre o descripción del producto.
     * @param i            Una cantidad, precio o cualquier otro dato relacionado con el producto.
     */

    public Producto(String number, String nintendoSwitch, int i) {
    }
    /**
     * Constructor vacío de la clase Producto.
     *
     * Este constructor no hace nada por sí mismo. Su propósito es permitir la creación
     * de un objeto de la clase Producto sin necesidad de proporcionar valores inmediatos
     * para los atributos.
     */
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
