// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class test2 {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void untitled() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().setSize(new Dimension(1054, 848));
        driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("locked_out_user");
        driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();

        driver.findElements(By.cssSelector(".error-message-container"));
        driver.findElement(By.cssSelector("*[data-test=\"error\"]")).getText();
        assertEquals("Epic sadface: Sorry, this user has been locked out.",
                driver.findElement(By.cssSelector("*[data-test=\"error\"]")).getText());
    }
}
