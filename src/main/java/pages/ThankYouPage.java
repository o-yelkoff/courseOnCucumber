package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;

public class ThankYouPage {
    public boolean thanksMessageVisible() {
        $(By.xpath("//span[contains(text(), ' успішно оформлено')]")).shouldBe(Condition.visible, Duration.ofSeconds(15));
        return $(By.xpath("//span[contains(text(), ' успішно оформлено')]")).is(Condition.visible);
    }
}
