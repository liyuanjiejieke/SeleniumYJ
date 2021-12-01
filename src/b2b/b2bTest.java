package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class b2bTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");

//        初始化一个chrome浏览器实例，实例名称叫driver

        WebDriver driver = new ChromeDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
//        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // get()打开一个站点
//        driver.get("https://www.jd.com/");
        driver.get("https://www.baidu.com");
        Thread.sleep(2000);
        String dangqianbaidu=driver.getWindowHandle();

        Thread.sleep(1000);
        WebElement phone=driver.findElement(By.linkText("新闻"));
        phone.click();
        Thread.sleep(1000);



//        Set<String> se=driver.getWindowHandles();
//        for (String he:driver.getWindowHandles()){
//            if(!he.equals(dangqianbaidu)){
//                driver.switchTo().window(he);
//        }
        driver.switchTo().window(getLastHandle(driver));

//        }
        WebElement xinwenyemian=driver.findElement(By.id("ww"));
        xinwenyemian.sendKeys("阿富汗");
        Thread.sleep(2000);

        driver.switchTo().window(dangqianbaidu);
        Thread.sleep(2000);

        WebElement ditu=driver.findElement(By.linkText("地图"));
        ditu.click();
        Thread.sleep(1000);

        String ditustr=driver.getWindowHandle();



//        for(String heh:driver.getWindowHandles() ){
//            if(!heh.equals(ditustr)){
//                driver.switchTo().window(heh);
//            }
//
//        }
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.switchTo().window(getLastHandle(driver));
        WebElement sole=driver.findElement(By.id("sole-input"));
        sole.sendKeys("北京");


        //页面加载超时时间
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        //元素查找的超时时间
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //js脚本运行的超时时间
        driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);

//        Actions actions=new Actions();



//        System.out.println("切换后的title："+driver.getTitle());
//        WebElement xiaomi_link = driver.findElement(By.linkText("小米"));
//        xiaomi_link.click();
//        Thread.sleep(1000);
//        driver.close();

//
//        WebElement News = driver.findElement(By.xpath("//div/a[text()='新闻']"));
//        WebElement News2 = driver.findElement(By.xpath("//div/a[text()='地图']"));
//        News.click();
//        News2.click();
//        Thread.sleep(2000);
//        System.out.println(driver.getWindowHandles());

//        WebElement webElementip=driver.findElement(By.xpath("//*[@id=\"kw\"]"));
//        webElementip.sendKeys("陕西");
//        WebElement button=driver.findElement(By.xpath("//*[@id=\"su\"]"));
//        button.click();

//        WebElement lastiput=driver.findElement(By.xpath("//a[contains(text(),'新闻')]"));
//        WebElement button=driver.findElement(By.xpath("//form/span[2]/input"));
//        lastiput.sendKeys("陕西");
//        lastiput.click();
//        button.click();
//        WebElement we=driver.findElement(By.xpath("//input[starts-with(@name,'wd')]"));
//        we.sendKeys("陕西");
//        WebElement button=driver.findElement(By.xpath("//input[starts-with(@id,'su')]"));
//        button.click();
//        WebElement b1=driver.findElement(By.cssSelector("input[id='kw']"));
//        WebElement butt=driver.findElement(By.cssSelector("*[id='su']"));

//        WebElement b1=driver.findElement(By.cssSelector("input.s_ipt"));
//        WebElement butt=driver.findElement(By.cssSelector("input.s_btn"));

//        WebElement b1=driver.findElement(By.cssSelector("input[name=wd]"));
//        WebElement butt=driver.findElement(By.cssSelector("input#su"));
//
//        b1.sendKeys("西安");
//        butt.click();







//        assert driver.getCurrentUrl()=="http://news.baidu.com/";
//        System.out.println("断言通过");
//        driver.close();

//        String titlebaidu="百度一下，你就知道";
//        assert titlebaidu==driver.getTitle();
//        System.out.println("Test Pass");

/*     元素定位8种方法
        （1）id
        （2）name
        （3）class name
        （4）tag name
        （5）link text
        （6）partial link text
        （7）xpath
        （8）css selector*/


//        WebElement id=driver.findElement(By.id("kw"));
//        WebElement name=driver.findElement(By.name("wd"));
//        WebElement class_name=driver.findElement(By.className("s_ipt"));
//
//        id.sendKeys("北京");
//        driver.findElement(By.id("su")).click();
//        //设置等待时间
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        //定位到文本，将文本高亮显示1
//        //创建一个JavascriptExecutor对象
//        JavascriptExecutor js =(JavascriptExecutor)driver;
//
//        js.executeScript ( "arguments[0].setAttribute('style', arguments[1]);",id,"background: orange; border: 2px solid red;");
//        Thread.sleep( 2000 );
//
//        driver.quit();

      /*  driver.get("https://www.cnblogs.com");

        Thread.sleep (5000);
        System.out.println(driver.getTitle());
        System.out.println("2222222222222");
//        WebElement ww = driver.findElement(By.tagName("title"));
        List<WebElement> links= driver.findElements(By.tagName( "article" ));
        int i=links.size();
        for (int j=0;j<i;j++){
            System.out.println(links.get(j).getText());
        }

//        System.out.println(ww.getText());
        System.out.println("等待打印");
        driver.close();*/
//        driver.quit();
    }
    public static String getLastHandle(WebDriver driver){
        //获取打开窗口的所有句柄
        Set<String> Allhandles =driver.getWindowHandles();
        ArrayList<String> list=new ArrayList<String>(Allhandles);
        return list.get(list.size()-1);
    }
}
