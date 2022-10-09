import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        if (app.getHelperUser().isLogged ()){
            app.getHelperUser().logout();

        }
    }

    @Test
    public void loginSuccess() {

        // open LoginForm
        app.getHelperUser().openLoginRegistrationForm();

        //fill email
        app.getHelperUser().fillLoginRegistrationForm("Mia@gmail.com","Mia12345$");

        //submit login
        app.getHelperUser().submitLogin();






    }



    //@Test
    //public void loginNegativeWrongEmailFormat(){

    //}


    //@Test
    //public void loginNegativeWrongPasswordFormat(){

    //}


}
