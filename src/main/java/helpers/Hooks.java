package helpers;

import driver.DriverFactory;
import org.junit.After;
import org.junit.Before;

public class Hooks extends DriverFactory {

    @Before
    public void setup() {
        getDriver();
    }

    @After
    public void tearDown() {
        closeDriver();
    }
}
