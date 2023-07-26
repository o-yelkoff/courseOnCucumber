package steps;

import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import pages.ThankYouPage;

public class ThkYouDef {
    ThankYouPage thankYouPage = new ThankYouPage();

    @Then("Successful notification is displayed")
    public void successfulNotificationIsDisplayed() {
        Assertions.assertThat(thankYouPage.thanksMessageVisible()).isTrue();
    }
}
