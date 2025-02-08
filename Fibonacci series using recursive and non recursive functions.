package test1;
import java.util.*;

public class Test1 {
    
    public static int recursive(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return recursive(n-1) + recursive (n-2);
    }
    
    public static void nonrecursive(int n)
    {
        int a=0,b=1;
        
        if(n>=1)
        {
            System.out.print(a+ " ");
        }
        
        if(n>=2)
        {
            System.out.print(b+ " ");
        }
        for(int i=2; i<n; i++)
        {
            int c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int num1 = sc.nextInt();
        
        System.out.println("using recursive");
        for (int i=0; i<num1; i++)
        {
            System.out.print(recursive(i)+ " ");
        }
        System.out.println();
        
        System.out.println("using non-recursive");
        nonrecursive(num1);
    }
}
