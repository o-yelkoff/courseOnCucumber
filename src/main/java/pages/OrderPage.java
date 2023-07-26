package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

public class OrderPage {
    public boolean headerNameVisible() {
        $(By.xpath("//h2[contains(text(), 'Оформлення замовлення')]")).shouldBe(Condition.visible);
        return  $(By.xpath("//h2[contains(text(), 'Оформлення замовлення')]")).is(Condition.visible);
    }

    public void markCallBackOption() {
        $(By.xpath("//div[@class='personal-details__form']//span[contains(text(), 'Передзвоніть мені')]")).click();
    }

    public SelenideElement commentInput = $(By.xpath("//textarea[@class='ui-base-textarea']"));

    public void commentAdding(String text) {
        this.commentInput.val(text);
    }
    public void confirmButtonClick() {
        $(By.xpath("//section[@class='order-submit sidebar']//button[@class='ui-btn-secondary']")).click();
        Utilities.sleep(3000);
    }

    public void selectCityInDropdown() {

        $(By.xpath("(//div[@class='ui-base-field__input']/input[@name='base-select-search'])[2]")).click();
        Utilities.sleep(1000);
        $(By.xpath("//div[@class='body is-open']/div/div[2]")).click();
    }
    public void selectPostPoint(){
        $(By.xpath("//div[@class='delivery-method selected']//input[@class= 'ui-base-input']")).click();
        $(By.xpath("//div[@class= 'body is-open']/div/div[2]")).click();
    }
    public void selectPaymentMethod(){
        WebElement mthd = $(By.xpath("//input[@id='cashondelivery']/../.."));
        JavascriptExecutor js = (JavascriptExecutor) webdriver().object();
        js.executeScript("arguments[0].scrollIntoView();", mthd);
        Actions action = new Actions(webdriver().object());
       Utilities.sleep(3000);
        action.moveToElement(mthd)
                .click()
                .sendKeys(mthd, Keys.SPACE)
                .sendKeys(mthd, Keys.ENTER)
                .perform();
        System.out.println();
    }

}

