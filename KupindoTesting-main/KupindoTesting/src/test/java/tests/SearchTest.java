package tests;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SearchTest extends BaseTest {

/* Type "metallica" in TRAZI (Search) field, click on first item and try to purchase without logging in
 * Steps*
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. In TRAZI field type "metallica"
 * 3. Click on TRAZI button
 * 4. Click on first item
 * 5. Click on KUPI ODMAH (BUY NOW) button
 * 6. Verify that you are on Prijava page
 *  Expected results:
 * Back on Prijava page, and ask for valid credentials
 **/

    @Test

    public void SearchAndTryToPurchaseWithoutLoginTest() throws NullPointerException {

//Type in TRAZI field type "metallica"
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziField());
            kupindo.getHomePage().getTraziField().sendKeys("metallica");
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziButton());

            String actualString = kupindo.getHomePage().getBreadCrumb().getText();
            String expectedString = "metallica";
            assertTrue(actualString.contains(expectedString));

//Try to purchase first item without logging in
            kupindo.getHomePage().click(kupindo.getHomePage().getFirstItemMetallica());

            if (kupindo.getHomePage().getPopupDaljeButton() != null) {
                kupindo.getHomePage().click(kupindo.getHomePage().getPopupDaljeButton());
            }

            kupindo.getHomePage().click(kupindo.getHomePage().getKupiOdmahButton());

//Verify that you are on Prijava page, and asked for valid credentials
            assertTrue(kupindo.getHomePage().getUlazTitle().isDisplayed());
    }


/* Type something random without meaning in TRAZI field and try to find items
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. Type something random without meaning in TRAZI field
 * 3. Verify that no items were found
 * Expected results:
 * No items were found
 */

    @Test

    public void TryToTypeInSearchRandomWithoutMeaningTest() {

//Try to search
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziField());
            kupindo.getHomePage().getTraziField().sendKeys("asdfgnnsdlmaeofjldv");
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziButton());

//Verify that no items were found
            String actualString = kupindo.getHomePage().getNemaPredmeta().getText();
            String expectedString = "Trenutno nema predmeta";
            assertTrue(actualString.contains(expectedString));
    }
}