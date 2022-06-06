package tests;

import driver.Driver;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest {

/*  *Login with valid username and password
 *Steps:
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. Click on ULAZ button and verify that you are on Prijava page
 * 3. Click on KORISNICKO IME field and enter valid username
 * 4. Click on LOZINKA field and enter valid password
 * 5. Click on ULAZ button
 * 6. Verify that user is logged in
 * 7. Click on IZLAZ link
 * 8. Verify that user is logged out
 *
 * Expected results:
 * User is logged in, and then logged out
 */

    @Test

    public void LoginWithValidCredentialsAndLogoutTest() {

//Open Chrome driver and navigate to https://www.kupindo.com/
            assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());

//Click on ULAZ Button
            kupindo.getHomePage().click(kupindo.getHomePage().getUlazButton());
            assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());

//Enter valid user name and password
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

//Verify that user is logged in
            assertEquals("https://www.kupindo.com/", Driver.getBrowser().getCurrentUrl());
            assertTrue(kupindo.getHomePage().getIzlazLink().isDisplayed());
            assertTrue(kupindo.getHomePage().getClanLink().isDisplayed());
            assertTrue(kupindo.getHomePage().getClanLink().isEnabled());

//Click on IZLAZ link and logout
            kupindo.getHomePage().click(kupindo.getHomePage().getIzlazLink());

//Verify that user is logged out
            assertEquals("https://www.kupindo.com/Odjava", Driver.getBrowser().getCurrentUrl());
            assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
    }


/*  *Try to login with invalid credentials
 *Steps:
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. Click on ULAZ button and verify that you are on Prijava page
 * 3. Click on KORISNICKO IME field and enter invalid username
 * 4. Click on LOZINKA field and enter invalid password
 * 5. Click ULAZ button
 * 6. Verify that you are on Prijava page and not logged in
 * Expected results:
 * User is not logged in
 */

    @Test

    public void TryToLoginWithInvalidCredentialsTest() {

//Click on ULAZ Button
            kupindo.getHomePage().click(kupindo.getHomePage().getUlazButton());
            assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());

//Enter invalid user name and password
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("1234");

            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("1234");

//Click on ULAZ button and verify that user is not logged in and that you are on Prijava page
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

            assertTrue(kupindo.getPrijavaPage().getPogresnoKorisnickoImeIliLozinka().isDisplayed());
    }



/*  *Try to login with valid user name and invalid password
 *Steps:
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. Click on ULAZ button and verify that you are on Prijava page
 * 3. Click on KORISNICKO IME field and enter valid username
 * 4. Click on LOZINKA field and enter invalid password
 * 5. Click ULAZ button
 * 6. Verify that you are on Prijava page and not logged in
 * Expected results:
 * User is not logged in
 */


    @Test

    public void TryToLoginWithValidUserNameAndInvalidPasswordTest() {

            assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
            assertTrue(kupindo.getHomePage().getUlazButton().isEnabled());

//Click on ULAZ Button
            kupindo.getHomePage().click(kupindo.getHomePage().getUlazButton());
            assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());

//Enter valid user name and invalid password
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");

            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("1234");

//Click on ULAZ button and verify that user is not logged in and that you are on Prijava page
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

            assertTrue(kupindo.getPrijavaPage().getPogresnoKorisnickoImeIliLozinka().isDisplayed());
    }



/*  *Try to login with invalid user name and valid password
 *Steps:
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. Click on ULAZ button and verify that you are on Prijava page
 * 3. Click on KORISNICKO IME field and enter invalid username
 * 4. Click on LOZINKA field and enter valid password
 * 5. Click ULAZ button
 * 6. Verify that you are on Prijava page and not logged in
 * Expected results:
 * User is not logged in
 */

    @Test

    public void TryToLoginWithInvalidUserNameAndValidPasswordTest() {

        assertTrue(kupindo.getHomePage().getUlazButton().isDisplayed());
        assertTrue(kupindo.getHomePage().getUlazButton().isEnabled());

//Click on ULAZ Button
        kupindo.getHomePage().click(kupindo.getHomePage().getUlazButton());
        assertEquals("https://www.kupindo.com/Prijava", Driver.getBrowser().getCurrentUrl());

//Enter invalid user name and valid password
        kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
        kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("1234");

        kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
        kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");

//Click on ULAZ button and verify that user is not logged in and that you are on Prijava page
        kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

        assertTrue(kupindo.getPrijavaPage().getPogresnoKorisnickoImeIliLozinka().isDisplayed());
    }
}
