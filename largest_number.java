import java.util.*;

class largest_number
{
    public static void main(String[] args)
    {
        int x = 5 ;
        int y = 6 ;
        int z = 9 ;

        if(x>y && x>z)
         System.out.println("the largest number is :"+x);
         else 
         if(y>z && y>x)
         System.out.println("the largest number is:"+y);
         else
         System.out.println("the largest number is:"+z);

    }
}