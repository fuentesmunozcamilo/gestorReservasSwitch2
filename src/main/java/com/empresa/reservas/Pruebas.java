package com.empresa.reservas;

public class Pruebas {
    public static void main(String[] args) {
        // Prueba de login
        Usuario u = new Usuario("admin", "Admin", "admin@mail.com", "1234");
        System.out.println("Prueba login: " + (u.login("admin", "1234") ? "Correcta" : "Incorrecta"));

        // Prueba reserva
        Producto p = new Producto("1", "Nintendo Switch", 5);
        Reserva r = new Reserva("r1", u, p, "2024-04-30");
        r.confirmarPago();
        System.out.println("Reserva confirmada. Estado: " + r.getEstado());

        // Prueba pago
        Pago pago = new Pago("p1", r, "tarjeta", 300.0, "pendiente");
        System.out.println("Pago procesado: " + (pago.procesar() ? "Correcto" : "Incorrecto"));

        // Prueba descuento
        Descuento d = new Descuento(10);
        r.aplicarDescuento(d);

        // Prueba soporte
        Soporte soporte = new Soporte("s1", "Soporte", "soporte@mail.com", "pass");
        soporte.verLogs();
    }
}
