package manager;

import models.User;
import org.openqa.selenium.Alert;
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

//
//        WebElement InputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
//        InputEmail.cli
        type(By.xpath( "//input[@placeholder='Email']"),email);
//        clean element before  typing email
//        InputEmail.clear();
//        InputEmail.sendKeys(email); already moved to UserBase in method fillLoginRegistrationForm

        type(By.xpath("//input[@placeholder='Password']"),password);

        //WebElement InputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        //InputPassword.click();
        //InputPassword.clear();
        //InputPassword.sendKeys(password);already moved to UserBase in method fillLoginRegistrationForm
    }

    public void fillLoginRegistrationForm(User user){

        type(By.xpath("//input[@placeholder='Email']"), user.getEmail());;

        type(By.xpath("//input[@placeholder='Password']"), user.getPassword());


    }


    public void submitLogin(){
        WebElement LoginButton = wd.findElement(By.xpath("//button[text()=' Login']"));
        LoginButton.click();
    }


    public boolean isAllertPresent() {
       Alert alert= wd.switchTo().alert();
       if (alert == null){
    return false;
        }
        else { return true;}
    }

    public boolean isErrorWrongFormat() {
        Alert alert= wd.switchTo().alert();
        String errorText = alert.getText();
        System.out.println(errorText);

        // close allert
        alert.accept();//click OK on allert
        //alert.dismiss(); //click on button cancel
        //alert.sendKeys(); type something on allert window
        return errorText.contains("Wrong email or password format");


    }
}
