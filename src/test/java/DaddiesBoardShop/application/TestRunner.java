package DaddiesBoardShop.application;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public abstract class TestRunner {

    @Managed
    WebDriver driver;

    @Steps
    public User user;

    @Before
    public void start() {
    }
}
 