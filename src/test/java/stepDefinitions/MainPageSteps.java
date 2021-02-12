package stepDefinitions;

import io.cucumber.java.en.Given;

public class MainPageSteps extends BaseSteps {

    @Given("do something")
    public void doSomething() throws InterruptedException {
        driver.get("http://www.google.com");
        Thread.sleep(5000);
    }
}
