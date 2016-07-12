package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Krok212InneproduktyTAKPotwierdzenieagentaTAKWidocznoPrzyciskW {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://rozetka.com.ua";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testKrok212InneproduktyTAKPotwierdzenieagentaTAKWidocznoPrzyciskW() throws Exception {
    driver.get(baseUrl + "/turisticheskiy-instrument-i-aksessuary/c4625907/");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("price[min]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }
    //do kroku 2
    driver.findElement(By.id("price[min]")).clear();
    driver.findElement(By.id("price[min]")).sendKeys("100");

    driver.findElement(By.id("price[max]")).clear();
    driver.findElement(By.id("price[max]")).sendKeys("200");


    // ERROR: Caught exception [ERROR: Unsupported command [dragAndDrop | css=img.right-slider | 75,0]]
    // ERROR: Caught exception [ERROR: Unsupported command [focus | document.forms['search-form'].text | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [fireEvent | document.forms['search-form'].text | blur]]
    // ERROR: Caught exception [ERROR: Unsupported command [getSelectedId | css=a[name="drop_link"] | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getSelectedLabel | css=a[name="drop_link"] | ]]
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
