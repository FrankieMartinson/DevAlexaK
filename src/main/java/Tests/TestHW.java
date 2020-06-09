package Tests;

import Pages.PageHW;
import Pages.PageMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHW extends TestBase {

    PageHW PHW;
    @BeforeMethod
    public void initElement(){

        PHW = PageFactory.initElements(getWebDriver(),PageHW.class);
    }

    @Test(priority = 1)
    public void menuTestOne(){
        PHW.testOne();
    }

    @Test(priority = 2)
    public void menuTestThree(){
        PHW.testPay();
    }

    @Test(priority = 3)
    public void testAndroid(){
        PHW.testHub();
    }

    @AfterMethod
    public void methodClose(){

    }
}
