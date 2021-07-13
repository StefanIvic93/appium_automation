package testPackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class baseAppium {

	public static void main(String[] args) throws MalformedURLException {

		File file = new File("src/main/java/");
		File fileS = new File(file, "ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "stefanEmulator");
		cap.setCapability(MobileCapabilityType.APP, fileS.getAbsolutePath());

		AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);


	}
}