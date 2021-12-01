package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//操作浏览器
public class chrome_Test {
    // 以度娘为例，打开浏览器设置浏览器的位置，然后再设置浏览器的大小。最后将浏览器最大化。查询“北京宏哥”后，刷新页面执行回退到百度首页，然后有执行前进进入到搜索“北京”页面。
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");

//        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe")).usingAnyFreePort().build();
//        service.start();
//        service.stop();

        WebDriver driver=new ChromeDriver();
        driver.get("http:www.baidu.com");
        //设置浏览器的位置
        Point point=new Point(150,150);
        driver.manage().window().setPosition(point);
        Thread.sleep(2000);
        //将浏览器最大化
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement xun=driver.findElement(By.id("kw"));
        xun.sendKeys("北京");
        WebElement xu=driver.findElement(By.id("su"));
        xu.click();
        //刷新页面
        driver.navigate().refresh();
        Thread.sleep(1000);
        //回退到首页
        driver.navigate().back();
        Thread.sleep(2000);
        //前进到搜索结果页
        driver.navigate().forward();


    }
}
