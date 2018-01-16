package DaddiesBoardShop.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

@DefaultUrl("https://www.daddiesboardshop.com/longboards")
public class LongboardsPage extends PageObject {

    List<WebElement> brandList = getDriver().findElements(By.cssSelector("div#Brand_content ol"));

    @Step
    public void openLongboardsPage() {
        open();
    }

    @Test
    public void getLongBrandList() {

        for(int i = 0; i < brandList.size(); i++) {
            System.out.println(brandList.get(i));
        }
    }
}
