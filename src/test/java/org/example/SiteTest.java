package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiteTest {
    @org.junit.Test
    public void testTriangle() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://playground.learnqa.ru/puzzle/triangle");

        WebElement surrenderButton = driver.findElement(By.xpath("//button[text()='Я сдаюсь']"));
        Assert.assertNotNull(surrenderButton);
        surrenderButton.click();

        WebElement answerLink = driver.findElement(By.xpath("//a[text()='Ссылка на ответы']"));
        Assert.assertNotNull(answerLink);

        WebElement hideAnswersButton = driver.findElement(By.xpath("//button[text()='Спрятать ответы']"));
        Assert.assertNotNull(hideAnswersButton);

        driver.quit();
    }

}
