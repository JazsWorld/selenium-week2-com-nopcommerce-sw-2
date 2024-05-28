package testsuite;
/**
 * 5. Write down the following test into ‘RegisterTest’ class
 * 1. userShouldNavigateToRegisterPageSuccessfully
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * 2. userSholdRegisterAccountSuccessfully * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration completed’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    //BaseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    //calling openBrowser method from parentclass BaseTest
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    //1. userShouldNavigateToRegisterPageSuccessfully
    // * * click on the ‘Register’ link
    // * * Verify the text ‘Register’

    @Test
    public void usershouldNavigateToRegisterPageSuccessfully(){
        // * * click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();

        // * * Verify the text ‘Register’
        String expectedtext = "Register";
        String actualtext =  driver.findElement(By.xpath("//a[text() = 'Register']")).getText();
        Assert.assertEquals("User is not navigated to Register page", expectedtext, actualtext);
    }

    //2. userSholdRegisterAccountSuccessfully
    // * click on the ‘Register’ link
    // * * Select gender radio button
    // * * Enter First name
    // * * Enter Last name
    // * * Select Day Month and Year
    // * * Enter Email address
    // * * Enter Password
    // * * Enter Confirm password
    // * * Click on REGISTER button
    // * * Verify the text 'Your registration completed’

    @Test
    public void usershouldRegisterAccountSuccessfully(){
        //String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        //String emailID = "User" + userName + "@example.com";

         // * click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();

        // * * Select gender radio button
        driver.findElement(By.xpath("//input[@id = 'gender-male']")).click();

        // * * Enter First name
        driver.findElement(By.xpath("//input[@name = 'FirstName']")).sendKeys("Jagruti");

        // * * Enter Last name
        driver.findElement(By.xpath("//input[@name = 'LastName']")).sendKeys("Jadeja");

        // * * Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).findElement(By.xpath("//option[text()='22']")).click();
        driver.findElement(By.name("DateOfBirthMonth")).findElement(By.xpath("//option[text()='September']")).click();
        driver.findElement(By.name("DateOfBirthYear")).findElement(By.xpath("//option[text()='1988']")).click();

        // * * Enter Email address
        driver.findElement(By.xpath("//input[@id = 'Email']")).sendKeys("abc1234@gmail.com");

        // * * Enter Password
        driver.findElement(By.xpath("//input[@id = 'Password']")).sendKeys("abc@1234");

        // * * Enter Confirm password
        driver.findElement(By.xpath("//input[@name = 'ConfirmPassword']")).sendKeys("abc@1234");

        // * * Click on REGISTER button
        driver.findElement(By.id("register-button")).click();


        // * * Verify the text 'Your registration completed’
        String expectedtext = "Your registration completed";
        String actualtext = driver.findElement(By.xpath("//div[text() = 'Your registration completed']")).getText();
        Assert.assertEquals("User is not registered successfully", expectedtext, actualtext);
    }
    @After
    public void tearDown(){
      //  closeBrowser();
    }


}
