import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

public class TestBase {

    static ApplicationManager app = new ApplicationManager();

    @BeforeSuite
    public void setUp(){
        app.init();

    }

    @AfterSuite
    public void tearDown(){
        app.stop();

    }



    }


