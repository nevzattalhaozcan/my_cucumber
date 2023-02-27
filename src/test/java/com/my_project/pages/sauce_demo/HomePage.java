package com.my_project.pages.sauce_demo;

import com.my_project.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "product_sort_container")
    public WebElement filter;

    @FindBy(className = "shopping_cart_link")
    public WebElement cart;

    @FindBy(id = "react-burger-menu-btn")
    public WebElement burgerMenu;

    @FindBy(xpath = "//div[@class='inventory_item_label']//a")
    public List<WebElement> products;

    @FindBy(css = "btn.btn_primary.btn_small.btn_inventory")
    public List<WebElement> addCartButtons;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement backpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    public WebElement bikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement tshirtBolt;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement jacket;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement onesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    public WebElement tshirt;

}
