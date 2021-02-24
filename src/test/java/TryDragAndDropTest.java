import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        $("#column-a").dragAndDropTo("#column-b");
        $(element1).shouldHave(text("B"));
        $(element2).shouldHave(text("A"));
    }
}
