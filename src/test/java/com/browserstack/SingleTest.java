package com.browserstack;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
//    --google test--
//    driver.get("https://www.google.com/ncr");
//    WebElement element = driver.findElement(By.name("q"));
//    element.sendKeys("BrowserStack");
//    element.submit();
//    Thread.sleep(5000);
//
//    assertEquals("BrowserStack - Google Search", driver.getTitle());
    driver.get("https://www.browserstack.com/");
    String ActualTitle = driver.getTitle();
    String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
    Assert.assertEquals(ExpectedTitle, ActualTitle);

    String ActualUrl = driver.getCurrentUrl();
    String ExpectedUrl = "https://www.browserstack.com/";
    Assert.assertEquals(ExpectedUrl, ActualUrl);

    String ActualH1 = driver.findElement(By.tagName("h1")).getText();
    String ExpectedH1 = "App & Browser Testing Made Easy";
    Assert.assertEquals(ExpectedH1, ActualH1);
  }
}
