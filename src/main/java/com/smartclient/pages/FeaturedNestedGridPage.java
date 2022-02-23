package com.smartclient.pages;

import com.smartclient.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedNestedGridPage extends Utility {
    private static final Logger log = LogManager.getLogger(FeaturedNestedGridPage.class.getName());

   public FeaturedNestedGridPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath ="//div[@id='isc_EH']//table[@role='presentation']")
    WebElement dropdownItemAsc;

    @FindBy(xpath = "//div[@id='isc_3V']//tr")
    WebElement webtable;

    public void clickToSortAsc(){
        dropdownItemAsc.click();
    }

}
