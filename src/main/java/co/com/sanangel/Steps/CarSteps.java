package co.com.sanangel.Steps;

import co.com.sanangel.PageObjects.CarPageObject;
import net.thucydides.core.annotations.Step;

public class CarSteps {

    CarPageObject carPageObject = new CarPageObject();

    @Step
    public void clickHomeButton(){
        carPageObject.homeButton.click();
    }

    @Step
    public void verifyProductUnitsOne(String units){
       carPageObject.productUnitsOne.waitUntilVisible();
        String quantityValue = carPageObject.productUnitsOne.getValue();
        if (!quantityValue.equals(units)) {
            throw new AssertionError("El valor esperado es " + units + " pero el valor actual es " + quantityValue);
        }
    }

    @Step
    public void verifyProductUnitsTwo(String units){
        carPageObject.productUnitsTwo.waitUntilVisible();
        String quantityValue = carPageObject.productUnitsTwo.getValue();
        if (!quantityValue.equals(units)) {
            throw new AssertionError("El valor esperado es " + units + " pero el valor actual es " + quantityValue);
        }
    }
}
