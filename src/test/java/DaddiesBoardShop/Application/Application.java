package DaddiesBoardShop.Application;

import DaddiesBoardShop.Steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class Application {
    
    //1
    
    @Managed
    WebDriver driver;

    @Steps
    public AtCreateAccountPage atCreateAccountPage;

    @Steps
    public AtLoginOrCreateAccPage atLoginOrCreateAccPage;

    @Steps
    public AtMyAccDashboardPage atMyAccDashboardPage;

    @Steps
    public AtHomePage atHomePage;

    @Steps
    public InApplicationHeader inApplicationHeader;
}
 
