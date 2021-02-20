package com.LibraryCT.pages;

import com.LibraryCT.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "tbl_users_length")
    public WebElement showRecordDropDown;

}
