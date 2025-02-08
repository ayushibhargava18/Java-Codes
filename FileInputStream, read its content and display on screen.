import java.io.FileInputStream; 
public class readfile {
    public static void main(String args[])
    {
        try
        {
            FileInputStream f=new FileInputStream("readout.txt");    
            int i=0;
            while((i=f.read())!=-1)
            {
                System.out.print((char)i);
            }  
            System.out.println("");
            f.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
