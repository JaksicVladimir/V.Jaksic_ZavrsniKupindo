package Pages;

import org.openqa.selenium.WebElement;

public class SportskaOpremaPage extends BasePage {

    private String sportskaOpremaLink = "//a[contains(text(),'Sportska oprema')]";
    public WebElement getSportskaOpremaLink() {
        return findElement(sportskaOpremaLink);
    }

    private String opremaZaPecanje = "//a[contains(text(),'Oprema za pecanje')]";
    public WebElement getOpremaZaPecanje() {
        return findElement(opremaZaPecanje);
    }

    private String cenaRastuci = "//option[contains(text(), 'ceni rast')]";
    public WebElement getCenaRastuci (){
        return findElement(cenaRastuci);
    }

    private String firstItem = "//div[@id='container_right']//div[@class='product'][1]//a[@class='item_link']";
    public WebElement getFirstItem(){
        return findElement(firstItem);
    }

    private String ubaciUListuZeljaButton = "//button[@class = 'btn btn-default btn-sm btn_padding']";
    public WebElement getUbaciUListuZeljaButton(){
        return findElement (ubaciUListuZeljaButton);
    }

    private String listaZeljaLink = "//a[@class='badge']//parent::li[@class='notification wishlist_notification']//preceding-sibling::li/a[text()='Lista želja']";
    public WebElement getListaZeljaLink(){
        return findElement(listaZeljaLink);
    }

    private String listaZeljaBadge = "//a[@class = 'badge']";
    public WebElement getListaZeljaBadge() {
        return findElement(listaZeljaBadge);
        }

    private String skiniSaListeButton = "//a[@class = 'delete']";
    public WebElement getSkiniSaListeButton() {
        return findElement(skiniSaListeButton);
    }

    private String daButton = "//button[@id = 'btnConfirm']";
    public WebElement getDaButton () {
        return findElement(daButton);
    }

    private String itemsInListaZelja = "//ul[@class='category_menu'][3]//li//a//em";
    public WebElement getItemsInListaZelja () {
        return findElement(itemsInListaZelja);
    }
}

