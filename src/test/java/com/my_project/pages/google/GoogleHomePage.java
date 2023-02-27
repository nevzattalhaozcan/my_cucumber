package com.my_project.pages.google;

import com.my_project.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement inputBox;

    @FindBy(linkText = "Images")
    public WebElement imagesLink;

}
