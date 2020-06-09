package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class PageMenu extends PageBase {

    @FindBy(xpath = "//a[contains(text(),'C#')]")
    WebElement CBasic;

    @FindBy(xpath = "//a[contains(text(),'Windows Phone')]")
    WebElement winPhone;

    @FindBy(xpath = "//h1[contains(text(),'Windows Phone')]")
    WebElement winPhGetText;

    @FindBy(xpath = "//a[contains(text(),'PHP')]")
    WebElement php;

    @FindBy(xpath = "//h1[@class='text-warning']")
    WebElement phpGetText;

    @FindBy(xpath = "//a[contains(text(),'Arduino')]")
    WebElement arduino;

    @FindBy(xpath = "//h1[@class='text-info']")
    WebElement getArduinoText;

    public PageMenu(WebDriver webDriver) {
        super(webDriver);
    }

    public ArrayList<String> lineMenu(){

        ArrayList <String> arrayList = new ArrayList<String>();

        waitToBeClickable(CBasic,50);
        CBasic.click();

        String currentUrl = getWebDriver().getCurrentUrl();
        arrayList.add(currentUrl);

        waitToBeClickable(winPhone,50);
        winPhone.click();

        waitToBeVisible(winPhGetText,50);

        System.out.println("getText: " + winPhGetText.getText());
        arrayList.add(winPhGetText.getText());

        waitToBeClickable(php,50);
        php.click();

        waitToBeVisible(phpGetText,50);

        System.out.println("phpText: " + phpGetText.getText());
        arrayList.add(phpGetText.getText());

        waitToBeClickable(arduino,50);
        arduino.click();

        waitToBeVisible(getArduinoText,50);

        System.out.println("ardGetText: " + getArduinoText.getText());
        arrayList.add(getArduinoText.getText());

        return arrayList;

    }

}
