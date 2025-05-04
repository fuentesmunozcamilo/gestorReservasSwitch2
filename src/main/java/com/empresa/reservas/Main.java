/**
 * Clase principal para probar la funcionalidad del sistema de reservas.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un producto
        Producto producto = new Producto("P001", "Cámara", "Cámara digital 4K", 299.99, 5);

        // Crear un usuario
        Usuario cliente = new Usuario("U001", "Camilo", "camilo@email.com", "1234");

        // Crear una reserva
        Reserva reserva = new Reserva();
        reserva.cancelar(); // Cancelar reserva
        reserva.confirmarPago(); // Confirmar pago

        // Crear un pago y procesarlo
        Pago pago = new Pago();
        pago.procesar();
        pago.reembolsar();

        // Crear descuento
        Descuento descuento = new Descuento(10);
        reserva.aplicarDescuento(descuento);

        // Crear soporte y ver logs
        Soporte soporte = new Soporte("S001", "Soporte1", "soporte@email.com", "abcd");
        soporte.verLogs();
        soporte.consultarTicket();

        // Crear administrador y cancelar reserva
        Administrador admin = new Administrador("A001", "Admin", "admin@email.com", "admin");
        admin.gestionarStock();
        admin.cancelarReserva();
    }
}
