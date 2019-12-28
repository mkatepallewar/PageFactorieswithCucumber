package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchedPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {
	
	CarSearchedPageLocators carSearchPageLocators=null;
	
	public CarsSearchPageActions() {
		this.carSearchPageLocators=new CarSearchedPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}
	
	public void selectCarMake(String carBrand) {
		Select selectCarMakers=new Select(carSearchPageLocators.carsMakeDropDown);
		selectCarMakers.selectByVisibleText(carBrand);
		
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarMakers=new Select(carSearchPageLocators.selectModelDropDown);
		selectCarMakers.selectByVisibleText(carModel);
		
	}
	
	public void selectCarLocation(String carLocation) {
		Select selectCarMakers=new Select(carSearchPageLocators.selectLocationDropDown);
		selectCarMakers.selectByVisibleText(carLocation);
		
	}
	
	public void selectCarPrice(String carPrice) {
		Select selectCarMakers=new Select(carSearchPageLocators.priceDropDown);
		selectCarMakers.selectByVisibleText(carPrice);
		
	}
	
	
	public void clickOnFindMyNextCarButton() {
		carSearchPageLocators.findMyNextCarBtn.click();
	}

}
