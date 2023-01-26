package else_if;
import java.util.Scanner;

public class Else_if 
{
    public static void main(String[] args)
     
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your time ");

        int time= sc.nextInt();

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
