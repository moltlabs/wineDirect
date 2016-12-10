import java.util.Random;
public class Website
{
    //Field Variables
    private int hits;
    private float salesTotal;
    Browser browser;
   
    //Constructor for website object
    public Website()
    {
        hits = 0; 
        salesTotal = 0;
    } 
    
    //Suitable Accessor Methods
    public int getHits()
    {
        return hits;
    }    
    
    public float getSalesTotal()
    {
        return salesTotal;
    }    
    
    //Allows a browser object to be passed so the browser can log in.
    public void buyerLogin(Browser browser)
    {
        System.out.println("Wine Direct welcomes buyer " + browser.getId() + ", you are now logged in.");
        browser.setWebsite(this);
        hits += 1;
    }    
    
    //Allows the browser to become a buyer after it is checked that they are a suitable age
    public void becomeBuyer(Browser browser)
    {
        if (2016 - browser.getYearOfBirth() > 18)
        {
            Random rng = new Random();
            browser.setId(rng.nextInt());
            browser.setBuyerStatus(true);
            buyerLogin(browser);
        }    
        else 
        {
            System.out.println("You are not old enough to purchase alcohol");
        }
    }  
    
    //Fetches the wine that the browser has chosen, checks if a discount is available and outputs an appropriate price as well as a message to say that the transaction was completed successfully.
    public void checkout(Browser browser)
    {
        WineCase wineCase = browser.getWineCase();
        if (checkHitDiscount() == true)
        {
            salesTotal += wineCase.getPrice() - (wineCase.getPrice()/10);
            System.out.println("Congratulations your transaction was completed successfully");
        }
        else
        {
            salesTotal += wineCase.getPrice();
            System.out.println("Congratulations your transaction was completed successfully");
        }
    }
    
    //Checks whether there is a discount available by calculating if the user is a 10th user or not.
    public boolean checkHitDiscount()
    {
        if (hits % 10 == 0)
        {
            System.out.println("Congratulations there is a 10% discount available to you");
            return true;
        }    
        else 
        { 
            System.out.println("Your transaction was completed successfully.");
        }
        return false;
    }
    
    public void logout()
    {
        browser.setWebsite(null);
    }
}
