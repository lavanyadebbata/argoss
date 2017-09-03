package com.insoft.leicster;

import org.openqa.selenium.By;

/**
 * Created by maheshreddy on 28/08/2017.
 */
public class HomePage  extends DriverManager{


    public void doSearch(String product){
        driver.findElement(By.id("search-term")).sendKeys(product);
        driver.findElement(By.id("")).click();
    }

    public String getPageURL(){
       return driver.getCurrentUrl();
    }


}
