package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SiteTest {

    @Test
    public void IsSiteWorks()
    {
        System.setProperty("webdriver.firefox.driver", "/usr/bin/firedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://playground.learnqa.ru/puzzle/triangle");
    }
}
