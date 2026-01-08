package com.cts.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.BaseClassPackage.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(id = "flights_triptype_label")
//	public WebElement FlightOption;
//
//	@FindBy(xpath = "//div[text()='One-way']")
//	public WebElement FlightTrip;
//
//	@FindBy(xpath = "//div[@class=\"widget__input location_input\"]/child::input[@id=\"fs_originCity_0\"]")
//	public WebElement FromPlace;
//
//	@FindBy(xpath = "//input[contains(@placeholder,'To')]")
//	public WebElement ToPlace;
//
//	@FindBy(xpath = "//div[text()='Fri, Jan 02']")
//	public WebElement DepartureDate;
//
//	@FindBy(id = "searchNow")
//	public WebElement SearchButton;
//
//	@FindBy(xpath = "//label[text()='Direct Flights']")
//	public WebElement DirectFlightsCheckbox;
//
//	@FindBy(xpath = "//input[@value='Traveler, Coach']")
//	public WebElement TravelerSeat;
//
//	@FindBy(xpath = "//input[@type='radio' and @value='6']") 
//	public WebElement FlightClass;
//
//	@FindBy(xpath = "//label[text()='Adult']")
//	public WebElement PassengerCategory;
//
//	@FindBy(xpath = "//button[text()='Done']")
//	public WebElement DoneButton;
//
//	@FindBy(xpath = "//span[text()='Select']")
//	public WebElement SelectFlight;
//
//
//	@FindBy(xpath = "//input[@placeholder='Email Address*']")
//	public WebElement EmailAddress;
//
//	@FindBy(xpath = "//input[@placeholder='First Name*']")
//	public WebElement FirstName;
//
//	@FindBy(xpath = "//input[@placeholder='Last Name*']")
//	public WebElement LastName;
//
//	@FindBy(name = "travelers[0].Month")
//	public WebElement PassengerBirthMonthDropdown;
//
//	@FindBy(name = "travelers[0].Day")
//	public WebElement PassengerBirthDayDropdown;
//
//	@FindBy(name = "travelers[0].Year")
//	public WebElement PassengerBirthYearDropdown;
//
//	@FindBy(id = "travelers[0].Gender.Female")
//	public WebElement PassengerGender;
//
//	@FindBy(xpath = "(//button[text()='Continue to Seats'])[2]")
//	public WebElement ContinueButton;
//
//	@FindBy(xpath = "//li[@data-testid='seat-3A']")
//	public WebElement Seatbtn;
//
//	@FindBy(xpath = "//input[@placeholder='Card Number']")
//	public WebElement cardNumber;
//
//	@FindBy(xpath = "//input[@placeholder='Name on Card']")
//	public WebElement cardName;
//
//	@FindBy(xpath = "//input[@placeholder='MM/YY']")
//	public WebElement expiryDate;
//
//	@FindBy(xpath = "//input[@placeholder='CVV']")
//	public WebElement cvv;
//
//	@FindBy(xpath = "//input[@placeholder='Billing Address']")
//	public WebElement billingAddress;
//
//	@FindBy(xpath = "//input[@placeholder='City']")
//	public WebElement city;
//	
//	@FindBy(xpath = "//input[@placeholder='Country']")
//	public WebElement Country;
//
//
//	@FindBy(xpath = "//input[@placeholder='State']")
//	public WebElement state;
//
//	@FindBy(xpath = "//input[@placeholder='ZIP']")
//	public WebElement Postalcode;
//
//	@FindBy(xpath = "//input[@placeholder='Email']")
//	public WebElement email;
//
//	@FindBy(xpath = "//input[@placeholder='Phone']")
//	public WebElement phone;
//	
//	@FindBy(xpath="//button[@class='btn btn-cta-4th cta-large btn-cta-booking']")
//	public WebElement Confirmbtn;
	
	@FindBy(id = "flights")
	public WebElement flightTab;

	@FindBy(xpath = "//div[@class='select-dropdown Class traveler s__class flights_triptype']")
	public WebElement drop;

	@FindBy(xpath = "(//div[@role='option'])")
	public WebElement trips;

//	@FindBy(xpath="//input[@type='text'][1]")
//	public WebElement from;
//	
//	@FindBy(xpath="//input[@type='text'][2]")
//	public WebElement to;

	@FindBy(id = "fs_originCity_0")
	public WebElement fromplace;

	@FindBy(id = "fs_destCity_0")
	public WebElement to;
	
	@FindBy(xpath = "//input[@placeholder='From where?']")
	public WebElement location;

	@FindBy(xpath = "//input[@class='form-control'][1]")
	public WebElement date;

	@FindBy(xpath = "	//span[@aria-label='11 January 2026']")
	public WebElement dateSelection;

	@FindBy(xpath = "//input[@type='button']")
	public WebElement searchFlight;
}


