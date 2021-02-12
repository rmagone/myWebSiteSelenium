package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Environment {
    static EnvironmentFactory environmentFactory = new EnvironmentFactory();
    public static WebDriver driver;

    public static WebDriver setupBrowser() {

        switch (environmentFactory.getBrowser()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                return driver;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new ChromeDriver();
                return driver;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new ChromeDriver();
                return driver;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new ChromeDriver();
                return driver;
            default:
                throw new Error("Browser not found");
        }
    }

}
