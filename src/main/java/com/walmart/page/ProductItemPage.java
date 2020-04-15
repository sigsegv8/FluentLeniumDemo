package com.walmart.page;

import com.walmart.section.AddToCartConfirmation;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("/en/ip/{productId}")
public class ProductItemPage extends Page {


    @FindBy(css = "[data-automation=quantity] input")
    private FluentWebElement textbox;

    @FindBy(css = "[data-automation=cta-button]")
    private FluentWebElement button;

    @FindBy(css = "#atc-root")
    private AddToCartConfirmation popup;


    public void doSomething(String quantity){
        textbox.clear().fill().with(quantity);
    }

    public void ClickOnAddToCartButton(){
        button.click();
    }


    public AddToCartConfirmation confirmationPopup(){
        return popup;
    }

}
