package DaddiesBoardShop.Pages;

import DaddiesBoardShop.Model.MyRegisteredCustomer;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
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

    @Step
    public void openMyAccDashboardPage() {
        open();
    }

    @Step
    public void finishRegMessageIsDisplayed() {
        Assert.assertTrue(finishRegMessage.isDisplayed());
    }

    @Step
    public String getHelloCustomerMessageText() {
        return helloRegCustomerMessage.getText();
    }

    @Step
    public String getCustomerDataText() {
        return customerData.getText();
    }

    @Step
    public void checkHelloCustomMessage(String firstName, String lastName) {
        Assert.assertEquals("Hello, " + firstName + " " + lastName + "!", getHelloCustomerMessageText());
    }

    @Step
    public void checkCustomerData(String firstName, String lastName, String emailAddress) {
        Assert.assertTrue(getCustomerDataText().contains(firstName));
        Assert.assertTrue(getCustomerDataText().contains(lastName));
        Assert.assertTrue(getCustomerDataText().contains(emailAddress));
    }

    @Step
    public void checkJustRegCustomer() {
        finishRegMessageIsDisplayed();

        checkHelloCustomMessage(CreateAccountPage.justRegCustomer.getFirstName(),
                CreateAccountPage.justRegCustomer.getLastName());

        checkCustomerData(CreateAccountPage.justRegCustomer.getFirstName(),
                CreateAccountPage.justRegCustomer.getLastName(),
                CreateAccountPage.justRegCustomer.getEmailAddress());
    }

    @Step
    public void checkRegCustomer() {
        checkHelloCustomMessage(customer.getFirstName(), customer.getLastName());

        checkCustomerData(customer.getFirstName(),
                customer.getLastName(),
                customer.getEmailAddress());
    }
}

