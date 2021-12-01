package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframe_Test  {
    public static void main(String[] args) throws Exception{
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors");
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.21xrx.com/");




    }

    public static void iframeTest() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.qq.com/");
        Thread.sleep(2000);
        driver.switchTo().frame("login_frame");
        WebElement input01=driver.findElement(By.id("u"));
        input01.sendKeys("123456");
        Thread.sleep(2000);
        driver.quit();
    }


}
