package com.cleartrip.testgrid;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {
	static WebDriver driver;

	public static void getConnection() throws Exception {
		@SuppressWarnings("unused")
		String nodeurl = "http://55.55.53.239:4444/wd/hub";

		DesiredCapabilities desiredcapality = DesiredCapabilities.firefox();
		desiredcapality.setPlatform(Platform.WINDOWS);
		desiredcapality.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, desiredcapality);
		driver.get("http://cleartrip.com");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

	public static void main(String[] args) throws Exception {
		TestGrid.getConnection();
	}
}
