package DaddiesBoardShop.application;

import DaddiesBoardShop.Steps.AtPage.AtSearchResultPage;
import DaddiesBoardShop.Steps.AtPage.*;
import DaddiesBoardShop.Steps.InSectionAndMenu.InApplicationHeader;
import DaddiesBoardShop.Steps.InDialogs.InCartDialog;
import DaddiesBoardShop.Steps.InSectionAndMenu.InMyAccNavigationMenu;
import DaddiesBoardShop.Steps.InSectionAndMenu.InPurchaseCategorySection;
import DaddiesBoardShop.Steps.InSectionAndMenu.InProductSection;
import DaddiesBoardShop.Steps.InSectionAndMenu.InPurchaseSortBySection;
import net.thucydides.core.annotations.Steps;

public class User {

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

    @Steps
    public AtLongboardsPage atLongboardsPage;

    @Steps
    public InPurchaseCategorySection inLongboardsCategorySection;

    @Steps
    public InProductSection inProductSection;

    @Steps
    public InPurchaseSortBySection inPurchaseSortBySection;

    @Steps
    public InMyAccNavigationMenu inMyAccNavigationMenu;

    @Steps
    public AtSearchResultPage atSearchResultPage;

    @Steps
    public AtPurchasePage atPurchasePage;

    @Steps
    public InCartDialog inCartDialog;
}
