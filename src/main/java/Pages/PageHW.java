package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHW extends PageBase {

    @FindBy(xpath = "//a[@class='navbar-link']")
    WebElement guest;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
    WebElement close;

    @FindBy(css = "body.modal-open:nth-child(2) div.container-fluid:nth-child(6)" +
            " div.row:nth-child(1) div.col-md-8:nth-child(2) div.row div.col-md-12 div.modal.fade.in:nth-child(1)" +
            " div.modal-dialog div.modal-content div.modal-body p:nth-child(2) > a:nth-child(1)")
    WebElement helpToProject;

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[2]/a[1]")
    WebElement present;

    @FindBy(xpath = "//a[contains(text(),'PayPal')]")
    WebElement payPal;

    @FindBy(xpath = "//a[contains(text(),'Android')]")
    WebElement android;

    @FindBy(xpath = "//a[contains(text(),'Open Source')]")
    WebElement openSource;

    @FindBy(css = "div.container-fluid:nth-child(5) div.row:nth-child(1) div.col-md-8:nth-child(2) " +
            "div.row div.col-md-12 p:nth-child(7) > a:nth-child(1)")
    WebElement gitHub;

    public PageHW(WebDriver webDriver) {
        super(webDriver);
    }

    public void testOne(){

        waitToBeClickable(guest,120);
        guest.click();

        waitToBeClickable(close,120);
        close.click();


    }


    public void testPay(){
        waitToBeClickable(guest,120);
        guest.click();

        waitToBeClickable(helpToProject,120);
        helpToProject.click();

        waitToBeClickable(payPal,120);
        payPal.click();

    }

    public void testHub(){
        waitToBeClickable(android,120);
        android.click();

        waitToBeClickable(openSource,120);
        openSource.click();

        waitToBeClickable(gitHub,120);
        gitHub.click();
    }
}
