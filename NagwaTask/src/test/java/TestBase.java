import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
 public static WebDriver driver;
 //Setup the driver and navigate to Nagwa website
@BeforeTest
 public void Setupdriver() throws InterruptedException {
driver = new ChromeDriver();
driver.get("https://www.nagwa.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
// Close the driver
@AfterTest
 public void CloseDriver(){
 driver .quit();
}
}

