package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class StreamPage {
    public StreamPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
