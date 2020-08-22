package StepDefinitions;

import POM.LoginPOM;
import Utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    LoginPOM login=new LoginPOM();
    @Before
    public void before(){
        login.driver.get("http://zero.webappsecurity.com/login.html");
        login.findElementAndSendKeys("username","username");
        login.findElementAndSendKeys("password","password");
        login.findElementAndClick("signInButton");
    }


    @After
    public void after(){
        Driver.QuitDriver();
    }
}
