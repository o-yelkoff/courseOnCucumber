package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ThankYouPage {
    public void thanksMessageVisible() {
        $(By.xpath("//span[contains(text(), ' успішно оформлено')]")).shouldBe(Condition.visible);
    }
}
