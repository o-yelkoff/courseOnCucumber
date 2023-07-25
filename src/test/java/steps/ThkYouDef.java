package steps;

import io.cucumber.java.en.Then;
import pages.ThankYouPage;

public class ThkYouDef {
    ThankYouPage thankYouPage = new ThankYouPage();

    @Then("Check that order is successful")
    public void checkThatOrderIsSuccessful() {
        thankYouPage.thanksMessageVisible();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
