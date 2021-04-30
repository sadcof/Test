package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import test.Base;

public class Main extends Baseforpage {
    String ON = "https://www.onliner.by/";
    public Main(WebDriver driver) {
        super(driver);
    }
    public void go() {
        driver.get(ON);
    }
    public void display(String task) {
        driver.findElement(By.xpath("//ul[@class='b-main-navigation']")).click();
    }

}
