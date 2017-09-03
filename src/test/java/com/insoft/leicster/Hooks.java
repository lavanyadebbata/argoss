package com.insoft.leicster;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverManager driverManager=new DriverManager();

    @Before
    public void setup(){
        driverManager.opemBrowser();
        driverManager.navigateTo();
        driverManager.maximise();
        driverManager.applyWaits();
    }

    @After
    public void tearDown(){
        driverManager.closeBrowser();
    }
}
