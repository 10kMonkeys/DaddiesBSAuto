package DaddiesBoardShop.Application;

import DaddiesBoardShop.Steps.*;
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
}
