package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HelperUser extends  HelperBase{


    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public boolean isLogged(){

        List<WebElement> list =wd.findElements(By.xpath("//button[text()='Sign Out']"));
        ////button[text()='Sign Out']
        return list.size()>0;

    }

    public void logout(){
        wd.findElement(By.xpath("//button[text()='Sign Out']")).click();
    }

    public void openLoginRegistrationForm(){
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();

    }

    public void fillLoginRegistrationForm(String email, String password){
        WebElement InputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        InputEmail.click();
        //clean element before  typing email
        InputEmail.clear();
        InputEmail.sendKeys(email);


        WebElement InputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        InputPassword.click();
        InputPassword.clear();
        InputPassword.sendKeys(password);
    }

    public void submitLogin(){
        WebElement LoginButton = wd.findElement(By.xpath("//button[text()=' Login']"));
        LoginButton.click();
    }


}
