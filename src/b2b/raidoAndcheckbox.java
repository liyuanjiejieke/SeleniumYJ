package b2b;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class raidoAndcheckbox {
    public static void main(String[] args) throws Exception{
//        quanxuan();
//        bianlibutton();
        checkbox();
//        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("file:///C:\\Users\\user\\Desktop\\radio.html");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebElement webElement=driver.findElement(By.name("checkbox1"));
//        webElement.click();
//        Thread.sleep(2000);
//        WebElement webElement1=driver.findElement(By.name("checkbox3"));
//        boolean boo=webElement1.isSelected();
//        if (boo){
//            System.out.println("已经帮选中");
//            webElement1.click();//取消
//        }
//
//        Thread.sleep(2000);
//
//
//        //单选的
//        WebElement webElement2=driver.findElement(By.cssSelector("[value='2']"));
//        boolean be=webElement2.isSelected();
//        if(!be){
//            webElement2.click();
//
//        }
//
//        Thread.sleep(2000);
//
//        driver.quit();
    }

    public static void quanxuan() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:\\Users\\user\\Desktop\\radio.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> li=driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement webElement:li){
            if (!webElement.isSelected())
            webElement.click();
        }
        Thread.sleep(2000);
        driver.quit();

    }

    public static void bianlibutton(){
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:\\Users\\user\\Desktop\\radio.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> li=driver.findElements(By.name("radio"));
        for(WebElement webElement:li){
            if(webElement.getAttribute("value").equals("2")){
                if(!webElement.isSelected()){
                    webElement.click();
                }
            }
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    public static void checkbox() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:\\Users\\user\\Desktop\\radio.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement lula=driver.findElement(By.name("checkbox4"));
        if(!lula.isSelected()){
            lula.click();
        }
        Thread.sleep(2000);
        Assert.assertTrue(lula.isSelected());

        Thread.sleep(2000);

        if(lula.isSelected()){
            lula.click();
            Thread.sleep(2000);
        }
        Assert.assertFalse(lula.isSelected());

        List<WebElement> li=driver.findElements(By.cssSelector("[type='checkbox']"));
        for (WebElement webElement:li){
            webElement.click();
        }
    }

}
