package DaddiesBoardShop.Application;

import DaddiesBoardShop.Steps.AtPage.*;
import DaddiesBoardShop.Steps.InSectionAndMenu.InApplicationHeader;
import DaddiesBoardShop.Steps.InSectionAndMenu.InLongboardsCategorySection;
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
    public InLongboardsCategorySection inLongboardsCategorySection;

    @Steps
    public InProductSection inProductSection;

    @Steps
    public InPurchaseSortBySection inPurchaseSortBySection;

}
