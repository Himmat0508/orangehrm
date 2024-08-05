package com.metlife.testsuite;

import com.metlife.Data.Credancial;
import com.metlife.PageObject.Login_Page;
import com.metlife.Utilites.DriverUtils;
import org.testng.annotations.Test;

public class Login  extends SetUp_TearDown {


    @Test(dataProviderClass = Credancial.class, dataProvider = "Valid_Data")
    public void Login_page(String user, String Pass) throws InterruptedException {
        DriverUtils.nevigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DriverUtils.type(Login_Page.User_name,user);
        DriverUtils.type(Login_Page.Password,Pass);
        DriverUtils.click(Login_Page.Loginbutton);





    }

}
