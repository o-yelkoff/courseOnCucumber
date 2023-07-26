package steps;

import config.UserConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import pages.BasicPage;
import pages.SearchResultPage;

public class BasicPageDef {

    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButtonByText(arg0);
    }

    @Then("Input login")
    public void inputLogin() {
        basicPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        basicPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Click login button")
    public void clickLoginButton() {
        basicPage.clickSubmitLogin();
    }

    @Then("Account logo is displayed")
    public void accountLogoIsDisplayed() {
        basicPage.accountLogoVisible();
    }

    @Then("Insert book name in the search field")
    public void insertBookNameInTheSearchField() {
        basicPage.bookInputInSearch(UserConfig.selectedBook);
    }

    @Then("Find selected book")
    public void findSelectedBook() {
        basicPage.clickFindButton();
    }

    @Given("User is logged in")
    public void userIsLoggedIn() {
        basicPage.clickButtonByText(" Увійти ");
        basicPage.inputLogin(UserConfig.USER_LOGIN);
        basicPage.inputPassword(UserConfig.USER_PASSWORD);
        basicPage.clickSubmitLogin();
        basicPage.accountLogoVisible();
        Assertions.assertThat(basicPage.accountLogoVisible()).isTrue();
    }

    @When("User add book in cart")
    public void userAddBookInCart() {
        basicPage.bookInputInSearch(UserConfig.selectedBook);
        SearchResultPage searchResultPage = basicPage.clickFindButton();
        searchResultPage.mouseHoveringOnBookCard();
        searchResultPage.availabilityOfTheBook();
        searchResultPage.clickAddToCartButton();
        searchResultPage.clickCartButton();

    }
}
