package com.metlife.testsuite;

import com.metlife.Utilites.DriverUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SetUp_TearDown {


    @Parameters({"Browser"})
    @BeforeClass
    public void setup(){

        DriverUtils.Browserlounch();
    }

  //  @AfterClass
//    public void TearDown() throws InterruptedException {
//        Thread.sleep(5000);
//        DriverUtils.close();
//    }
}
