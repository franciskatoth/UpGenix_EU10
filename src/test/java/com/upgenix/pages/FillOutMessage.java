package com.upgenix.pages;

import com.upgenix.utilies.Driver;
import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.support.PageFactory;

public class FillOutMessage {

    public FillOutMessage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
