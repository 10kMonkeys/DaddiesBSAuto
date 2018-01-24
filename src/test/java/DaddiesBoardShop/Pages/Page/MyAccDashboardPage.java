package DaddiesBoardShop.Pages.Page;

import DaddiesBoardShop.Model.MyRegisteredCustomer;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.daddiesboardshop.com/customer/account/")
public class MyAccDashboardPage extends BasePage {

    public MyAccDashboardPage(WebDriver driver) {
        super(driver);
    }

    MyRegisteredCustomer customer = new MyRegisteredCustomer();

    @FindBy(css = "li.success-msg")
    public WebElement finishRegMessage;

    @FindBy(css = "div.welcome-msg h2.sub-title")
    public WebElement helloRegCustomerMessage;

    @FindBy(css = "p.box-content")
    public WebElement customerData;

    public void openMyAccDashboardPage() {
        open();
    }

    public void finishRegMessageIsDisplayed() {
        Assert.assertTrue(finishRegMessage.isDisplayed());
    }

    public String getHelloCustomerMessageText() {
        return helloRegCustomerMessage.getText();
    }

    public String getCustomerDataText() {
        return customerData.getText();
    }

    public void checkHelloCustomMessage(String firstName, String lastName) {
        Assert.assertEquals("Hello, " + firstName + " " + lastName + "!", getHelloCustomerMessageText());
    }

    public void checkCustomerData(String firstName, String lastName, String emailAddress) {
        Assert.assertTrue(getCustomerDataText().contains(firstName));
        Assert.assertTrue(getCustomerDataText().contains(lastName));
        Assert.assertTrue(getCustomerDataText().contains(emailAddress));
    }

    public void checkJustRegCustomer() {
        finishRegMessageIsDisplayed();

        checkHelloCustomMessage(CreateAccountPage.justRegCustomer.getFirstName(),
                CreateAccountPage.justRegCustomer.getLastName());

        checkCustomerData(CreateAccountPage.justRegCustomer.getFirstName(),
                CreateAccountPage.justRegCustomer.getLastName(),
                CreateAccountPage.justRegCustomer.getEmailAddress());
    }

    public void checkRegCustomer() {
        checkHelloCustomMessage(customer.getFirstName(), customer.getLastName());

        checkCustomerData(customer.getFirstName(),
                customer.getLastName(),
                customer.getEmailAddress());
    }
}

