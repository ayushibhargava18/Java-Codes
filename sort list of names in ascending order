package test2;
import java.util.*;

class sort
{
    void sorting()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of elements");
        int n=sc.nextInt();
        String[] str= new String[n];
        System.out.println("Enter strings:");
        for(int i=0;i<n;i++)
        {
            str[i]=new String(sc.next());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
        System.out.println("Sorted list of strings is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }
}

public class Test2 {

    public static void main(String[] args) {
        sort obj = new sort();
        obj.sorting();
    }   
}
