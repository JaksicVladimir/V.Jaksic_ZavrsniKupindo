package tests;

import driver.Driver;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FooterLinksTest extends BaseTest {

    @Test

/* Check links in footer
* Steps*
* 1. Open Chrome driver and navigate to https://www.kupindo.com/
* 2. Click on UniCredit bank link
* 3. Verify that you are on UniCredit site in second tab
* 4. Close the second tab and back to Kupindo page
* 5. Click on AllSecure link
* 6. Verify that you are on AllSecure site in second tab
* 7. Close the second tab and back to Kupindo page
* 8. Click on MasterCard link
* 9. Verify that you are on MasterCard site in second tab
* 10 Close the second tab and back to Kupindo page
* 11. Click on Visa link
* 11. Verify that you are on Visa site in second tab
* 12. Close the second tab and back to Kupindo page
* 13. Click on IPay link
* 14. Verify that you are on IPay site in second tab
* 15. Close the second tab and back to Kupindo page
* 16. Quit Chrome driver
*
*  Expected results:
* The links works and opening the relevant pages in a new tab
*
**/

    public void FooterLinksTest() throws NullPointerException {

//Accept cookies
            if (kupindo.getHomePage().getAcceptCookies() != null) {
                kupindo.getHomePage().click(kupindo.getHomePage().getAcceptCookies());
            }

// Click on UniCredit Bank Link
            kupindo.getHomePage().click(kupindo.getHomePage().getUniCreditLink());
            ArrayList<String> tabs2 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs2.get(1));

//Verify that you are on UniCredit bank page, and then close that tab
            assertTrue(kupindo.getHomePage().getUniCreditLogo().isDisplayed());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs2.get(0));

//Click on AllSecure Link
            kupindo.getHomePage().getAllSecurelink().click();
            ArrayList<String> tabs3 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs3.get(1));

//Verify that you are on AllSecure page, and then close that tab
            assertEquals("https://www.allsecure.rs/", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs3.get(0));

//MasterCard link
            kupindo.getHomePage().getMasterCardLink().click();
            ArrayList<String> tabs4 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs4.get(1));

//Verify that you are on Master card page, and then close that tab
            assertEquals("https://www.mastercard.us/en-us.html", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs4.get(0));

//Visa link
            kupindo.getHomePage().getVisaLink().click();
            ArrayList<String> tabs5 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs5.get(1));

//Verify that you are on Visa page, and then close that tab
            assertEquals("https://rs.visa.com/rs/rs-rs/personal/security/onlineshopping.shtml", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs5.get(0));

//Ipay link
            kupindo.getHomePage().getIpayLink().click();
            ArrayList<String> tabs6 = new ArrayList<String>(Driver.getBrowser().getWindowHandles());
            Driver.getBrowser().switchTo().window(tabs6.get(1));

//Verify that you are on IPay page, and then close that tab
            assertEquals("https://www.ipay.rs/sr/", Driver.getBrowser().getCurrentUrl());

            Driver.getBrowser().close();
            Driver.getBrowser().switchTo().window(tabs5.get(0));
    }
}



