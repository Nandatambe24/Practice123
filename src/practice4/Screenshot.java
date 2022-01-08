/*package practice4;

public class Screenshot {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		File src=((TakeScreenShot)driver).getScreenShot(OutputType.FILE);
		System.out.println(src);
		
		File dest=new File("");
		
		FileHandler.copy(src,dest);
	}

}*/
