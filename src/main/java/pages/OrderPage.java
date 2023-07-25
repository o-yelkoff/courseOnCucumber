package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

public class OrderPage {
    public void headerNameVisible() {
        $(By.xpath("//h2[contains(text(), 'Оформлення замовлення')]")).shouldBe(Condition.visible);
    }

    public void markCallBackOption() {
        $(By.xpath("//div[@class='personal-details__form']//span[contains(text(), 'Передзвоніть мені')]")).click();
    }

    public SelenideElement commentInput = $(By.xpath("//textarea[@class='ui-base-textarea']"));

    public void commentAdding(String text) {
        this.commentInput.val(text);
    }
    public void confirmButtonClick() {
//        $(By.xpath("//section[@class='order-submit sidebar']//button[contains(text(), 'Підтвердити замовлення')]")).click();
        $(By.xpath("//section[@class='order-submit sidebar']//button[@class='ui-btn-secondary']")).click();
        System.out.println();
    }

    public void selectCityInDropdown() {

        $(By.xpath("(//div[@class='ui-base-field__input']/input[@name='base-select-search'])[2]")).click();

        $(By.xpath("//div[@class='body is-open']/div/div[2]")).click();
    }
    public void selectPostPoint(){
        $(By.xpath("//div[@class='delivery-method selected']//input[@class= 'ui-base-input']")).click();
        $(By.xpath("//div[@class= 'body is-open']/div/div[2]")).click();
    }
    public void selectPaymentMethod(){
        JavascriptExecutor js = (JavascriptExecutor) webdriver().object();
        js.executeScript("arguments[0].scrollIntoView();",$(By.xpath("//input[@id='cashondelivery']")));
        js.executeScript("arguments[0].click();", $(By.xpath("//input[@id='cashondelivery']")));
        //$(By.xpath("//input[@id='cashondelivery']")).click();
        System.out.println();
    }

}

