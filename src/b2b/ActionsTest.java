package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsTest {
    public static void main(String[] args) throws Exception{



//        ActionB();

//        huadong();
        xiechengdingdan();
//        Abuquan();
//        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("http://wwww.baidu.com");
//        //浏览器最大化
//        driver.manage().window().maximize();
//        Actions actions=new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath("//div/a[text()='更多']"))).perform();
//        //显示等待10秒
//        WebDriverWait w=new WebDriverWait(driver,10);
//        w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By
//                .xpath("//a[text()='查看全部百度产品 >']")));
//        //等待元素出现后 点击音乐
//        WebElement nusic=driver.findElement(By.xpath("//a/div[text()='音乐']"));
//        nusic.click();
//
//        Thread.sleep(2000);
//        driver.quit();
    }

    //输入不全
    public static void Abuquan(){
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://wwww.baidu.com");
        //浏览器最大化
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Actions actions=new Actions(driver);

        WebElement inputbox = driver.findElement(By.id("kw"));
        inputbox.sendKeys("selenium a");

        // 自动补全其中一个选择项1
        WebElement auto_text = driver.findElement(By.xpath("//*[@id='form']/div/ul/li[@data-key='selenium安装']"));
        actions.moveToElement(auto_text).click().perform();

    }
    public static void  ActionB() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        WebElement A=driver.findElement(By.id("draggable"));
        WebElement B=driver.findElement(By.id("droppable"));
        actions.dragAndDrop(A,B).build().perform();
        Thread.sleep(2000);
        //断言 判断这个元素是否存在页面上
        if(driver.findElement(By.xpath("//*[@id='droppable']/p[text()='Dropped!']")).isDisplayed()){

            System.out.println("断言通过");
        }
        System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p[text()='Dropped!']")).isDisplayed());

    }
    public static void huadong(){
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.baidu.com/duty/");
        driver.manage().window().maximize();
        //定位第一段文字
        WebElement one=driver.findElement(By.xpath("//*/p"));
        //定位第二段文字
        WebElement two=driver.findElement(By.xpath("//*/ul[@class='privacy-ul-gap']/li[1]"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(one).moveToElement(two).perform();
        actions.release();
    }


    public static void xiechengdingdan() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://passport.ctrip.com/user/member/fastOrder");
        Thread.sleep(3000);
        //定位携程手机查单手机号输入位置
//        WebElement one=driver.findElement(By.id("txt_phone"));
        //定位滑块位置
        WebElement huakuai=driver.findElement(By.xpath("//*[@class='cpt-drop-btn']"));
        //定位整个滑块
        WebElement zhengti=driver.findElement(By.xpath("//*[@class='cpt-bg-bar']"));
        System.out.println(zhengti.getSize());

        Actions actions=new Actions(driver);
        actions.dragAndDropBy(huakuai,268,0).perform();
        actions.release();
//        Thread.sleep(2000);
//        driver.quit();
    }
    public static void jichu(){
        WebDriver driver=new ChromeDriver();
        Actions actions=new Actions(driver);
        //右击事件
        actions.contextClick();
        //鼠标悬停
        actions.clickAndHold();
        //鼠标移动
//        actions.moveToElement();
        //双击左键
        actions.doubleClick();
        //拖动
//        actions.dragAndDrop();

        //释放鼠标
        actions.release();
        //执行actions的行为
        actions.perform();
    }


}
