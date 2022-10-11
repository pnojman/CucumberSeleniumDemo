package initialization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialization {
	
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setWebDriver(ThreadLocal<RemoteWebDriver> driver, String browserName) {

       if (browserName.equalsIgnoreCase("Chrome")) {

           WebDriverManager.chromedriver().setup();
           driver.set(new ChromeDriver());

       } else if (browserName.equalsIgnoreCase("Firefox")) {

           WebDriverManager.firefoxdriver().setup();
           driver.set(new FirefoxDriver());
       }

       getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }


}
