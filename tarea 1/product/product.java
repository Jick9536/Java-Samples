
/**
 * Product
 * 
 * @author (@jick) 
 * @version (0.01)
 */
public class product
{
    // instance variables - replace the example below with your own
    public String name;
    private double price;
    private int count;
    public int total_cost;
    
    /**
     * Default Constructor for objects of class product
     */
    public product()
    {
        // initialise instance variables
        this(" ",0,0);
    }
    
     /**
     *  Variable constructor for objects of class product
     *  
     *  @param Nprice price per unit
     *  @param units number of prodcuts avaiable
     *  @param Nname name of the prodcut
     */
    public product(String Nname, double Nprice, int units)
    {
        name=Nname;
        price=Nprice;
        count=units;
        total_cost=0;
    }
    
    /**
     * get price obtain the price per unit
     * 
     * 
     * @return price per unit 
     */
    public double get_price()
    {
        return price;
    }
    
    /**
     * get the number of items aviable
     * 
     * 
     * @return price per unit 
     */
    public double get_count()
    {
        return count-total_cost;
    }
    
    /**
     * set price obtain the price per unit
     * 
     * 
     * @param price per unit 
     */
    public void set_price(int Nprice)
    {
        price=Nprice;
    }
    
    /**
     * set the numbers of items avaible
     * 
     * 
     * @param number of incoming items 
     */
    public void set_count(int Nitem)
    {
        count=Nitem;
        total_cost=0;
    }
    
      
    /**
     * buy one product unit
     * 
     * 
     * @return 0 if there aren't product units aviable
     * @return price of one unit
     */
    
    public double buy()
    {
        if(this.get_count()>=1)
        {
            total_cost++;
            System.out.println("purchase made successfully with a cost of "+this.get_price());
            return this.get_price();
        }
        else
        {
            System.out.println("Insufficient units to make your purchase");
            return 0;
        }
    }
    
    
    /**
     * buy several product unit
     * @precon units should greater than 0
     * 
     * @param units: Number of units you want to buy
     * 
     * @return 0 if there aren't product units aviable
     * @return total price of the purchase
     */
    
    public double buy(int units)
    {
        if(units<=get_count())
        {
            total_cost+=units;
            System.out.println("purchase made successfully with a cost of "+units*this.get_price());
            return units*this.get_price();
        }
        else
        {
            System.out.println("insufficient units to make your purchase");
            return 0;
        }
    }
    
    /** Print info related to one prodcut**/
    public void printinfo()
    {
        System.out.println("Name: "+name+"Price per unit: "+this.get_price()+"Product aviable"+this.get_count());
    }
    
    /**method void rent**/
    public double rent (int days)
    {
        return 0;
    }
}
