package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators=new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToBuySellMenue() {
		System.out.println("Moving on buy+sell link");
		Actions action =new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.carsforBuySellLink).perform();
		
	}
	
	public void clickOnSeachCarsMenu() {
		System.out.println("Clicking on Search Car Links");
		carsGuideHomePageLocators.searchcarsLink.click();
	}
	
	public void clickOnUsedCarsSearchMenu() {
		System.out.println("Clicking on Used Car Links");
		carsGuideHomePageLocators.usedcarssearchLink.click();
	}
	
	public void moveToSellMyCarMenu() {
		System.out.println("Clicking on Sell my Car Links");
		carsGuideHomePageLocators.sellMyCarLink.click();
	}
}
