package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class SearchResultPage {
    public void availabilityOfTheBook(){
        $(By.xpath("//div[@class= 'category__cards']//span[contains(text(), 'В наявності')]")).shouldBe(Condition.visible);
    }
    public SelenideElement bookCard = $(By.xpath("//div[@class= 'category-card category-layout expanded']"));

    public void mouseHoveringOnBookCard(){
        actions().moveToElement(bookCard).perform();
    }
    public void clickAddToCartButton() {
        $(By.xpath("//button[contains(text(), 'До кошика')]")).click();
    }
    public void clickCartButton() {
        $(By.xpath("//span [@class='ui-btn-shopping-cart__icon']")).click();
    }

    public void clickGoToOrdersButton() {
        $(By.xpath("//button[contains(text(), 'Перейти до оформлення замовлення')]")).click();
    }

}
