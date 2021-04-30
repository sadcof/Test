package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Knop extends Baseforpage{
    public Knop(WebDriver driver) {
        super(driver);
    }
    public void check() {
        display(By.xpath("//div[@class='service-header__content']"));
    }
}
