package else_if;
import java.util.Scanner;

public class Else_if 
{
    public static void main(String[] args)
     
    {
        /*
        conditional statement in java else if in
        java 
        */
        
        
        Scanner sc = new Scanner(System.in);
        // taking the input from the console
        System.out.println("enter your time ");

        int time= sc.nextInt();
        // enter the time now it wishes the employees according to the time
        if (time <= 10)
         {
            System.out.println("good morning");
            
        }
        else if(time >=12&& time <=13)
        {
            System.out.println("good afternoon");
        }
        else if(time >=13 && time <=16)
        {
            System.out.println("good evening ");
        }
        else if(time >=16 && time <=24)
        {
            System.out.println("good night ");
        }
        

    }
    
    
}
