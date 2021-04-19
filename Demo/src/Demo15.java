/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 02/02/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo15 {


    public static int[] reverseArray(int[] array)
    {
        int length = array.length;
        for (int i = 0 ;i<length/2;i++)
        {
            int temp = array[i];
            array[i] = array[length-i-1];
            array[length-i-1]=temp;
        }

        return array;

    }


    public static void main(String[] args) {
       // {12,6,1,9,0,24,56}

        int[] array = {12, 6, 1, 9, 0, 24, 56,100};
        array=reverseArray(array);

        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);


    }
}
