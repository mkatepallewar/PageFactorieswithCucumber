package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarsSearchPageLocators {
	
	@FindBy (how=How.XPATH,using="//*[@id=\"models\"]")
	public WebElement selectModelDropDown;
}
