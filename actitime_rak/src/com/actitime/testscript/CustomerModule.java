package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws Throwable {
		Reporter.log("createCustomer",true);
		
		FileLib f=new FileLib();
		String custname = f.getexceldata("CreateCustomer", 1, 4);
		String description=f.getexceldata("CreateCustomer", 1, 4);
	
		HomePage h=new HomePage(driver);
		h.setTasksTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewbtn().click();
		t.getCreateCustomerbtn().click();
		t.getCustomernametextfield().sendKeys(custname);;
	    t.getCustomerdescriptiontextfield().sendKeys(description);
		t.getDropdown().click();
		t.getDropdownbig().click();
		t.getCreatecustbtn().click();
		Thread.sleep(10000);
		String actualname1 = t.getActualname().getText();
		Assert.assertEquals(actualname1, custname);
	}

}
