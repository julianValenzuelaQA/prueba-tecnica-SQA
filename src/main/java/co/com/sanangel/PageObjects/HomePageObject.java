package co.com.sanangel.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://sanangel.com.co/")
public class HomePageObject extends PageObject {


    @FindBy(xpath = "(//h2)[1]")
    public WebElementFacade productoOne;

    @FindBy(xpath = "(//h2)[2]")
    public WebElementFacade productoTwo;

}
