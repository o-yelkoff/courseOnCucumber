package steps;

import config.UserConfig;
import config.Utilities;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.OrderPage;

public class OrderPageDef {
    OrderPage orderPage = new OrderPage();

    @Then("Check that we are on the Order page")
    public void checkThatWeAreOnTheOrderPage() {
        orderPage.headerNameVisible();
    }

    @Then("Mark callBack checkbox")
    public void markCallBackCheckbox() {
        orderPage.markCallBackOption();
    }

    @Then("Leave the comment")
    public void leaveTheComment() {
        orderPage.confirmButtonClick();
    }


    @Then("Select city in dropdown")
    public void selectCityInDropdown() {
        orderPage.selectCityInDropdown();
    }

    @Then("Select post point")
    public void selectPostPoint() {
        orderPage.selectPostPoint();
        Utilities.sleep(1000);
    }

    @Then("Select payment method")
    public void selectPaymentMethod() {
        orderPage.selectPaymentMethod();
    }
    @Then("Click confirmTheOrder button")
    public void clickConfirmTheOrderButton() {
        orderPage.confirmButtonClick();
    }

    @Then("User made an order of selected book")
    public void userMadeAnOrderOfSelectedBook() {
        orderPage.headerNameVisible();
        Assertions.assertThat(orderPage.headerNameVisible()).isTrue();
        orderPage.markCallBackOption();
        orderPage.selectCityInDropdown();
        orderPage.selectPostPoint();
        orderPage.selectPaymentMethod();
    }
}
