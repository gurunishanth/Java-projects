
import java.awt.Point;
import java.util.Date;

public class datatype {
    
     public static void main(String[] args) {
         /* int age = 18;
         byte a = 21;
         long b = 20000000000000l; //every long variable contains "l" to run the program
         float mark = 74.5f; //every float variable contains "f" to run the program
         char grade = 'O'; */




         //System.out.println(age);
         //System.out.println(a);
         //System.out.println(b);
        // System.out.println(mark);
         //System.out.println(grade); 

         //reference datatype
         Date today = new Date();
         System.out.println(today);

         int a = 10;
         int b = a;
         System.out.println(b);
         

         a=5;
         System.out.println(a);
         System.out.println(b);

         Point p1 = new  Point(5,7);
         Point p2 = p1;
         System.out.println(p2);


         p1.x=7;
         System.out.println(p1);
         System.out.println(p2);
     }
}
