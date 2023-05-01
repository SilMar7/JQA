package utils;

import driver.DriverFactory;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class Hooks extends DriverFactory {

    @BeforeClass
    public static void setup() {
        getDriver();
    }

    @AfterClass
    public static void tearDown() {
        closeDriver();
    }
}
