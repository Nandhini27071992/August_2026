package com.cts.PageExecution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.BaseClassPackage.BaseClass;
import com.cts.PageFactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightBooking extends BaseClass{
	@Given("Launch the browser and load url")
	public void launch_the_browser_and_load_url() {
	    BaseClass.browserLaunch();
	    BaseClass.loadUrl("https://www.cheapair.com/");
	}

//	@When("Select the destination and departure date for the flight")
//	public void select_the_destination_and_departure_date_for_the_flight() throws InterruptedException, AWTException {
//		LoginPage lp=new LoginPage();
////		lp.FlightOption.click();
////		lp.FlightTrip.click();
//		
//		Thread.sleep(5000);
//		
////		lp.FromPlace.sendKeys("Chenna");
//		
//		/*
//		 * Robot robot = new Robot(); lp.FromPlace.sendKeys("C");
//		 * robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		 * 
//		 * lp.FromPlace.sendKeys("C"); robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		 * 
//		 * lp.FromPlace.sendKeys("H"); robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); lp.FromPlace.sendKeys("E");
//		 * 
//		 * robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); lp.FromPlace.sendKeys("N");
//		 * 
//		 * robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); lp.FromPlace.sendKeys("N");
//		 * 
//		 * robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); lp.FromPlace.sendKeys("A");
//		 * 
//		 * robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); lp.FromPlace.sendKeys("I");
//		 */
//		/*
//		 * lp.ToPlace.sendKeys("Delhi"); lp.DepartureDate.sendKeys("02/01/2026");
//		 * lp.SearchButton.click(); lp.DirectFlightsCheckbox.click();
//		 */
//	}
//
//	@When("the flight should be displayed and confirm the flight")
//	public void the_flight_should_be_displayed_and_confirm_the_flight() {
//		LoginPage lp=new LoginPage();
//	    lp.TravelerSeat.click();
//	    lp.FlightClass.sendKeys("Business");
//	    lp.PassengerCategory.click();
//	    lp.DoneButton.click();
//	    lp.SelectFlight.click();
//	}
//
//	@When("provide the traveler details and check out")
//	public void provide_the_traveler_details_and_check_out() {
//		LoginPage lp=new LoginPage();
//		lp.EmailAddress.sendKeys("nandhini@gmail.com");
//		lp.FirstName.sendKeys("Nandhini");
//		lp.LastName.sendKeys("Ramachandran");
//		lp.PassengerBirthMonthDropdown.sendKeys("July");
//		lp.PassengerBirthDayDropdown.sendKeys("27");
//		lp.PassengerBirthYearDropdown.sendKeys("1992");
//		lp.PassengerGender.sendKeys("Female");
//		lp.ContinueButton.click();
//		
//	}
//
//	@When("confirm the payment details with valid cc")
//	public void confirm_the_payment_details_with_valid_cc() {
//		LoginPage lp=new LoginPage();
//		
//		lp.cardNumber.sendKeys("4114759845687892"); 
//		lp.cardName.sendKeys("Test User");
//		lp.expiryDate.sendKeys("12/30");
//		lp.cvv.sendKeys("123");
//		lp.billingAddress.sendKeys("chennai");
//		lp.Country.sendKeys("India");
//		lp.state.sendKeys("Tamilnadu");
//		lp.city.sendKeys("Chennai");
//		lp.Postalcode.sendKeys("600078");
//		lp.email.sendKeys("nan@gmail.com");
//		lp.phone.sendKeys("04424687895");
//		lp.Confirmbtn.click();
//
//	}
//
//	@Then("check the flight is booked and close the browser")
//	public void check_the_flight_is_booked_and_close_the_browser() {
//	   BaseClass.closeBrowser();
//	}
	public static void main(String[] args) throws InterruptedException {
		BaseClass.browserLaunch();
	    BaseClass.loadUrl("https://www.cheapair.com/");
	LoginPage lp = new LoginPage();
	lp.flightTab.click();
	BaseClass.selectTripType("One-Way");
	Thread.sleep(1000);
	lp.fromplace.click();
	lp.fromplace.sendKeys("S");
	Thread.sleep(1000);
	lp.fromplace.sendKeys("E");
	Thread.sleep(1000);
	lp.fromplace.sendKeys("S");
	Thread.sleep(1000);
	
	Actions ac = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// Now wait for the SES option to appear and be clickable
	wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath("//li[contains(@class,'suggestion-box__item')]")));
	ac.sendKeys(Keys.ENTER).perform();
//	ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	String fromValue = lp.fromplace.getDomProperty("value");
	System.out.println("Origin selected: " + fromValue);

	lp.to.click();
	lp.to.sendKeys(Keys.CONTROL + "a");
	lp.to.sendKeys(Keys.DELETE);
	lp.to.sendKeys("si");
	Thread.sleep(1000);
	lp.to.sendKeys("ng");
	Thread.sleep(2000);
	lp.to.sendKeys("ap");
	Thread.sleep(2000);
	lp.to.sendKeys("or");
	Thread.sleep(2000);
	lp.to.sendKeys("e");

	}
}



