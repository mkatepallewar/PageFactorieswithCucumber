package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	@FindBy (how=How.LINK_TEXT,using="buy + sell")
	public WebElement carsforBuySellLink;
	
	@FindBy (how=How.LINK_TEXT,using="reviews")
	public WebElement reviewsLink;
	
	@FindBy (how=How.LINK_TEXT,using="news")
	public WebElement newsLink;
	
	@FindBy (how=How.LINK_TEXT,using="advice")
	public WebElement adviceLink;
	
	@FindBy (how=How.LINK_TEXT,using="pricing + specs")
	public WebElement pricingspecsLink;
	
	@FindBy (how=How.LINK_TEXT,using="Search Cars")
	public WebElement searchcarsLink;
	
	@FindBy (how=How.LINK_TEXT,using="Used")
	public WebElement usedcarssearchLink;
	
	@FindBy (how=How.LINK_TEXT,using="Sell my car")
	public WebElement sellMyCarLink;
}
