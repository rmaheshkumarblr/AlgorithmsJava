package sortingAlgorithms;

import java.util.Arrays;

/**
 * Created by maheshkumar on 14 January 2016.
 */
public class selectionSort
{
    public int[] swap(int[] array,int a,int b)
    {
            int temp = array[a] ;
            array[a] = array[b];
            array[b] = temp ;
            return array ;
    }

    public selectionSort(int[] array)
    {
        for ( int i=0 ; i<array.length-1 ; i++)
        {
            int minIndex = i ;
            for ( int j=i+1 ; j<array.length ; j++)
            {
                if( array[i] > array[j] )
                {
                    minIndex = j;
                }
            }
            if ( minIndex != i )
            {
                array = swap(array,i,minIndex);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args)
    {
        int[] value = new int[]{1,5,3,4,2} ;
        System.out.println(Arrays.toString(value));
        selectionSort test = new selectionSort(value);
    }
}
