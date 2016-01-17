package randomPractice;

import java.util.Arrays;

/**
 * Created by maheshkumar on 17 January 2016.
 */
public class generateAllStringOfnBits
{
    static int[] A ;
    public static void binary(int n)
    {
        if(n<1)
        {
            System.out.println(Arrays.toString(A));
        }
        else
        {
            A[n-1] = 0;
            binary(n-1);
            A[n-1] = 1;
            binary(n-1);
        }
    }

    public static void setA(int n)
    {
        A = new int[n];
    }

    public static void main(String[] args)
    {
        setA(10);
        binary(10);
    }

    //O(2^n) T(n) = 2T(n-1) + c ;
}
