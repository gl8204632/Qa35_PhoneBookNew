import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginSuccess() {

        // open LoginForm
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();
        pause(3000);

        //fill email
        WebElement InputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        InputEmail.click();
        //clean element before  typing email
        InputEmail.clear();
        InputEmail.sendKeys("Mia@gmail.com");
        pause(3000);

        WebElement InputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        InputPassword.click();
        InputPassword.clear();
        InputPassword.sendKeys("Mia12345$");
        pause(3000);

        //submit login
        WebElement LoginButton = wd.findElement(By.xpath("//button[text()=' Login']"));
        LoginButton.click();
        pause(3000);



    }

    @Test
    public void loginNegativeWrongEmailFormat(){

    }


    @Test
    public void loginNegativeWrongPasswordFormat(){

    }


}
