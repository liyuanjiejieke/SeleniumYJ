package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class isDisplayTest {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //定位登录按钮，并且点击
        driver.findElement(By.xpath("//*[@id=\"s-top-loginbtn\"]")).click();
        //定位短信登录，并点击
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__changeSmsCodeItem\"]")).click();
        //定位手机号输入框，并输入
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__smsPhone\"]")).sendKeys("18410173675");
        //定位登录按钮，并点击
        driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__smsSubmit\"]")).click();
        Thread.sleep(2000);
        WebElement wenzi=driver.findElement(By.xpath("//*[@id=\"TANGRAM__PSP_11__smsError\" and text()='请填写验证码']"));
        if (wenzi.isDisplayed()){
            System.out.println("提示文字存在");

        }else {
            System.out.println("提示文字不存在");
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
