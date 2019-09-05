package Presentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRegisteration {

	public static void main(String[] args) {

		System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\v-2anjna\\eclipse-workspace\\PresentationDemo\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Manish");
		driver.findElement(By.name("lastName")).sendKeys("Puri");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("address1")).sendKeys("Adactin group");
		driver.findElement(By.name("address2")).sendKeys("Parramatta");
		driver.findElement(By.name("city")).sendKeys("Parramatta");
		driver.findElement(By.name("state")).sendKeys("NSW");
		driver.findElement(By.name("postalCode")).sendKeys("2144");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("AUSTRALIA");
		driver.findElement(By.name("register")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
		
		//driver.close();
		//driver.quit();
		
		
		
	}

}
