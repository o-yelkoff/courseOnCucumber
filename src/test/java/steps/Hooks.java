package steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;

public class Hooks {

    @Before
    public void openSite() {
        open("https://www.yakaboo.ua/");
        webdriver().driver().getWebDriver().manage().window().maximize();
    }
}

