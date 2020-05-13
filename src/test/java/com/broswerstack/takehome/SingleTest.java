package com.broswerstack.takehome;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class SingleTest extends BrowserStackJUnitTest {

    @Test
    public void test() throws Exception {
        driver.get("https://www.google.com/ncr");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("BrowserStack");
        element.submit();
        Thread.sleep(5000);

        assertEquals("BrowserStack - Google Search", driver.getTitle());
    }
}

