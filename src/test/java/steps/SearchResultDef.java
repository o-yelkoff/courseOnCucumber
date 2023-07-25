package steps;

import io.cucumber.java.en.Then;
import pages.SearchResultPage;

public class SearchResultDef {
    SearchResultPage searchResultPage = new SearchResultPage();

    @Then("Check book availability")
    public void checkBookAvailability() {
        searchResultPage.availabilityOfTheBook();
    }
    @Then("Hover the mouse over the book card")
    public void hoverTheMouseOverTheBookCard() {
        searchResultPage.mouseHoveringOnBookCard();
    }
    @Then("Click addToCart button")
    public void clickAddToCartButton() {
        searchResultPage.clickAddToCartButton();
    }

    @Then("Click cart icon")
    public void clickCartIcon() {
        searchResultPage.clickCartButton();
    }

    @Then("Click goToOrders button")
    public void clickGoToOrdersButton() {
        searchResultPage.clickGoToOrdersButton();
    }
}
