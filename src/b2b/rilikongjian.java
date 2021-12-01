package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rilikongjian {
    public static void main(String[] args) throws Exception{
//        checkbox2();
        dianji();
    }
    //xinjian
    public static void checkbox2() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");

        Thread.sleep(5000);

        driver.findElement(By.id("datepicker")).sendKeys("11/11/2021");

        Thread.sleep(5000);

        driver.quit();

}







    public static void dianji() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
        Thread.sleep(2000);

        driver.findElement(By.id("datepicker")).click();


        Thread.sleep(8000);
        WebElement webElement=driver.findElement(By.xpath("//*[@id='ui-datepicker-next']/div/a[@data-handler='next']"));
        webElement.click();
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[5]/a")).click();

        Thread.sleep(5000);
        driver.quit();




    }

}