package week2.day1;

public class BrowserBase {
	
	public String launchBrowser(String browserName) {
		System.out.println(browserName+" launched successfully");
		return browserName;
	}
	public void loadURL() {
		System.out.println(" Application url loaded successfully");
	}
	public static void main(String[] args) {
		BrowserBase brow1 = new BrowserBase();
		System.out.println(brow1.launchBrowser("Chrome"));
		brow1.loadURL();
	}
}
