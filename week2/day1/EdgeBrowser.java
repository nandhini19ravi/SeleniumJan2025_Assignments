package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserBase brow2 = new BrowserBase();
		String browser = "Edge";
		String launchEdge = brow2.launchBrowser(browser);
		System.out.println("launchEdge");
		brow2.loadURL();
		
	}

}
