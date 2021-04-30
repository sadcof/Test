package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.Knop;
import page.Main;

import java.util.concurrent.TimeUnit;


public class Base {
    public WebDriver driver;
    public Main main;
    public Knop knop;


    @BeforeEach
    public  void  start(){
        String ON = "https://www.onliner.by/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
        main = PageFactory.initElements(driver, Main.class);
        knop = PageFactory.initElements(driver, Knop.class);

    }
    @AfterEach
    public void close() {
        driver.quit();
    }
}
