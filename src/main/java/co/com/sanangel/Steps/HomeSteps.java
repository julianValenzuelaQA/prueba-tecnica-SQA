package co.com.sanangel.Steps;

import co.com.sanangel.PageObjects.HomePageObject;
import net.thucydides.core.annotations.Step;

public class HomeSteps {

    HomePageObject homePageObject = new HomePageObject();

    @Step
    public void openPage(){
        homePageObject.open();
    }

    @Step
    public void selectProductOne() {
        homePageObject.productoOne.click();
    }

    @Step
    public void selectProductTwo(){
        homePageObject.productoTwo.click();
    }
}
