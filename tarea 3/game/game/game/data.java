package game;


import java.util.Stack;

/**
 * Write a description of class data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class data
{
    // instance variables - replace the example below with your own
    private int Matriz[][];
    private int col, fil;
    private Stack<Integer> Random ()
    {
        int pos;
        int casillas = 9;
        Stack<Integer> s_numeros = new Stack<Integer> ();
        for (int i = 0; i < casillas ; i++) 
        {
            pos = (int) Math.floor(Math.random() * casillas );
            while (s_numeros.contains(pos)) 
            {
                pos = (int) Math.floor(Math.random() * casillas );
            }
            s_numeros.push(pos);
        }
        return s_numeros;
    }
      
    private void swap(int i, int j, int k, int l)
    {
        int aux;
        aux=Matriz[i][j];
        Matriz[i][j]=Matriz[k][l];
        Matriz[k][l]=aux;
        fil=i;
        col=j;
        System.out.println("Matriz["+i+"]["+j+"] "+Matriz[i][j]+"Matriz["+k+"]["+l+"] "+Matriz[i][j]);
    }

    /**
     * Constructor for objects of class data
     */
    public data()
    {  
        Matriz=new int [3][3];
        Stack < Integer > s;
        s=Random();
        
        
        Matriz[0][0]=1;
        Matriz[0][1]=2;
        Matriz[0][2]=3;
        Matriz[1][0]=4;
        Matriz[1][1]=5;
        Matriz[1][2]=6;
        Matriz[2][0]=7;
        Matriz[2][1]=0;
        Matriz[2][2]=8;
        
        fil=2;
        col=1;
        
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                //System.out.println("Bandera_90");
               /* if(s.peek()==0)
                {
                    fil=i;
                    col=j;
                }
                Matriz[i][j]=s.peek();
                //System.out.println(" Defecto M["+i+"]["+j+"]: "+Matriz[i][j]);
                s.pop();*/
               
            }
        }
    }
    

    public data(data dat)
    {
        for(int i=0; i<3; i++)
        {
           for(int j=0; j<3; j++)
           {
                System.out.println(" Copia "+i+","+j+"\n");
                Matriz[i][j]=dat.Matriz[i][j];
                
            }
        }
        col=dat.col;
        fil=dat.fil;
    }
    
        
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean Is_possible(int i,int j)
    {
        boolean t=false;
        System.out.println("¿Es posible mover ?"+i+" "+j);
        
        if(i>=0 && j>=0 && i<=2 && j<=2)
        {
            System.out.println("i mayor igual 0 y menor igual 2, j mayor igual 0 y menor igual 2");
            
            if((fil==i+1 && col==j)
                    ||
               (fil==i-1 && col==j)
                    ||
               (fil==i && col==j+1)
                    ||
               (fil==i && col==j-1))
            {
                System.out.println("Es posible");
                t=true;    
            }
        }
        return t;
    }
    
    public boolean Move(int i, int j)
    {
        System.out.println("Move :"+i+" "+j);
        boolean moved=true;
        //System.out.println(Is_possible(i,j));
        if(Is_possible(i,j)==true)
        {
            swap(i,j,fil,col);
          
            System.out.println("La pos casilla vacia es "+fil+" "+col+" "+Matriz[fil][col]);
        }
        else
        {
            moved=false;
        }
        return moved;
    }
   
    public int getNumber(int i, int j)
    {
        //System.out.println("M[0][0]: "+Matriz[i][j]);
        return Matriz[i][j];
    }
  
    public boolean is_end()
    {
        boolean end=true;
        int M[][]={{1,2,3},{4,5,6},{7,8,0}};
        for(int i=0; i<3 && end; i++)
        {
            for(int j=0; j<3 && end; j++)
            {
                if(Matriz[i][j]!=M[i][j])
                {
                    end=false;
                }
            }
        }
        return end;
    }
}
