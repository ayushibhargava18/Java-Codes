package abstracttest;

abstract class hello
{
    abstract void hey();
}

class hii extends hello
{
    void hey()
    {
        System.out.println("abstract classes and functions");
    }
}
public class Abstracttest {

    public static void main(String[] args) {
        hii obj = new hii();
        obj.hey();
    }   
}


package test;
import java.util.*;
abstract class shapes {
    protected
            int x,y;
    public
            shapes(){}
            shapes(int x, int y){
            this.x = x;
            this.y = y;
    }
            abstract void printArea();
}
class rectangle extends shapes{
    public 
        rectangle(int length,int breadth){
            x=length;
            y=breadth;
        }
        void printArea(){
        int area=x*y;
        System.out.println("Area of rectangle is: "+area);
    }
}
class triangle extends shapes{
    public 
        triangle(int base,int height){
            x=base;
            y=height;
        }         
        void printArea(){
        float area=0.5f*x*y;
        System.out.println("Area of triangle is: "+area);
    }
}
class circle extends shapes{
    public 
        circle(int radius){
            x=radius;
            y=radius;
        }        
        void printArea(){
        float area=3.14f*x*y;
        System.out.println("Area of rectangle is: "+area);
    }
}
public class Test {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        System.out.print("Enter base of triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        int height = sc.nextInt();
        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        rectangle obj1= new rectangle(5,8);
        triangle obj2= new triangle(6,9);
        circle obj3= new circle(5);
        obj1.printArea();
        obj2.printArea();
        obj3.printArea();
    }
}
