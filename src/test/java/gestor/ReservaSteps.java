package gestor;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

import gestor.Reserva;

public class ReservaSteps {

    private Reserva reserva;

    @Given("una reserva con estado {string}")
    public void unaReservaConEstado(String estado) {
        reserva = new Reserva();
        reserva.setEstadoReserva(estado);
    }

    @When("el usuario cancela la reserva")
    public void elUsuarioCancelaLaReserva() {
        reserva.cancelar();
    }

    @Then("el estado de la reserva debe ser {string}")
    public void elEstadoDeLaReservaDebeSer(String estadoEsperado) {
        assertEquals(estadoEsperado, reserva.getEstadoReserva());
    }
}
