package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions=new CarsSearchPageActions();
	
	@Given("^I am on the homepage \"([^\"]*)\" of carsguide website$")
	public void i_am_on_the_homepage_of_carsguide_website(String webSiteUrl) throws Throwable {
		SeleniumDriver.openPage(webSiteUrl);
	}

	@When("^I move to menu$")
	public void i_move_to_menu(List<String> list) throws Throwable {
		String menu=list.get(1);
		System.out.println("Menu Selected: " +menu);
		
		carsGuideHomePageActions.moveToBuySellMenue();
		
		
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String searchCars) throws Throwable {
		carsGuideHomePageActions.clickOnSeachCarsMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from any make dropdown$")
	public void select_carbrand_as_from_any_make_dropdown(String carBrand) throws Throwable {
		carsSearchPageActions.selectCarMake(carBrand);
		
	}

	@And("^select carmodel as \"([^\"]*)\" from selectmodel dropdown$")
	public void select_carmodel_as_from_selectmodel_dropdown(String carModel) throws Throwable {
		carsSearchPageActions.selectCarModel(carModel);
	}

	@And("^select location as \"([^\"]*)\" from selectlocation dropdown$")
	public void select_location_as_from_selectlocation_dropdown(String carLocation) throws Throwable {
		carsSearchPageActions.selectCarLocation(carLocation);
	}

	@And("^select price as \"([^\"]*)\" from price dropdown$")
	public void select_price_as_from_price_dropdown(String carPrice) throws Throwable {
		carsSearchPageActions.selectCarPrice(carPrice);
	}

	@And("^click on Find_My_Next_Car button$")
	public void click_on_Find_My_Next_Car_button() throws Throwable {
		carsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("^I should see the list of searched cars$")
	public void i_should_see_the_list_of_searched_cars() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Cars listed out");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expectedTitle) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		String actualTitle=SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}


}
