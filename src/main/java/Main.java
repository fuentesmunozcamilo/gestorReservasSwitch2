import gestor.Usuario;
import gestor.Administrador;
import gestor.Soporte;
import gestor.Producto;
import gestor.Pago;
import gestor.Reserva;
import gestor.Descuento;
/**
 * Clase principal para probar la funcionalidad del sistema de reservas.
 */
public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("P001", "Consola", "Nintendo Switch 2", 499.99, 15);

        Usuario cliente = new Usuario("U001", "Camilo", "camilo@email.com", "1234");

        Reserva reserva = new Reserva();
        reserva.cancelar();
        reserva.confirmarPago();

        Pago pago = new Pago();
        pago.procesar();
        pago.reembolsar();

        Descuento descuento = new Descuento(10);
        reserva.aplicarDescuento(descuento);

        Soporte soporte = new Soporte("S001", "Soporte1", "soporte@email.com", "abcd");
        soporte.verLogs();
        soporte.consultarTicket();

        Administrador admin = new Administrador("A001", "Admin", "admin@email.com", "admin");
        admin.gestionarStock();
        admin.cancelarReserva();

    }
}
