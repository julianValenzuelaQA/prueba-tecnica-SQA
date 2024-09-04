package co.com.sanangel.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPageObject extends PageObject {


    @FindBy(name = "quantity")
     public WebElementFacade inputQuantity;

}
