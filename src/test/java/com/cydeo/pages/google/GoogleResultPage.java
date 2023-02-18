package com.cydeo.pages.google;

import com.cydeo.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultPage {

    public GoogleResultPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "result-stats")
    public WebElement result;

}
