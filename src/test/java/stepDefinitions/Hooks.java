package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import setup.Environment;

public class Hooks {
    Environment env = new Environment();
    WebDriver driver;

    @Before
    public void setupBrowser() {
        driver = Environment.setupBrowser();
    }

    @After
    public void cleanUpBrowser() {
        driver.quit();

    }
}
