// Make each check independant

// Say what you are testing in comments 

// ~144 lines

public class Test
{
    // Given to the students
    
    public Test()
    {
        // Creates Website, Browser and Winecase object, logs the browser in, selects a winecase and checkout.
        //Website website = new Website();
        //Browser browser = new Browser(1963, "d.smith@edu.salford.ac.uk", 6789);
        //WineCase wineCase = new WineCase("RH-5675", "chablis", 12, 200);
        //website.buyerLogin(browser);
        //browser.selectWineCase(wineCase);
        //browser.payForWine();
        
        
        //Same as previous test however in this test the browser does not have an Id.
        //Website website = new Website();
        //Browser browser = new Browser(1963, "d.smith@edu.salford.ac.uk");
        //WineCase wineCase = new WineCase("RH-5675", "chablis", 12, 200);
        //website.buyerLogin(browser);
        //browser.selectWineCase(wineCase);
        //browser.payForWine();
        
        //This is a test where the browser is not old enough to purchase wine. Theyre age is less than 18
        //Website website = new Website();
        //Browser browser = new Browser(1999, "d.smith@edu.salford.ac.uk", 6789);
        //WineCase wineCase = new WineCase("RH-5675", "chablis", 12, 200);
        //website.buyerLogin(browser);
        //browser.selectWineCase(wineCase);
        //browser.payForWine();
        
        //This test logs the browser in but does not select a wineCase.
        //Website website = new Website();
        //Browser browser = new Browser(1963, "d.smith@edu.salford.ac.uk", 6789);
        //WineCase wineCase = new WineCase("RH-5675", "chablis", 12, 200);
        //website.buyerLogin(browser);
        //browser.payForWine();
        
        //This test the browser attempts to select a wineCase without first logging in.
        //Website website = new Website();
        //Browser browser = new Browser(1963, "d.smith@edu.salford.ac.uk", 6789);
        //WineCase wineCase = new WineCase("RH-5675", "chablis", 12, 200);
        //browser.selectWineCase(wineCase);
        //browser.payForWine();
        
        //This tests wether the price of the wine is added on to the websites sales total. Aswell as a hit has
        //been added.
        //Website website = new Website();
        //Browser browser = new Browser(1963, "d.smith@edu.salford.ac.uk", 6789);
        //WineCase wineCase = new WineCase("RH-5675", "chablis", 12, 200);
        //website.buyerLogin(browser);
        //browser.selectWineCase(wineCase);
        //browser.payForWine();
        //System.out.println(website.getSalesTotal());
        //System.out.println(website.getHits());
        // You need code here to test other methods such as payForWine() etc etc

        

        
    }

}