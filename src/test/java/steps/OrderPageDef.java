package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
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
        orderPage.commentAdding(UserConfig.ORDER_COMMENT);
    }


    @Then("Select city in dropdown")
    public void selectCityInDropdown() {
        orderPage.selectCityInDropdown();
    }

    @Then("Select post point")
    public void selectPostPoint() {
        orderPage.selectPostPoint();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Then("Select payment method")
    public void selectPaymentMethod() {
        orderPage.selectPaymentMethod();
    }
    @Then("Click confirmTheOrder button")
    public void clickConfirmTheOrderButton() {
        orderPage.confirmButtonClick();
    }
}
