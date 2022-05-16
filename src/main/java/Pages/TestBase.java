package Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public static WebDriver driver;
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// driver.get("https://www.cnn.com/?refresh=1");
		//driver.get("https://techfios.com/billing/?ng=dashboard/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	public void takeScreenshot(WebDriver driver) throws  IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceFile =	ts.getScreenshotAs(OutputType.FILE);
	SimpleDateFormat formatter = new SimpleDateFormat("MMDDYY_HHMMSS");
	Date date = new Date();
	String label = formatter.format(date);
	
	
		//FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "/screenshot/" + ".png"));
	FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+"/screenshot/"+label+ ".png"));
	}
}
