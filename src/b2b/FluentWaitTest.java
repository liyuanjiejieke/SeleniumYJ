package b2b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FluentWaitTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://wwww.baidu.com");
        Wait wait=new FluentWait<WebDriver>(driver)
                .withTimeout(40, TimeUnit.SECONDS)//最长超时值
                .pollingEvery(5,TimeUnit.SECONDS)//轮询频率
                .ignoring(NoSuchElementException.class);//如果在这个时间内还是没有找到，就抛出这个异常
    }
}
