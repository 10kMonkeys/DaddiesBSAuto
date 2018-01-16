package DaddiesBoardShop.Steps;

import DaddiesBoardShop.Pages.LongboardsPage;

public class AtLongboardsPage {

    LongboardsPage onPage;

    public void openLongboardsPage() {
        onPage.open();
    }

    public void getLongBrandList() {
        onPage.checkOmenBrand();
    }
}
