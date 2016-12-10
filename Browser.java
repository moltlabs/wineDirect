import java.util.ArrayList;
/**
 * myWine Program Homework 3
 * Harry Morgan Workshop Group 4 Year 1
 */

public class Browser
{
    //Field Variables Declared
    private int yearOfBirth;
    private String email;
    private int iD;
    private boolean isBuyer;
    private ArrayList<WineCase> Basket;
    WineCase wineCase;
    Website website;
    
    //Constructor for users already with an ID
    public Browser(int newYearOfBirth, String newEmail, int newId)
    {
        yearOfBirth = newYearOfBirth;
        email = newEmail;
        iD = newId;
        isBuyer = true;
        website = null;
        wineCase = null;
        Basket = new ArrayList<WineCase>();
    }
    
    //Constructor for users without an ID
    public Browser(int newYearOfBirth, String newEmail)
    {
        yearOfBirth = newYearOfBirth;
        email = newEmail;
        iD = 123;
        isBuyer = false;
        website = null;
        wineCase = null;
    }
    
    //Suitable Accessor methods.
    public int getId()
    {
        return iD;
    }    
    
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }    
    
    public String getEmail()
    {
        return email;
    }   
    
    //Sets the buyer status to true after another method has verified that the user is a suitable age/
    public void setBuyerStatus(boolean newLogin)
    {
        isBuyer = newLogin;
    }    
    
    //sets the ID for users without one.
    public void setId(int newId)
    {
        iD = newId;
    }    
    
    //Lets the browser select a winecase object provided they are old enough to buy one/
    public void selectWineCase(WineCase selectedWine)
    {
        if (isBuyer == true)
        {
            Basket.add(wineCase);
            System.out.println("Buyer " + iD + " has selected wine case ref number " + wineCase.getRefNo() + " of " + wineCase.getNoOfBottles() + " " + wineCase.getDescription() + " at £" + wineCase.getPrice());
        }    
        else 
        {
            System.out.println("You must be authorised to purchase wine before selecting a wine case");
        }
    } 
    
    public void showBasket()
    {
        int listPosition = 0;
        while( listPosition<6 )
        {
            WineCase.toString(listPosition);
            listPosition++;
        }
    }
    
    //Sets the field website equal to the website the browser is using.
    public void setWebsite(Website newWebsite) 
    {
        website = newWebsite;
    }
    
    //Allows the user to pay for wine.
    public void payForWine()
    {
        if (wineCase != null)
        {
            website.checkout(this);
        }
        else 
        {
            System.out.println("You must first select a winecase to purchase");
        }
    }
    
    public WineCase getWineCase()
    {
        return wineCase;
    }
}






