package gestor;

public class Pruebas {
    public static void main(String[] args) {

        Usuario u = new Usuario("admin", "Admin", "admin@mail.com", "1234");
        System.out.println("Prueba login: " + (u.login("admin", "1234") ? "Correcta" : "Incorrecta"));

        Producto p = new Producto("1", "Nintendo Switch", 15);
        Reserva r = new Reserva("r1", u, p, "2024-04-30", "Pendiente");
        r.confirmarPago();
        System.out.println("Reserva confirmada. Estado: " + r.getEstadoReserva());

        Pago pago = new Pago("p1", r, "tarjeta", 300.0, "pendiente");
        System.out.println("Pago procesado: " + (pago.procesar() ? "Correcto" : "Incorrecto"));

        Descuento d = new Descuento(10);
        r.aplicarDescuento(d);

        Soporte soporte = new Soporte("s1", "Soporte", "soporte@nintendo.es", "4321");
        soporte.verLogs();
    }
}
