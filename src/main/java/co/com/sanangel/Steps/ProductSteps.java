package co.com.sanangel.Steps;

import co.com.sanangel.PageObjects.ProductPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class ProductSteps {

    ProductPageObject productPageObject = new ProductPageObject();

    @Step
    public void changeUnits(String units) {

            productPageObject.inputQuantity.clear();
            productPageObject.inputQuantity.sendKeys(units);
            productPageObject.inputQuantity.sendKeys(Keys.ENTER);
    }
}
