package Pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private String ulazButton = "//a[@class = 'log_btn btn btn-success']";
    public WebElement getUlazButton() {
        return findElement(ulazButton);
    }

    private String uniCreditLink = "//li[@class = 'paycard_footer_item paycard_footer_unicredit pull-left']";
    public WebElement getUniCreditLink() {
        return findElement(uniCreditLink);
    }

    private String uniCreditLogo = "//div[@class = 'logo']";
    public WebElement getUniCreditLogo() {
        return findElement(uniCreditLogo);
    }

    private String allSecureLink = "//li[@class = 'paycard_footer_item paycard_footer_allsecure pull-left']";
    public WebElement getAllSecurelink() {
        return findElement(allSecureLink);
    }

    private String masterCardLink = "//li[@class = 'paycard_footer_item paycard_footer_securemaster pull-right']";
    public WebElement getMasterCardLink() {
        return findElement(masterCardLink);
    }

    private String visaLink = "//li[@class = 'paycard_footer_item paycard_footer_vervisa pull-right']";
    public WebElement getVisaLink() {
        return findElement(visaLink);
    }

    private String ipayLink = "//li[@class = 'paycard_footer_item paycard_footer_ipay pull-right']";
    public WebElement getIpayLink() {
        return findElement(ipayLink);
    }

    private String izlazLink = "//a[text()='Izlaz']";
    public WebElement getIzlazLink() {
        return findElement(izlazLink);
    }

    private String traziField = "//input[@id = 'txtPretraga']";
    public WebElement getTraziField() {
        return findElement(traziField);
    }

    private String traziButton = "//button[@id = 'search_button']";
    public WebElement getTraziButton() {
        return findElement(traziButton);
    }

    private String nemaPredmeta = "//div[@class = 'holder_content']";
    public WebElement getNemaPredmeta() {
        return findElement(nemaPredmeta);
    }

    private String kupiOdmahButton = "//button[text()='kupi odmah']";
    public WebElement getKupiOdmahButton() {
        return findElement(kupiOdmahButton);
    }

    private String popupDaljeButton = "//button[@class = 'hopscotch-bubble-close hopscotch-close']";
    public WebElement getPopupDaljeButton() {
        return findElement(popupDaljeButton);
    }

    private String firstItemMetallica = "//div[@id ='container_right']//div[@class='product'][1]//a[@class='item_link']";
    public WebElement getFirstItemMetallica(){
        return findElement(firstItemMetallica);
    }

    private String acceptCookies = "//button[@class = 'close close_info_cookies purple']";
    public WebElement getAcceptCookies (){
        return findElement(acceptCookies);
    }

    private String ulazTitle = "//button[@class = 'close close_info_cookies purple']";
    public WebElement getUlazTitle (){
        return findElement(ulazTitle);
    }

    private String breadCrumb = "//div[@class = 'breadcrumb']";
    public WebElement getBreadCrumb (){
        return findElement(breadCrumb);
    }

    private String clanLink = "//li[@class='header_username m_change']";
    public WebElement getClanLink (){
        return findElement((clanLink));
    }

    private String foundedItem = "//a[@class='item_link']";
    public WebElement getFoundedItem (){
        return findElement((foundedItem));
    }
}
