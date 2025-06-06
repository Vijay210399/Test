package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        TakesScreenshot ss = (TakesScreenshot) driver;
        File source = ss.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\11718\\IdeaProjects\\PomPrac\\target\\Screenshots\\Amazon.png");
        FileUtils.copyFile(source,des);











//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File des = new File("C:\\Users\\11718\\IdeaProjects\\PomPrac\\target\\Screenshots\\Facebook.png");
//        FileUtils.copyFile(source,des);




    }




}
