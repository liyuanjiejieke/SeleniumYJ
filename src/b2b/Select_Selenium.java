package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Select_Selenium {
    public static void main(String[] args) throws Exception {
        Test12306();
    }

    public static void Selectxuan() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:\\Users\\user\\Desktop\\select.html");
        Select select=new Select(driver.findElement(By.id("select_id")));
        //获取所有选项
        List<WebElement> lis=select.getOptions();
        for(WebElement webElement:lis){
            System.out.println(webElement.getText());
        }
        //根据索引选择
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.deselectByIndex(0);
        //根据value值选择
//        select.selectByValue("4");
//        Thread.sleep(2000);
//
//        //根据文本值选择1111111
//        select.selectByVisibleText("山东");
//        Thread.sleep(2000);

        //判断是不是多选的选择框 boolean值
        System.out.println(select.isMultiple());
        //取消所有选中
//        select.deselectAll();
        Thread.sleep(2000);
        driver.quit();

    }


    public static void Test12306() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.12306.cn/index/");
        WebElement webElement=driver.findElement(By.id("fromStationText"));
        webElement.click();
        Thread.sleep(2000);
        WebElement webElement1=driver.findElement(By.xpath("//div/ul[@id='ul_list1']/li[text()='上海']"));
        webElement1.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
