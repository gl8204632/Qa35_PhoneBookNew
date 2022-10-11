import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        if (app.getHelperUser().isLogged ()){
            app.getHelperUser().logout();

        }
    }
    public void loginSuccessModel() {

        //User user = new User();
        //user.setEmail("Mia@gmail.com");
        //user.setPassword("Mia12345$");

        User user = new User().withEmail("Mia@gmail.com").withPassword("Mia12345$");//with==set


        // open LoginForm
        app.getHelperUser().openLoginRegistrationForm();

        //fill email
        app.getHelperUser().fillLoginRegistrationForm("Mia@gmail.com","Mia12345$");

        //submit login
        app.getHelperUser().submitLogin();
        app.getHelperUser().pause(2000);

        //check is login done
        Assert.assertTrue(app.getHelperUser().isLogged());

    }


    @Test
    public void loginSuccess() {

        // open LoginForm
        app.getHelperUser().openLoginRegistrationForm();

        //fill email
        app.getHelperUser().fillLoginRegistrationForm("Mia@gmail.com","Mia12345$");

        //submit login
        app.getHelperUser().submitLogin();
        app.getHelperUser().pause(2000);

        //check is login done
        Assert.assertTrue(app.getHelperUser().isLogged());

    }





    //@Test
    //public void loginNegativeWrongEmailFormat(){

    //}


    //@Test
    //public void loginNegativeWrongPasswordFormat(){

    //}


}
