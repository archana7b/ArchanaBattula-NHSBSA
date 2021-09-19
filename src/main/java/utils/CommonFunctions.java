package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonFunctions
{
     public String url;
    public static WebDriver driver;


    public void openBrowser(String browserName) {
       // driver.get(readProperty("url"));
        if (browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else
        if (browserName.equals("firefox"))

        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

            driver.get(driver.getCurrentUrl());
            driver.manage().window().maximize();

    }
    public void closeBrowser()
    {
        driver.quit();
    }

    public void waitForTime(int waitTime)
    {
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
    }

    public void waitForElement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void compareUrl(String expected_url)
    {
        System.out.println("expect browser name " + expected_url);
        String actual_url = driver.getCurrentUrl();
        System.out.println("actual broswer name" + actual_url);
        Assert.assertEquals(actual_url,expected_url);
    }

    public void JSClick(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",element);
    }

    public void scrollUntilVisible(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);

    }

   public String readProperty(String key) throws Exception
    {
        FileInputStream inputStream = new FileInputStream(FilePaths.propertiesFilePath);
        Properties properties = new Properties();
        properties.load(inputStream);
        url = properties.getProperty(key);
        System.out.println(" browser from config file " + url);
        return url;
    }

    public void takeScreenshot(String fileName) throws  Exception
    {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(FilePaths.errorShotsPath+"/"+fileName);
        FileUtils.copyFile(srcFile,destFile);
    }


    

}
