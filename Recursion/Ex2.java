
/**
 * Write a description of class Ex2 here.
 * returns the sum of the calculation               
 * Sum (n) = (n*n) + ((n-1)*(n-1)) + ((n-2)*(n-2)) + …… + 1*1               
 */
public class Ex2
{
    public static int sum (int n)
    {
        if (n==0)
            return 0;
            
        else 
        {
            n= (n*n) + sum(n-1);
            return n;
        }
    }
}
