package b2b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alertTest {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");

//　  accept()方法就是点击确定按钮。1
//
//　　dismiss()就是点击alert框上面的取消按钮。
//
//　　getText()就是获取alert内部的文字，例如上面打印效果。
//
//　　sendKeys方法就像文章开头提到的输入邮件预定内容一样。
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://news.cyol.com/node_60799.htm");
        Thread.sleep(2000);
        //处理alert框
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.quit();

    }
}
