package nxtwebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fancy-pika-6b453f.netlify.app/");
		driver.manage().window().maximize();
		

	}

}
