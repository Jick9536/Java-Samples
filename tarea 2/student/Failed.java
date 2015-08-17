
/**
 * Exception failed
 * 
 * @author (Julio) 
 * @version (0.01)
 */

class Failed extends Exception 
{
    String msj;
    public void Failed(){}
    
    public Failed(String msj)
    {
        this.msj=msj;
    }
    
    public String getMessage(){return msj;}
    
        
}
    