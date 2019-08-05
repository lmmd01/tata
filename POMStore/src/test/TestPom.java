package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import excel.Excel;

public class TestPom {

	WebDriver driver;
	Excel excel;

	@BeforeTest
	public void setup() {

		// Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PCDUARTE01\\Desktop\\TATA\\ECLIPSE\\ZIP\\chromedriver.exe");

		driver = new ChromeDriver();
		excel = new Excel(driver);

		// Open the webpage
		driver.get("http://automationpractice.com");

		// Maximize browser
		//driver.manage().window().maximize();
	}

	@Test
	public void testMail() {
		try {
			// Add item
			excel.getDataTest("T2");
			// Login into account
			excel.getDataTest("T1");
			// Comlete shoppig
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
