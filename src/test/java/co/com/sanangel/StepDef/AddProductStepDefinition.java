package co.com.sanangel.StepDef;

import co.com.sanangel.Steps.CarSteps;
import co.com.sanangel.Steps.HomeSteps;
import co.com.sanangel.Steps.ProductSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddProductStepDefinition {

    @Steps
    HomeSteps homeSteps;

    @Steps
    ProductSteps productSteps;

    @Steps
    CarSteps carSteps;


    @Given("^el usuario esta en la pagina de san angel$")
    public void elUsuarioEstaEnLaPaginaDeSanAngel() {
        homeSteps.openPage();

    }

    @When("^el usuario agrega un primer producto con \"([^\"]*)\" unidades$")
    public void elUsuarioAgregaUnPrimerProductoConUnidades(String units) {
        homeSteps.selectProductOne();
        productSteps.changeUnits(units);
        carSteps.clickHomeButton();
    }

    @When("^el usuario agrega un segundo producto con \"([^\"]*)\" unidades$")
    public void elUsuarioAgregaUnSegundoProductoConUnidades(String units) {
        homeSteps.selectProductTwo();
        productSteps.changeUnits(units);
    }

    @Then("^el usuario deberia ver los productos con sus unidades \"([^\"]*)\" y \"([^\"]*)\" en el carrito$")
    public void elUsuarioDeberiaVerLosProductosConSusUnidadesYEnElCarrito(String unitsProduct1, String unitsProduct2) {
        carSteps.verifyProductUnitsOne(unitsProduct1);
        carSteps.verifyProductUnitsTwo(unitsProduct2);
    }
}
