package tests;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListaZeljaTest extends BaseTest{

    @Test

/* Choose chepest item in OPREMA ZA PECANJE, put it in LISTA ZELJA (CART),
    verify that is in LISTA ZELJA. REMOVE item from LISTA ZELJA, and verify that is removed.
 * Steps*
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. Login with valid credentials
 * 3. Click on "Sportska oprema" link
 * 4. Click on "Oprema za pecanje" link
 * 5. Chose from filter menu "po ceni rastuce" (price low to high)
 * 6. Click on first item and verify that is puted in "Lista zelja"
 * 7. Click on "Lista zelja" link, and remove item
 * 8. Verify that item is removed from "Lista zelja"
 * 9. Quit Chrome driver
 *
 *  Expected results:
 * Item is puted in "Lista zelja (CART), and then removed
 **/

    public void ListaZeljaTest (){

//Login with valid credentials
            kupindo.getHomePage().getUlazButton().click();
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getKorisnickoImeField());
            kupindo.getPrijavaPage().getKorisnickoImeField().sendKeys("zastava");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getLozinkaField());
            kupindo.getPrijavaPage().getLozinkaField().sendKeys("abarth");
            kupindo.getPrijavaPage().click(kupindo.getPrijavaPage().getUlazPrijavaButton());

//Accept cookies
            if (kupindo.getHomePage().getAcceptCookies() != null) {
                kupindo.getHomePage().click(kupindo.getHomePage().getAcceptCookies());
            }
//Click on Sportska oprema, click on Oprema za pecanje
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getSportskaOpremaLink());
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getOpremaZaPecanje());

//Choose from filter menu "Po ceni rastuci" (Price low to high), and click on first item
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getCenaRastuci());
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getFirstItem());

//Put the item in "Lista zelja". Verify that item is in "Lista Zelja" (CART)
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getUbaciUListuZeljaButton());
            assertTrue(kupindo.getSportskaOpremaPage().getListaZeljaBadge().isDisplayed());
            assertTrue(kupindo.getSportskaOpremaPage().getListaZeljaBadge().isEnabled());
            String actualBadgeString = kupindo.getSportskaOpremaPage().getListaZeljaBadge().getText();
            String expectedBadgeString = "1";
            assertTrue(actualBadgeString.equals(expectedBadgeString));

            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getListaZeljaLink());

//Remove from "Lista zelja" and verify that is removed
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getSkiniSaListeButton());
            kupindo.getSportskaOpremaPage().click(kupindo.getSportskaOpremaPage().getDaButton());

            String actualString = kupindo.getSportskaOpremaPage().getItemsInListaZelja().getText();
            String expectedString = "(0)";
            assertTrue(actualString.equals(expectedString));
    }
}
