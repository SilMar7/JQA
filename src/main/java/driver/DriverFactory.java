package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();
    private static String browserType = "Chrome";

    public static WebDriver getDriver(){
        if(webDriver.get() == null){
            webDriver.set(createDriver());
        }
        return webDriver.get();
    }

    private static WebDriver createDriver(){
        WebDriver driver = null;

        switch(browserType.toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

        }

        driver.manage().window().maximize();
        return driver;
    }

    public static void closeDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }
}