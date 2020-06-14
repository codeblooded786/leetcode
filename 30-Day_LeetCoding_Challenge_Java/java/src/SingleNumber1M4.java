import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SingleNumber1M4 {

    public static int singleNumber(int[] nums)
    {
        int x = nums[0];
        for (int i=1;i<nums.length;i++)
        {
            x=x^nums[i];
        }
        return x;
    }


    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 2, 3};

        List<Integer> list = new ArrayList<>();

        List<Long> list1 = new LinkedList<>();

        int x = SingleNumber1M4.singleNumber(arr);

        System.out.println(x);

    }
}
