import java.util.*;
import java.io.*;


/**
 * Student
 * 
 * @author (@jick) 
 * @version (0.01)
 */
public class Student {
    
    // instance variables - replace the example below with your own
    private String name;
    private String surname;
    private float average;
    static String Bname;
    static String Bsurname;
    static float Baverage;
    static int number_student;

    /**
     * Constructor for objects of class student
     */
    public Student(String Name, String surname)
    {
        this.name=Name;
        this.surname=surname;
        average=0;
        Student.number_student++;
    }
    
    /**
     * Constructor for best student data
     */
    static public void start_best_student()
    {
        Bname=new String("a");
        Bsurname=new String("a");
        Baverage=-1;
    }
    
    /**
     * getname obtain name of the student
     * 
     * @return name of the student 
     */
    public String getname(){return name;}
    
    /**
     * getsurname obtain surname of the student
     * 
     * @return surname of the student 
     */
    public String getsurname(){return surname;}
    
    
    /**
     * getAverage obtain average of the student
     * 
     * @return average of the student 
     */
    public float getAverage(){return average;}
    
    /**
     * Calculates the average of one student
     * 
     * @param  x,y,z grades of the students
     * 
     */
    public void setAverage(int x, int y, int z) 
    {
        this.average=(float) (x+y+z)/3;
        if(Baverage<=this.average)
        {
            Bname=name;
            Bsurname=surname;
            Baverage=average;
        }
    }
    
    /**
     * Method that thorws one exception is the student failed the exam
     */
    public void Average() throws Failed
    {
        if(this.average<=5)
        {
            throw new Failed("FAILED!");
        }
    }
    
    /**
     * Write a .txt of the name and average of the students
     * 
     * @param ArrayList<Student> f data of the students
     */
    static public void writeFailed(ArrayList<Student> f)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
       

        
        try
        {
            fichero = new FileWriter("/home/jick/Escritorio/failed.txt");
            pw = new PrintWriter(fichero);
            for(int i=0; i<f.size(); i++)
            {
                pw.print(f.get(i).getname()+" ");
                pw.print(f.get(i).getsurname()+" ");
                pw.println(f.get(i).getAverage());  
            }
        }
        
        catch (Exception e)
        {
            e.printStackTrace();            
        }
        finally 
        {
            
            try{
                if (null != fichero)
                    fichero.close();
                
                
            }catch (Exception e2){
                
                e2.printStackTrace();
                
            }
        }
    }
    

}