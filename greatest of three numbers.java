Input 

package test1;
import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3= sc.nextFloat();
        
        if(num1>num2)
        {
            if (num1>num3)
            {
                System.out.println(num1 + " is the largest number");
            }
            else
            {
                System.out.println(num3 + " is the largest number");
            }
        }
        else
        {
            System.out.println(num2 + " is the largest number");
        }
    }
}





