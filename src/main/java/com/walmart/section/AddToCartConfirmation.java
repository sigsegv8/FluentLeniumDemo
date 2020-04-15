package com.walmart.section;

import org.fluentlenium.core.FluentControl;
import org.fluentlenium.core.components.ComponentInstantiator;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddToCartConfirmation extends FluentWebElement {

    @FindBy(css = "button[aria-label=Close]")
    private FluentWebElement closeConfirmationButton;

    @FindBy(css = "[data-automation=continue-shopping]")
    private FluentWebElement continueShoppingButton;

    public AddToCartConfirmation(WebElement element, FluentControl control, ComponentInstantiator instantiator) {
        super(element, control, instantiator);
    }

    public void continueShopping(){
        continueShoppingButton.click();
    }

    public void close(){
        closeConfirmationButton.click();
        await().atMost(3000).until(this).not().displayed();
    }
}
