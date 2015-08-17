
import java.io.*;
import java.util.*;


/**
 * Main program test
 * 
 * @author (@jick) 
 * @version (0.01)
 */
public class Test 
{
    public static void main(String[] args) 
    {
        ArrayList<Student> array = new ArrayList<Student>();
        ArrayList<Student> failed = new ArrayList<Student>(); //Failed students
        Student.start_best_student();
        
        File archivo = null;
        FileReader fr=null;
        BufferedReader br=null;
        
        String path=args[0];
        
          
        try
        {
            try
            {
                archivo= new File(path);
                fr= new FileReader(archivo);
                br=new BufferedReader(fr);
            }
            catch(FileNotFoundException fnf)
            {
                System.out.println("Select new path file");
                javax.swing.JFileChooser j = new javax.swing.JFileChooser(); // abrir ventanita para abotener direccion
                j.showOpenDialog(j);
                path=j.getSelectedFile().getAbsolutePath();
                
                archivo= new File(path);
                fr= new FileReader(archivo);
                br=new BufferedReader(fr);
            }
            int i=0;     
            String linea;            
            while((linea=br.readLine())!=null)
            {
            
              
              StringTokenizer token = new StringTokenizer(linea);
              //Name and surname
              String name=token.nextToken();
              String surname=token.nextToken();
              
              try
              {
                  int x=Integer.parseInt(token.nextToken());
                  int y=Integer.parseInt(token.nextToken());
                  int z=Integer.parseInt(token.nextToken());
                  
                  //Add correct current student
                  Student s=new Student(name,surname);
                  s.setAverage(x,y,z);
                  
                  //start with the fail.txt
                  try
                  {
                      s.Average();
                  }
                  catch(Failed f)
                  {
                      failed.add(s);
                  }
                  array.add(s);            
                  Student st=(Student) array.get(i);
                  
                  
                  i++;
              }
              catch (NumberFormatException eFormatoNumero ) 
              {
                  System.out.println("Invalid format for Student "+name+" "+surname);
              }
            }
            //Print info
            Student.writeFailed(failed);
            System.out.println(Student.number_student+" students imported successfully");
            System.out.println("Best student: "+Student.Bname+" "+Student.Bsurname+" "+Student.Baverage);
       }
            
       catch(IOException e)
       {
            e.printStackTrace();
       }
  
       finally
       {
                try
                {                    
                    if( null != fr )
                    {
                       fr.close();     
                    }
                    
                }
                catch (Exception e2)
                { 
                    e2.printStackTrace();
                }
        }
     
    }
}
           