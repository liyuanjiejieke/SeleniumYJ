package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class isEnabledTest {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.baidu.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchInputBox = driver.findElement(By.id("kw"));
        if (searchInputBox.isEnabled()==true){
            System.out.println("可以输入内容");
        }
        Thread.sleep(2000);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        String str="document.getElementById('kw').setAttribute('disabled', '')";
        js.executeScript(str);
        Thread.sleep(5000);

        if(!searchInputBox.isEnabled()){
            System.out.println("输入框不可输入");

        }

    }
}
