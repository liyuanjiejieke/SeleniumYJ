package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavascriptExecutor_selenium {
    public static void main(String[] args) throws Exception{
//        huadong();
        beijing();
    }

    public static void huadong(){
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver ();
        try {
            driver.get("https://www.cnblogs.com/");
            driver.manage().window().maximize();
            Thread.sleep(5000);
            //执行方式
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            //String js = "document.documentElement.scrollTop=200";
            int str=driver.manage().window().getSize().height;
            System.out.println(str+"-----------");
            String js = null;
//            jsExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            for (int i = 0; i < driver.manage().window().getSize().height*4; i=i+4) {
                if(driver instanceof ChromeDriver){
                    js = "document.documentElement.scrollTop="+i;
                }
                jsExecutor.executeScript(js);//执行js
            }
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("执行结束，关闭浏览器1！");
            driver.quit();

        }
    }

    public static void beijing() throws  Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");
        WebElement webElement=driver.findElement(By.id("s-top-loginbtn"));
        webElement.click();
        Thread.sleep(5000);
        WebElement username=driver.findElement(By.id("TANGRAM__PSP_11__userName"));
        username.sendKeys("abcdef");
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",username);
//        WebElement password=driver.findElement(By.id("TANGRAM__PSP_11__password"));
        Thread.sleep(2000);
        WebElement password1 = driver.findElement(By.id("TANGRAM__PSP_11__password"));
        password1.sendKeys("1234565");
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",password1);
//        //设置密码背景
//        javascriptExecutor.executeScript("arguments[0].setAttribute('style','background':yellow;border:2px solid red;');",password);
//        password.sendKeys("1234565");
        WebElement submit = driver.findElement(By.id("TANGRAM__PSP_11__submit"));
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",submit);
        driver.quit();

    }
}
