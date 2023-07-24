package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BasicPage {
    public void clickButtonByText(String text){
        $(By.xpath("//span[text()='" + text + "']")).click();
    }
    public void clickSubmitLogin(){
        $(By.xpath("//div[@class='authorization-main']//button[@class= 'ui-btn-primary']")).click();
    }
    public void accountLogoVisible(){
        $(By.xpath("//div[@class= 'ui-btn-profile btn-profile']")).shouldBe(Condition.visible);
    }

    public SelenideElement loginInput = $(By.xpath("//input[@name = 'auth_login']"));
    public SelenideElement passwordInput = $(By.xpath("//input[@name = 'auth_password']"));

    public void inputLogin (String text){
        this.loginInput.val(text);
    }
    public void inputPassword (String text){
        this.passwordInput.val(text);
    }
}
