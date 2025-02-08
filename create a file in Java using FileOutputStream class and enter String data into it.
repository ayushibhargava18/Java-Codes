import java.io.FileOutputStream;  
import java.io.IOException;
import java.util.Scanner;
public class writestring {
    public static void main(String[] args)
    {
        try
        {
            String data;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the string:");
            data=s.nextLine();
            try (FileOutputStream x = new FileOutputStream("stringdata.txt")) {
                byte arr[]=data.getBytes();
                x.write(arr);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
