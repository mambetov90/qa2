import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delfi {
    @Test
    public void DelfiTitleTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Дом\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");
    }
}
