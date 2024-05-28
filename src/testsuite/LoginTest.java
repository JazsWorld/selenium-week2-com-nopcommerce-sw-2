package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
 * * Verify the text ‘Welcome, Please Sign In!’
 * 2. userShouldLoginSuccessfullyWithValidCredentials
 * * click on the ‘Login’ link
 * * Enter valid username
 * * Enter valid password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Log out’ text is display
 * 3. verifyTheErrorMessage
 * * click on the ‘Login’ link
 * * Enter invalid username
 * * Enter invalid password
 * * Click on Login button
 * * Verify the error message ‘Login was unsuccessful.
 * Please correct the errors and try again. No customer account found’
 */
public class LoginTest extends BaseTest {
    //BaseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    //calling openBrowser method from parentclass BaseTest
    @Before
    public void setUp(){

        openBrowser(baseUrl);
    }

    //1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Login’ link
    // Verify the text ‘Welcome, Please Sign In!’
    @Test
  public void userShouldNavigateToLoginPageSuccessfully(){
        //click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();

        //Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("Not redirected to Login Page: ", expectedText, actualText);

    }

    //2. userShouldLoginSuccessfullyWithValidCredentials
    // * * click on the ‘Login’ link
    // * * Enter valid username
    // * * Enter valid password
    // * * Click on ‘LOGIN’ button
    // * * Verify the ‘Log out’ text is display
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        // * * click on the ‘Login’ link
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        // * * Enter valid username
        driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("abc@gmail.com");

        // * * Enter valid password
        driver.findElement(By.xpath("//input[@name = 'Password']")).sendKeys("abc@123");

        // * * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type = 'submit' and @class = 'button-1 login-button']")).click();

        // * * Verify the ‘Log out’ text is display
        driver.findElement(By.xpath("//a[text()='Log out']")).click();
        System.out.println("Logout Successfull");
    }

    //3. verifyTheErrorMessage
    //* click on the ‘Login’ link
    //* Enter invalid username
    //* Enter invalid password
    //* Click on Login button
    //* Verify the error message ‘Login was unsuccessful.
    //Please correct the errors and try again. No customer account found’

    @Test
    public void verifyTheErrorMessage(){
        // * * click on the ‘Login’ link
        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        // * * Enter valid username
        driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("abc1@gmail.com");

        // * * Enter valid password
        driver.findElement(By.xpath("//input[@name = 'Password']")).sendKeys("abc@1234");

        // * * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type = 'submit' and @class = 'button-1 login-button']")).click();

        ////* Verify the error message ‘Login was unsuccessful.
        String expectedmessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualmessage = driver.findElement(By.xpath("(//div[@class = 'message-error validation-summary-errors'])")).getText();
        Assert.assertEquals("Error message not displayed", expectedmessage, actualmessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }


}
