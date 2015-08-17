
/**
 * subclass game inheritate product
 * 
 * @author julio rodríguez martínez 
 * @version 0.01
 */

public class game extends product 
{
    public String platform;

    /**
     * Default Constructor for objects of class game
     */
    public game()
    {
        // initialise instance variables
        super();
        platform=" ";
    }
    
    /**
     *  Variable constructor for objects of class game
     *  
     *  @param Nprice price per unit
     *  @param units number of prodcuts avaiable
     *  @param Nname name of the prodcut
     *  @param Narist name of the platform
     */
    public game(String Nname, double Nprice, int units, String Nplatform)
    {
        super(Nname, Nprice, units);
        platform=Nplatform;
    }
  
    /** Print info related to one game**/
    public void printinfo()
    {
        System.out.println("Name: "+name+"\n platform: "+platform+"\n Price per unit: "+this.get_price()+"\nProduct aviable: "+this.get_count());
    }
    
    /**
     * Rent a game
     * 
     * @param days number of renting days
     */
    public double rent (int days)
    {
        if(get_count()>=1)
        {
            total_cost++;
            System.out.println("Purchase made successfully with a cost of "+(get_price()*0.01)*days);
            return (get_price()*0.01)*days;
           
        }
        else
        {
            System.out.println("insufficient units to perform renting");
            return 0;
        }
    }

}
