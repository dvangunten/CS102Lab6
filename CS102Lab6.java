
package cs102lab6;

public class CS102Lab6
{

   
    public static void main(String[] args)
    {
        //logical error
       class IncorrectMessage 
       {
            public static void main(String args[])
            {
                int a = 2, b = 8, c = 6;
                System.out.println(Finding the largest number \n");
                
                if (a > b && a > c)
                System.out.println(a + " is the largest Number");
                
                else if (b > a && b > c)
                System.out.println(b + " is the smallest Number");
                
                else
                System.out.println(c + " is the largest Number");
            }
        }
       
       //runtime error
       class RTErrorDemo 
       {
            public static void main(String args[])
            {
                int arr[] = new int[5];
                arr[9] = 250;
                System.out.println("Value assigned! ");
            }
        }
       
       //compilation error
       class MisspelledVar
       {
            public static void main(String args[])
            {
                int a = 5, b = 10;
                int Sum = a + b;
                System.out.println("Sum of variables is " + sum);
            }
        }
        
        
    }
    
}
