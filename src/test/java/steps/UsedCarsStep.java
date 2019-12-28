package steps;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarsSearchPageActions;

public class UsedCarsStep {
	
	CarsGuideHomePageActions carsGuideHomePageActions=new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions=new UsedCarsSearchPageActions();
	
	@When("^click in \"([^\"]*)\" search car link$")
	public void click_in_search_car_link(String usedCars) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		carsGuideHomePageActions.clickOnUsedCarsSearchMenu();
	}

	@When("^select car model$")
	public void select_car_model(List<String> list) throws Throwable {
		String menu=list.get(1);
		System.out.println("Menu Selected: " +menu);
		
		usedCarsSearchPageActions.selectCarModel(menu);
		
	}

}
