package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver fpk = new ChromeDriver();
		fpk.get("https://www.flipkart.com/");
		String title1 = fpk.getTitle();
		fpk.findElement(By.xpath("//span[text()='Login']")).click();
		fpk.findElement(By.xpath("//input[contains(@class,'r4vIwl')]")).sendKeys("7708883735");
		
	}

}
