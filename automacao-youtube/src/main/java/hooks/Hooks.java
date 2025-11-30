package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import util.DriverFactory;
import util.Util;

public class Hooks {

    @Before
    public void setUp() {
        DriverFactory.getDriver(); // inicia o driver
        Util.openWeb("https://www.youtube.com");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
