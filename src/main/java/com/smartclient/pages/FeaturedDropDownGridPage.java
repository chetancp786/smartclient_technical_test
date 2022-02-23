package com.smartclient.pages;

import com.smartclient.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FeaturedDropDownGridPage extends Utility {
    private static final Logger log = LogManager.getLogger(FeaturedDropDownGridPage.class.getName());

   public FeaturedDropDownGridPage() {
        PageFactory.initElements(driver, this);
    }

/*    @FindBy(xpath = "//table[@id='isc_3Ptable']//tr[@role='option']")
    List<WebElement> dropdownTable;

    @FindBy(xpath ="//span[@id='isc_2D']//span[@class='comboBoxItemPicker']")
    WebElement dropdown;

    @FindBy(xpath = "//div[@id='isc_3V']//tr")
    WebElement webtable;

    @FindBy(xpath = "//div[@id='isc_43']//table[@id='isc_3Ptable']//tbody//tr[19]")
    WebElement myselection;

    @FindBy(xpath = "//div[@id='isc_48']")
    WebElement scrollBar;
*/
      /*
    public void clickOnDropdown(){
        doClickOnElement(dropdown);
    }
    public void selectDropdownWebTableValue(){
        int sizeTable = dropdownTable.size();
        System.out.println(sizeTable);

        String p1 = "//div[@id='isc_3V']//tr";
*/
  /*
          List<WebElement> allOptions = new Select(webtable).getOptions();
            for (WebElement options : allOptions) {
                if (options.getText().contains("Exercise")) {
                    options.click();
                    break;
                }
            }
        }
*/
    /*

        String a = myselection.getText();
        System.out.println("my selection text= "+a);

        for (int i = 1; i <= rowsCount; i++) {
            for (int j = 2; j <= columnsCount; j++) {

            }
        }
        */


}
