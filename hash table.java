package test;

import java.io.*;
import java.util.*;

public class Experiment17 {
    public static void main(String args[]) {
        try {
            FileInputStream fis = new FileInputStream("C:/Users/dinaa/Downloads/phonebook.txt");
            Scanner sc = new Scanner(fis).useDelimiter("\n");
            Hashtable<String, String> ht = new Hashtable<>();
            String[] strarray;
            String a;
            
            while (sc.hasNext()) {
                a = sc.next();
                strarray = a.split(",");
                ht.put(strarray[0], strarray[1]);
                System.out.println("hash table values are " + strarray[0] + ":" + strarray[1]);
            }
            
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
