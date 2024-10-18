package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Suggestionexample {

	WebDriver driver;
	WebDriverWait wait;
	ChromeOptions Co;

	public void suggestionexample() {

		Co = new ChromeOptions();
		// Co.addArguments("--headless");
		driver = new ChromeDriver(Co);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void dropdownexample() {

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select select = new Select(dropdown);
		select.selectByIndex(1);

		WebElement selectedoption = select.getFirstSelectedOption();

		if (selectedoption.getText().equals("Option1")) {
			System.out.println("Dropdown is selected" + selectedoption.getText());
		}

		else {
			System.out.println(" Dropdown is not selected ");
		}

	}
	
	
	

	public void teardown() {

		driver.quit();
	}

	public static void main(String[] args) {

		Suggestionexample exam = new Suggestionexample();

		exam.suggestionexample();
		exam.dropdownexample();
		exam.teardown();

	}

}
