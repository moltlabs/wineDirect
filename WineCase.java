public class WineCase
{
    //Field Variables
    private String refNo;
    private String description;
    private int noOfBottles;
    private float price;
    Website website;
    
    //Constructor for winecase object
    public WineCase(String newRefNo, String newDescription, int newNoOfBottles, float newPrice)
    {
        refNo = newRefNo;
        description = newDescription;
        noOfBottles = newNoOfBottles;
        price = newPrice;
    }    
    
    public String toString()
    {
        return "Reference Number: " + refNo + "Description: " + description + "Number of Bottles: " + noOfBottles + "£" + price;
    }
    
    //Suitable Accessor Methods.
    public String getRefNo()
    {
        return refNo;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getNoOfBottles()
    {
        return noOfBottles;
    }
    
    public float getPrice()
    {
        return price;
    }
}
