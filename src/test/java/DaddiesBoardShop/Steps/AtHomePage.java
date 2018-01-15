package DaddiesBoardShop.Steps;

import DaddiesBoardShop.Pages.HomePage;
import net.thucydides.core.annotations.Step;


public class AtHomePage {

    HomePage onPage;

    @Step
    public void openLongboardCategory() {
        onPage.openLongboardsCategory();
    }
}
