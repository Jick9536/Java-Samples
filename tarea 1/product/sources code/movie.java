
/**
 * subclass movie inheritate product
 * 
 * @author julio rodríguez martínez 
 * @version 0.01
 */

public class movie extends product 
{
    public String genre;

    /**
     * Default Constructor for objects of class movie
     */
    public movie()
    {
        // initialise instance variables
        super();
        genre=" ";
    }
    
    /**
     *  Variable constructor for objects of class movie
     *  
     *  @param Nprice price per unit
     *  @param units number of prodcuts avaiable
     *  @param Nname name of the prodcut
     *  @param Narist name of the genre
     */
    public movie(String Nname, double Nprice, int units, String Ngenre)
    {
        super(Nname, Nprice, units);
        genre=Ngenre;
    }
  
    /** Print info related to one movie**/
    public void printinfo()
    {
        System.out.println("Name: "+name+"\n genre: "+genre+"\n Price per unit: "+this.get_price()+"\nProduct aviable: "+this.get_count());
    }
    
    /**
     * Rent a movie
     * 
     * @param days number of renting days
     */
    public double rent (int days)
    {
        if(get_count()>=1)
        {
            total_cost++;
            System.out.println("purchase made successfully with a cost of "+(get_price()*0.02)*(days/7));
            return (get_price()*0.02)*(days/7);

        }
        else
        {
            System.out.println("insufficient units to perform renting");
            return 0;
        }
    }
}
