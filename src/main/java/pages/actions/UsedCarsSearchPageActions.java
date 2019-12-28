package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.deps.com.thoughtworks.xstream.core.util.Pool.Factory;
import pages.locators.UsedCarsSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	public UsedCarsSearchPageLocators usedCarsSearchPageLocators=null;
	
	public UsedCarsSearchPageActions() {
		this.usedCarsSearchPageLocators=new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMakers=new Select(usedCarsSearchPageLocators.selectModelDropDown);
		selectCarMakers.selectByVisibleText(carModel);
		
	}
	
}
