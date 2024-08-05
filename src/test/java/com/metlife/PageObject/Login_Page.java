package com.metlife.PageObject;

import org.openqa.selenium.By;

public class Login_Page {

    public static By User_name = By.xpath("//input[@name='username']");
    public static By Password = By.xpath("//input[@name='password']");
    public static By Loginbutton = By.xpath("//button[@type='submit']");
}
