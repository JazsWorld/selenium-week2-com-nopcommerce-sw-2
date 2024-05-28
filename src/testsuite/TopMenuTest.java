package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 4. Write down the following test into ‘TopMenuTest’ class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * 3. userShouldNavigateToApparelPageSuccessfully
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’
 * 4.userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */
public class TopMenuTest extends BaseTest {
    //BaseUrl
    String baseUrl = "https://demo.nopcommerce.com/";

    //calling openBrowser method from parentclass BaseTest
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    //1. userShouldNavigateToComputerPageSuccessfully
    // * * click on the ‘Computers’ Tab
    // * * Verify the text ‘Computers’
    @Test
    public void usershouldNavigateToComputerPageSuccessfully(){
        // * * click on the ‘Computers’ Tab
        driver.findElement(By.linkText("Computers")).click();

        // * * Verify the text ‘Computers’
        String expectedtext = "Computers";
        String actualtext =  driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text() = 'Computers ']")).getText();
        Assert.assertEquals("User is not navigated to computer page", expectedtext, actualtext);
    }

    // 2. userShouldNavigateToElectronicsPageSuccessfully
    // * * click on the ‘Electronics’ Tab
    // * * Verify the text ‘Electronics’

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // * * click on the ‘Electronics’ Tab
        driver.findElement(By.linkText("Electronics")).click();

        // * * Verify the text ‘Electronics’
        String expectedtext = "Electronics";
        String actualtext = driver.findElement(By.xpath("//h1[text() = 'Electronics']")).getText();
        Assert.assertEquals("User is not navigated to Electronics page", expectedtext, actualtext);
    }

    //3. userShouldNavigateToApparelPageSuccessfully
    // * * click on the ‘Apparel’ Tab
    // * * Verify the text ‘Apparel’
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        // * * click on the ‘Apparel’ Tab
        driver.findElement(By.linkText("Apparel")).click();

        // * * Verify the text ‘Apparel’
        String expectedtext = "Apparel";
        String actualtext = driver.findElement(By.xpath("//h1[text() = 'Apparel']")).getText();
        Assert.assertEquals("User is unable to navigate to Apparel page", expectedtext, actualtext);
    }

    //4.userShouldNavigateToDigitalDownloadsPageSuccessfully
    // * * click on the ‘Digital downloads’ Tab
    // * * Verify the text ‘Digital downloads’
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        // * * click on the ‘Digital downloads’ Tab
        driver.findElement(By.linkText("Digital downloads")).click();

        // * * Verify the text ‘Digital downloads’
        String expectedtext = "Digital downloads";
        String actualtext = driver.findElement(By.xpath("//h1[text() = 'Digital downloads']")).getText();
        Assert.assertEquals("User is unable to navigate to Digital downloads page", expectedtext, actualtext);
    }

    //5. userShouldNavigateToBooksPageSuccessfully
    // * * click on the ‘Books’ Tab
    // * * Verify the text ‘Books’
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        // * * click on the ‘Books’ Tab
        driver.findElement(By.linkText("Books")).click();

        // * * Verify the text ‘Books’
        String expectedtext = "Books";
        String actualtext = driver.findElement(By.xpath("//h1[text() = 'Books']")).getText();
        Assert.assertEquals("User is unable to navigate to Books page", expectedtext, actualtext);
    }

    //6. userShouldNavigateToJewelryPageSuccessfully
    // * * click on the ‘Jewelry’ Tab
    // * * Verify the text ‘Jewelry’

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        // * * click on the ‘Jewelry’ Tab
        driver.findElement(By.linkText("Jewelry")).click();

        // * * Verify the text ‘Jewelry’
        String expectedtext = "Jewelry";
        String actualtext = driver.findElement(By.xpath("//h1[text() = 'Jewelry']")).getText();
        Assert.assertEquals("User is unable to navigate to Jewelry page", expectedtext, actualtext);
    }

    //7. userShouldNavigateToGiftCardsPageSuccessfully
    // * * click on the ‘Gift Cards’ Tab
    // * * Verify the text ‘Gift Cards’

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // * * click on the ‘GiftCards’ Tab
        driver.findElement(By.linkText("Gift Cards")).click();

        // * * Verify the text ‘Gift Cards’
        String expectedtext = "Gift Cards";
        String actualtext = driver.findElement(By.xpath("//h1[text() = 'Gift Cards']")).getText();
        Assert.assertEquals("User is unable to navigate to Gift Cardspage", expectedtext, actualtext);
    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
