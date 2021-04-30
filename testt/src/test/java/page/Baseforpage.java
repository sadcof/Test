package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Baseforpage {

    public WebDriver driver;
    public WebDriverWait wait;

    public Baseforpage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }
    public void waitn(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
public  void display(By elementBy) {

        assertTrue(driver.findElement(elementBy).isDisplayed());
}



}
