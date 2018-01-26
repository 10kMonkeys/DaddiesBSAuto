package DaddiesBoardShop.Pages.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageObject {

    public BasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



}
