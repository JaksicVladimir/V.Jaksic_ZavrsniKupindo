package Pages;

public class Kupindo {

    private HomePage homePage;
    private PrijavaPage prijavaPage;
    private SportskaOpremaPage sportskaOpremaPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public PrijavaPage getPrijavaPage() {
        if (prijavaPage == null) {
            prijavaPage = new PrijavaPage();
        }
        return prijavaPage;
    }

    public SportskaOpremaPage getSportskaOpremaPage() {
        if (sportskaOpremaPage == null) {
            sportskaOpremaPage = new SportskaOpremaPage();
        }
        return sportskaOpremaPage;
    }

}

