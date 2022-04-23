package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import resources.Base;

public class ThreeTest extends Base {
	public WebDriver driver;
	@Test
	public void testThree() throws IOException, InterruptedException {
		System.out.println("Vishnu has updated this code with this statment");
		System.out.println("push this code in to gbranch");
		driver=initializeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(3000);
		Assert.assertTrue(false);
		driver.close();
	}
}
