package randomPractice;

import java.util.Arrays;

/**
 * Created by maheshkumar on 17 January 2016.
 */
public class generateKArrayStringPossibleCombinations
{
    static String[] A ;
    static String[] K ;

    public static void kString( int n , int k)
    {
        //n is the number of alphabets expected in output
        //k is the number of alpahbets in the givenString
        if(n<1)
        {
            System.out.println(Arrays.toString(A));
        }
        else
        {
            for(int i=0 ; i<k ; i++)
            {
                A[n-1] = K[i];
                kString(n-1,k);
            }
        }


    }

    public static void setK(String[] B)
    {
        K = B ;
    }

    public static void setA(int num)
    {
        A = new String[num] ;
    }


    public static void main(String[] args)
    {
        String[] k = new String[6];
        k[0]= "M";
        k[1] = "H";
        k[2] = "A";
        k[3]= "E";
        k[4] = "S";
        k[5] = "H";
        setA(6);
        setK(k);
        kString(6,6);
    }

    //T(n) = kT(n-1) + c
}
