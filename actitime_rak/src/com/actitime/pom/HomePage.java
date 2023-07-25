package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	@FindBy(id="container_tasks")
	private WebElement Tasksbtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setlogout()
	{
		logoutbtn.click();
	}
	public void setTasksTab()
	{
		Tasksbtn.click();
	}

}
