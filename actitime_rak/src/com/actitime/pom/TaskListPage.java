package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.generic.FileLib;

public class TaskListPage {
	@FindBy(xpath="//div[@class=\"title ellipsis\"]/../div[@class=\"downIcon\"]")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[@class=\"item createNewCustomer\"]")
	private WebElement createCustomerbtn;
	
	@FindBy(xpath="//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
	private WebElement customernametextfield;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement customerdescriptiontextfield;
	
	@FindBy(xpath="//div[contains(.,'Copy Projects from an Existing Customer')]/descendant::div[@class=\"dropdownButton\"]")
	private WebElement dropdown;
	
	@FindBy(xpath="//div[@class=\"searchItemList\"]/div[text()='Big Bang Company']")
	private WebElement dropdownbig;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createcustbtn;
	
	@FindBy(xpath="//div[@class=\"titleEditButtonContainer\"]/div[@class=\"title\"]")
	private WebElement actualname;
	
	public WebElement getActualname() {
		return actualname;
	}

	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getCreateCustomerbtn() {
		return createCustomerbtn;
	}

	public WebElement getCustomernametextfield() {
		return customernametextfield;
	}

	public WebElement getCustomerdescriptiontextfield() {
		return customerdescriptiontextfield;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getDropdownbig() {
		return dropdownbig;
	}

	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}

	
}
