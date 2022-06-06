package tests;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SearchItemNameTest extends BaseTest{


/* Type "METALLICA - McFarlane figure METALIKA" in TRAZI (Search) field
 * Steps*
 * 1. Open Chrome driver and navigate to https://www.kupindo.com/
 * 2. In TRAZI field type "METALLICA - McFarlane figure METALIKA"
 * 3. Click on TRAZI button
 * 4. Verify that the found item has exactly the same name as the typed
 *  Expected results:
 *  The found item has exactly the same name as the typed one
 **/

    @Test

    public void SearchItemNameTest (){

//Type "METALLICA - McFarlane figure METALIKA" in TRAZI field
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziField());
            kupindo.getHomePage().getTraziField().sendKeys("METALLICA - McFarlane figure METALIKA");
            kupindo.getHomePage().click(kupindo.getHomePage().getTraziButton());

//Verify that the found item has exactly the same name as the typed
            kupindo.getHomePage().getFoundedItem().getText();
            String actualString = kupindo.getHomePage().getFoundedItem().getText();
            String expectedString = "METALLICA - McFarlane figure METALIKA";
            assertTrue(actualString.contains(expectedString));
    }
}
