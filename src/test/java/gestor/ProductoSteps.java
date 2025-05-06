package gestor;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoSteps {

    private Producto producto;
    private int stockObtenido;

    @Given("un producto con un stock de {int} unidades")
    public void unProductoConUnStockDeUnidades(int stock) {
        producto = new Producto();
        for (int i = 0; i < stock; i++) {
            producto.aumentarStock();
        }
    }

    @When("el usuario consulta el stock")
    public void elUsuarioConsultaElStock() {
        stockObtenido = producto.getStock();
    }

    @Then("el stock del producto debe ser {int}")
    public void elStockDelProductoDebeSer(int stockEsperado) {
        assertEquals(stockEsperado, stockObtenido);
    }
}
