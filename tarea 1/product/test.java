
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
      public static void main(String[] args) {
        // declares an array of integers
        product[] array;
        array=new product[3];
        
        game g=new game("God",5.0,5,"ps3");
        album a=new album("time goes by",40.0,6,"pretender");
        movie m=new movie("The godfather",5.00,4,"Action");
        
        array[0]=g;
        array[1]=a;
        array[2]=m;
        
        //Show data
        for(int i=0; i<array.length; i++)
        {
            array[i].printinfo();
            System.out.println("\n");
        }
        
        System.out.println("\nBuy test\n");
        System.out.println("\nBuy 7 games, one by one, when you have 5\n");
        for(int i=0; i<7; i++)
        {
            array[0].buy();
            System.out.println("totalcost game: "+array[0].total_cost+"\navailability: "+array[0].get_count());
            
        }
        
       array[0].set_count(5);
       
       System.out.println("\nBuy 7 games, all together, when you have 5\n");
       array[0].buy(7);
       array[0].set_count(5);
       
       System.out.println("\nBuy 4 games, all together, when you have 5\n");
       array[0].buy(4);
       array[0].set_count(5);
       
       //albums
        System.out.println("\nBuy 7 albums, one by one, when you have 6\n");
        for(int i=0; i<7; i++)
        {
            array[1].buy();
            System.out.println("totalcost album: "+array[1].total_cost+"\navailability: "+array[1].get_count());
            
        }
        
       array[1].set_count(6);
       System.out.println("\nBuy 7 albums, all together, when you have 4\n");
       array[1].buy(7);
       array[1].set_count(6);
       
       System.out.println("\nBuy 4 albums, all together, when you have 6\n");
       array[1].buy(4);
       array[1].set_count(6);
       
       //Movies
        System.out.println("\nBuy 7 movies, one by one, when you have 4\n");
        for(int i=0; i<7; i++)
        {
            array[2].buy();
            System.out.println("totalcost album: "+array[2].total_cost+"\navailability: "+array[2].get_count());
            
        }
        
       array[2].set_count(4);
       System.out.println("\nBuy 7 movies, all together, when you have 4\n");
       array[2].buy(7);
       array[2].set_count(4);
       
       System.out.println("\nBuy 4 movies, all together, when you have 4\n");
       array[2].buy(4);
       array[2].set_count(4);
       
       
       System.out.println("\nRent test\n");
       System.out.println("\nGames: Rent 7 times but you have 5 only  \n");
       
        for(int i=0; i<7; i++)
        {
            array[0].rent(14);
            System.out.println("totalcost game: "+array[0].total_cost+"\navailability: "+array[0].get_count());
            
        }
       
        
       System.out.println("\nAlbums: Rent 7 times but you have 6 only \n");
       
        for(int i=0; i<7; i++)
        {
            array[1].rent(14);
            System.out.println("totalcost game: "+array[1].total_cost+"\navailability: "+array[1].get_count());
            
        }
        
       System.out.println("\nMovies: Rent 7 times but you have 4 only \n");
       
        for(int i=0; i<7; i++)
        {
            array[2].rent(14);
            System.out.println("totalcost game: "+array[2].total_cost+"\navailability: "+array[2].get_count());
            
        }
        
        
        
    }
}