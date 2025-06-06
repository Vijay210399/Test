package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

    public static WebDriver driver;

    public static WebDriver launching_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void launching_URL(String URL) {
        driver.get(URL);
    }

    public static void input_Data(WebElement element, String user_Value) {
        element.sendKeys(user_Value);
    }

    public static void click_Item(WebElement element) {
        element.click();
    }

    public static void selectByIndex(WebElement element, int dropdown1) {
        Select d1 = new Select(element);
        d1.selectByIndex(dropdown1);
    }

    public static void selectByValue(WebElement element, String dropdown2) {
        Select d2 = new Select(element);
        d2.selectByValue(dropdown2);
    }

    public static void selectByVisibleText(WebElement element, String dropdown3) {
        Select d3 = new Select(element);
        d3.selectByVisibleText(dropdown3);
    }

    public static void frame(WebDriver driver, WebElement element) {
        driver.switchTo().frame(element);
    }



}

