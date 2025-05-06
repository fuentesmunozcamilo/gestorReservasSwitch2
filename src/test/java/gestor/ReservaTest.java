package gestor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ReservaTest {

    @Test
    void cancelar() {
        Reserva reserva = new Reserva("R002", new Usuario(), new Producto(), "2025-05-05", "Pendiente");
        reserva.cancelar();
        assertEquals("Cancelada", reserva.getEstadoReserva());
    }

    @Test
    void confirmarPago() {
    }

    @Test
    void getEstadoReserva() {
    }

    @Test
    void aplicarDescuento() {
    }

    @Test
    void getIdReserva() {
    }

    @Test
    void getUsuario() {
    }

    @Test
    void getProducto() {
    }

    @Test
    void getFechaReserva() {
    }
}