package b2b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_cz {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://wwww.baidu.com");
        //浏览器最大化
        driver.manage().window().maximize();

//        //当前页面刷新
//        driver.navigate().refresh();
//
//        //前进，跳转到下一页
//        driver.navigate().forward();
//
//        //浏览器后退
//        driver.navigate().back();

        //浏览器位置和设置窗口位置
//        Point point=new Point(150,150);
//        driver.manage().window().setPosition(point);
//        System.out.println(driver.manage().window().getPosition());

        //浏览器窗口大小
/*        Dimension dimension=new Dimension(1366,768);
        driver.manage().window().setSize(dimension);
        System.out.println(driver.manage().window().getSize());*/

        //返回当前的URl和Title
        String url=driver.getCurrentUrl();
        String title =driver.getTitle();
        System.out.println(url+"----"+title);

        //关闭浏览器
        driver.close();//关闭当前浏览器页面
        driver.quit();//退出由selenium开启的所有页面




    }
}
