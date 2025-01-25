package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driverFB = new ChromeDriver();
		driverFB.get("https://www.facebook.com/");
		String title1 = driverFB.getTitle();
		System.out.println(title1);
		driverFB.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driverFB.manage().window().maximize();
		driverFB.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driverFB.findElement(By.name("pass")).sendKeys("Tuna@321");
		driverFB.findElement(By.name("login")).click();
		String title2 = driverFB.getTitle();
		System.out.println(title2);
		driverFB.findElement(By.linkText("Find your account and log in.")).click();
		String title3 = driverFB.getTitle();
		System.out.println(title3);
	}
}
