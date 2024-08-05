package com.metlife.Data;

import com.metlife.Utilites.ExlsUtils;
import org.testng.annotations.DataProvider;

public class Credancial {


    @DataProvider
    public Object[][] Valid_Data() {


        return ExlsUtils.readExcel("LoginData.xlsx","Data");
    }
}
