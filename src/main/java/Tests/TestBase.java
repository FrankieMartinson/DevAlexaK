package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {

    private WebDriver webDriver = new ChromeDriver();


    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @BeforeTest
    public void beforeTest(){

        webDriver.get("http://developer.alexanderklimov.ru");
    }
}
