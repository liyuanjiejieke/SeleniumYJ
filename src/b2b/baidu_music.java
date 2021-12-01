package b2b;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Set;

public class baidu_music {

/*    1.具体测试用例：
   (1）打开百度首页
   （2）鼠标移动到首页的“更多”
   （3）等待出现“查看百度全部产品”
   （4）定位音乐图标并点击
   （5）获取新打开页面的title，进行断言*/
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://wwww.baidu.com");

        Actions actions=new Actions(driver);
        WebElement webElement=driver.findElement(By.xpath("//a[text()='更多']"));
        //将鼠标移动到这个元素上1
        actions.moveToElement(webElement).perform();
        //显示等待10秒  等待全部元素出现
        WebDriverWait we=new WebDriverWait(driver,10);
        we.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='查看全部百度产品 >']")));
        //定位音乐元素
        WebElement music=driver.findElement(By.xpath("//a/div[text()='音乐']"));

        music.click();
        String handl=driver.getWindowHandle();
        for(String he:driver.getWindowHandles()){
            if(!he.equals(handl)){
                driver.close();
                driver.switchTo().window(he);
            }

        }
        Assert.assertEquals("千千音乐-听见世界",driver.getTitle());
        System.out.println("断言通过");


    }
    public static String getLastHandle(WebDriver driver){
        //获取打开窗口的所有句柄
        Set<String> Allhandles =driver.getWindowHandles();
        ArrayList<String> list=new ArrayList<String>(Allhandles);
        return list.get(list.size()-1);
    }
}
