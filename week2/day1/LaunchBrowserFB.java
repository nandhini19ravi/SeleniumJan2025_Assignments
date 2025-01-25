package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driverFB = new ChromeDriver();
		driverFB.get("https://www.facebook.com/");
		driverFB.manage().window().maximize();
		Thread.sleep(20000);
		System.out.println(driverFB.getTitle());
		//driverFB.close();
		
	}

}
