package com.upgrade.rewards;

import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.By;

@PageUrl("/rewards-checking/")
public class rewardscheckinglandingpage extends Page {
   
    public void ClickOpenRewardsChecking(){
    	FluentWebElement button = newFluent(getDriver().findElement(By.xpath("//*[@id='hero-section']/div/div/div/div/div[2]/div[2]/a")));
        button.click();
    }


    public void inputData(){
    	FluentWebElement username = newFluent(getDriver().findElement(By.xpath("//*[@id='root']/div/main/div[1]/div[3]/form/div[1]/div/div/div/input")));
    	FluentWebElement password = newFluent(getDriver().findElement(By.xpath("//*[@id='root']/div/main/div[1]/div[3]/form/div[2]/div/div/div[1]/input")));
    	FluentWebElement continueButton = newFluent(getDriver().findElement(By.xpath("//button[text()='Continue']")));
    	username.clear().fill().with("test21241424@test.ca");
    	password.clear().fill().with("Welcome@1234");
    	continueButton.click();
    }

}
