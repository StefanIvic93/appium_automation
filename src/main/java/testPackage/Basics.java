package testPackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends BaseAndroidDriver {

	@Test
	public void basics() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// xpath id className, androidUIAutomator

		// xpath syntax
		// tagName[@atribute='value']

		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
		driver.findElementsByClassName("android.widget.Button").get(2).click();

	}
}
