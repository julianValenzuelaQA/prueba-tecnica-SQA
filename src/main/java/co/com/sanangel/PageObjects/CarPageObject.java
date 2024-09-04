package co.com.sanangel.PageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarPageObject extends PageObject {

    @FindBy(className = "navmenu__logo")
    public WebElementFacade homeButton;

    @FindBy(xpath = "(//input[@class='input-text qty text'])[1]")
    public WebElementFacade productUnitsOne;

    @FindBy(xpath = "(//input[@class='input-text qty text'])[2]")
    public WebElementFacade productUnitsTwo;

}
