package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_Select {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("NandhiniR");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select sel = new Select(industry);
		sel.selectByValue("IND_SOFTWARE");
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select sel2 = new Select(ownership);
		sel2.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sel3 = new Select(source);
		sel3.selectByValue("LEAD_EMPLOYEE");
		WebElement marke = driver.findElement(By.name("marketingCampaignId"));
		Select sel4 = new Select(marke);
		sel4.selectByIndex(5);
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel5 = new Select(state);
		sel5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement accountName = driver.findElement(By.xpath("//span[contains(text(),'NandhiniR')]"));
		//driver.close();
		
}
}
