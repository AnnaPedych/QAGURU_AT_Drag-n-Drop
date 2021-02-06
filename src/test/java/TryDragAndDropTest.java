import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TryDragAndDropTest {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
    @Test
    void PositiveDragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement element1 = $("#column-a");
        SelenideElement element2 = $("#column-b");

        //actions().dragAndDrop(element1, element2).build().perform();

        //actions().clickAndHold(element).build().perform();
        //actions().moveToElement($("#column-b")).release($("#column-b")).build().perform();

        //$("#column-a").dragAndDropTo("#column-b");

        //actions().moveToElement(element1).clickAndHold().moveByOffset(300,200).release().perform();

        //actions().clickAndHold(element1).moveByOffset(300,200).release().perform();

        $(element1).shouldHave(text("B"));
        $(element2).shouldHave(text("A"));
    }
}
