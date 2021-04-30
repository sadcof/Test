package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class Test1 extends Base {

    @Test
    public void  fTest() {
        main.go();
        main.display("1");
        knop.check();
    }

    @Test

    public void singup() {
        driver.get("https://www.onliner.by/");
        WebElement header = driver.findElement(By.id("userbar"));
        header.findElement(By.className("auth-bar__item auth-bar__item--text")).click();
        Random random = new Random();
        int a = random.nextInt(50) +1;
        String email = "josaw67473" + a + "@87708b.com";
        System.out.println(email);
        driver.findElement(By.className("auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full")).sendKeys(email);
        driver.findElement(By.className("auth-input auth-input_primary auth-input_base auth-form__input auth-form__input_width_full")).sendKeys("12345678");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

    }
}
