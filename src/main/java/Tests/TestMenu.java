package Tests;

import Pages.PageMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMenu extends TestBase{

    PageMenu PM;
    @BeforeMethod
    public void initElement(){

        PM = PageFactory.initElements(getWebDriver(),PageMenu.class);
    }

    @Test
    public void menuTest(){

        PM.lineMenu();
       //Assert.assertEquals();
    }
}
