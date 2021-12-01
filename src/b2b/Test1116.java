package b2b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Test1116 {
    public static void main(String[] args) throws Exception{
//        zonghe();
        caigouCase();

    }


    //机构类别新增
    public static void zonghe() throws Exception{

        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://preclubb2b.liantuofu.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //B2B后台登录
        WebElement username=driver.findElement(By.name("userName"));
        username.sendKeys("SHlibaoshB");
        WebElement passWord=driver.findElement(By.name("passWord"));
        passWord.sendKeys("111qqq");
        WebElement button=driver.findElement(By.className("login-btn"));
        button.click();
        Thread.sleep(3000);

        //点击机构管理-弹出下拉列表
        WebElement jigou=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[1]/a"));
        jigou.click();

        //点击机构类别
        WebElement jigouleibie=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[1]/ul/li[2]/a"));
        jigouleibie.click();
        Thread.sleep(2000);

//        获取四位随机数
        int random= (int) ((Math.random()+1) * 1000);
        String ranstring=String.valueOf(random);

        //进入 iframe
        driver.switchTo().frame("mainBox");
        //点击新增
        WebElement xinzeng=driver.findElement(By.id("area-inser"));
        xinzeng.click();

        //输入类别名称
        WebElement category_Name=driver.findElement(By.id("category-Name"));
        category_Name.sendKeys("ceshi"+ranstring);
        Thread.sleep(2000);

        //点击保存
        WebElement buttonmin=driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/div[3]/button[2]"));
        buttonmin.click();
        Thread.sleep(2000);


        //点击确认
        WebElement queren=driver.findElement(By.xpath("/html/body/div[6]/div[7]/div/button"));
        queren.click();
        Thread.sleep(1000);

        //关闭新增弹框
        WebElement guanbi=driver.findElement(By.xpath("//*[@id=\"categoryModal\"]/div/div/div[1]/button"));
        guanbi.click();

    }

    //采购单
    public static void caigouCase() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\LiYuanJie\\chromedriverxin\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://preclubb2b.liantuofu.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions actions=new Actions(driver);

        //B2B后台登录
        WebElement username=driver.findElement(By.name("userName"));
        username.sendKeys("SHlibaoshB");
        WebElement passWord=driver.findElement(By.name("passWord"));
        passWord.sendKeys("111qqq");
        WebElement button=driver.findElement(By.className("login-btn"));
        button.click();
        Thread.sleep(3000);

//        //点击采购管理
//        WebElement caigougl=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a"));
//        caigougl.click();
//
//        //点击采购单
//        WebElement caigoudan=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[3]/a"));
//        caigoudan.click();
//        Thread.sleep(2000);
//
//        //进入 iframe
//        driver.switchTo().frame("mainBox");
//        //点击新增
//        WebElement xinzeng=driver.findElement(By.xpath("//*[@id=\"procurementOrderList\"]/div[1]/div/a"));
//        xinzeng.click();
//        Thread.sleep(2000);
//
//        //选择要货机构
//        WebElement yaohuo=driver.findElement(By.id("merchantName"));
//        yaohuo.click();
//        Thread.sleep(2000);
//
//
//
//        WebElement yaohuojigou=driver.findElement(By.xpath("//*[@id=\"thisOrganizationModel\"]/div/div/div[2]/div/div[2]/table/tbody/tr[2]"));
//        actions.doubleClick(yaohuojigou).perform();
//        Thread.sleep(2000);
//
//
//        //选择配送中心
//
//        WebElement peisong=driver.findElement(By.id("supplierName"));
//        peisong.click();
//        Thread.sleep(2000);
//
//        WebElement peisongjigou=driver.findElement(By.xpath("//*[@id=\"thisOrganizationModel\"]/div/div/div[2]/div/div[2]/table/tbody/tr[1]"));
//        actions.doubleClick(peisongjigou).perform();
//        Thread.sleep(2000);
//
//        //点击选择商品按钮
//        WebElement shopbutton=driver.findElement(By.xpath("//*[@id=\"choose-goods\"]"));
//        shopbutton.click();
//        Thread.sleep(2000);
//
//        //双击选择商品
//        WebElement saveshop =driver.findElement(By.xpath("//*[@id=\"supplier-tbody\"]/tr[1]"));
//        actions.doubleClick(saveshop).perform();
//        Thread.sleep(2000);
//
//        //输入要货数量
//        WebElement shopnumber=driver.findElement(By.xpath("//*[@id=\"goods-in-stock-tbody\"]/tr/td[15]/input"));
//        shopnumber.sendKeys("10");
//        Thread.sleep(2000);
//
//        //提交
//        WebElement tijiao=driver.findElement(By.xpath("//*[@id=\"stock-submit\"]"));
//        tijiao.click();
//        Thread.sleep(2000);
//
//        //确定弹框
//        WebElement tankuang=driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button"));
//        tankuang.click();
//        Thread.sleep(2000);
//
//        //审核
//        WebElement shenhe=driver.findElement(By.xpath("//*[@id=\"stock-audit\"]"));
//        shenhe.click();
//        Thread.sleep(2000);
//
//        //审核确认按钮
//        WebElement shenhebut=driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button"));
//        shenhebut.click();
//        Thread.sleep(2000);


//        driver.switchTo().defaultContent();
//        Thread.sleep(2000);

//        //点击采购单，回到采购单列表
//        WebElement caigoudanlist=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[3]/a"));
//        caigoudanlist.click();
//        Thread.sleep(2000);


        //点击配送管理
/*        WebElement peisonggl=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[5]/a"));
        peisonggl.click();
        Thread.sleep(2000);

        //点击配送单
        WebElement peisongdan=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[5]/ul/li[1]/a"));
        peisongdan.click();
        Thread.sleep(2000);

        driver.switchTo().frame("mainBox");
        Thread.sleep(2000);
        //点击新增
        WebElement psxinzeng=driver.findElement(By.xpath("//*[@id=\"stock-inser\"]"));
        psxinzeng.click();
        Thread.sleep(2000);

        //点击原始单号
        WebElement yuanshidan=driver.findElement(By.xpath("//*[@id=\"stockInRecordForm\"]/div/div[3]/div[1]/div/div/div/input"));
        yuanshidan.click();
        Thread.sleep(2000);

        //选择原始单据
        WebElement yuanshidanju01=driver.findElement(By.xpath("//*[@id=\"chooce-goods-tbody\"]/tr[1]"));
        actions.doubleClick(yuanshidanju01).perform();
        Thread.sleep(2000);

        //配送提交
        WebElement pstijiao=driver.findElement(By.xpath("//*[@id=\"stock-submit\"]"));
        pstijiao.click();
        Thread.sleep(2000);

        //关闭配送确认弹框
        WebElement pstankuang=driver.findElement(By.xpath("/html/body/div[5]/div[7]/div/button"));
        pstankuang.click();
        Thread.sleep(2000);

        //配送审核
        WebElement psshenhe=driver.findElement(By.xpath("//*[@id=\"stock-audit\"]"));
        psshenhe.click();
        Thread.sleep(2000);

        //关闭配送审核弹框
        WebElement psshtk=driver.findElement(By.xpath("/html/body/div[5]/div[7]/div/button"));
        psshtk.click();*/


        //入库流程

        //点击采购管理
  /*      WebElement Cgguanli=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a"));
        Cgguanli.click();
        Thread.sleep(2000);

        //点击采购入库单
        WebElement Cgourukudan=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[4]/a"));
        Cgourukudan.click();
        Thread.sleep(2000);

        //点击新增采购入库单
        driver.switchTo().frame("mainBox");
        Thread.sleep(2000);

        WebElement rkxinzeng=driver.findElement(By.xpath("//*[@id=\"purchaseWarehousingRecordForm\"]/div/div[1]/button"));
        rkxinzeng.click();
        Thread.sleep(2000);

        //点击关联配送单
        WebElement xzguanlianpsd=driver.findElement(By.xpath("//*[@id=\"stockInRecordForm\"]/div[1]/div[1]/div/a"));
        xzguanlianpsd.click();
        Thread.sleep(2000);

        //双击选择配送原始单据
        WebElement xzpsyuanshi=driver.findElement(By.xpath("//*[@id=\"chooce-recordno-tbody\"]/tr[1]"));
        actions.doubleClick(xzpsyuanshi).perform();
        Thread.sleep(2000);

        //入库单点击提交
        WebElement rktijiao=driver.findElement(By.xpath("//*[@id=\"order-submit\"]"));
        rktijiao.click();
        Thread.sleep(2000);

        //关闭提交确认框
        WebElement rkqueren=driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button"));
        rkqueren.click();
        Thread.sleep(2000);

        //入库单审核
        WebElement rkshenhe=driver.findElement(By.xpath("//*[@id=\"order-audit\"]"));
        rkshenhe.click();
        Thread.sleep(2000);

        //入库审核确认
        WebElement rkshenheqr=driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button"));
        rkshenheqr.click();
        Thread.sleep(2000);

        //确认
        WebElement rkhouqueren=driver.findElement(By.xpath("/html/body/div[7]/div[7]/div/button"));
        rkhouqueren.click();
        Thread.sleep(2000);*/

        //退货模块
        //点击采购管理
       WebElement Cgguanli02=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a"));
       Cgguanli02.click();
       Thread.sleep(3000);

       //点击退货单
        WebElement tuihuodan=driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[5]/a"));
        tuihuodan.click();
        Thread.sleep(2000);

        driver.switchTo().frame("mainBox");
        Thread.sleep(2000);

        //点击新增退货单
        WebElement xinjianthbutton=driver.findElement(By.xpath("//*[@id=\"addStockReturned\"]"));
        xinjianthbutton.click();
        Thread.sleep(2000);

        //点击选择关联入库单按钮
        WebElement xuanzeglrkd=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div[1]/div/a"));
        xuanzeglrkd.click();
        Thread.sleep(2000);

        //双击选择关联入库单
        WebElement xuanglrkd=driver.findElement(By.xpath("//*[@id=\"tbody-in-record\"]/tr[1]/td[1]/input"));
        boolean ische=xuanglrkd.isSelected();
        if(!ische){
            xuanglrkd.click();
        }
        Thread.sleep(2000);

        //选中对应的入库单后，点击确认按钮
        WebElement guanlianrkth=driver.findElement(By.xpath("//*[@id=\"selectInStockRecord\"]"));
        guanlianrkth.click();
        Thread.sleep(2000);

        //提交退货单
        WebElement tijiaotuihuo=driver.findElement(By.xpath("//*[@id=\"stockReturnSubmit\"]"));
        tijiaotuihuo.click();
        Thread.sleep(2000);

        //提交确认
        WebElement tituihuoqr=driver.findElement(By.xpath("/html/body/div[12]/div[7]/div/button"));
        tituihuoqr.click();
        Thread.sleep(3000);

        //审核退货单
        WebElement tuihuoshenhe=driver.findElement(By.xpath("//*[@id=\"stockReturnAudit\"]"));
        tuihuoshenhe.click();
        Thread.sleep(2000);

        //退货单审核确认333333331
        WebElement tuihuoshqr=driver.findElement(By.xpath("/html/body/div[12]/div[7]/div/button"));
        tuihuoshqr.click();
        Thread.sleep(2000);
        //退货单关闭审核弹框
        WebElement querentuihuo=driver.findElement(By.xpath("/html/body/div[12]/div[7]/div/button"));
        querentuihuo.click();
        Thread.sleep(2000);
        //退出浏览器
        driver.quit();

    }
}
