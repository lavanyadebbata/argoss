package com.insoft.leicster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by maheshreddy on 28/08/2017.
 */
public class DriverManager {

    public static WebDriver driver;

    public void opemBrowser(){
        driver=new FirefoxDriver();
    }

    public void navigateTo(){
        driver.get("http://www.argos.co.uk");
    }

    public void maximise(){
        driver.manage().window().maximize();
    }

    public void applyWaits(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }

}
