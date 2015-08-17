
/**
 * subclass album inheritate product
 * 
 * @author julio rodríguez martínez 
 * @version 0.01
 */

public class album extends product 
{
    public String artist;

    /**
     * Default Constructor for objects of class album
     */
    public album()
    {
        // initialise instance variables
        super();
        artist=" ";
    }
    
    /**
     *  Variable constructor for objects of class album
     *  
     *  @param Nprice price per unit
     *  @param units number of prodcuts avaiable
     *  @param Nname name of the prodcut
     *  @param Narist name of the artist
     */
    public album(String Nname, double Nprice, int units, String Nartist)
    {
        super(Nname, Nprice, units);
        artist=Nartist;
    }
    
    
    /** Print info related to one prodcut**/
    public void printinfo()
    {
        System.out.println("Name: "+name+"\n artist: "+artist+"\n Price per unit: "+get_price()+"\nProduct aviable: "+get_count());
    }
    
    /**
     * Rent an album
     * 
     * @param days number of renting days
     */
    public double rent (int days)
    {
        if(get_count()>=1)
        {
            total_cost++;
            System.out.println("purchase made successfully with a cost of "+(get_price()*0.05)*days);
            return (get_price()*0.05)*days;
        }
        else
        {
            System.out.println("insufficient units to perform renting");
            return 0;
        }
    }

}
