import java.util.ArrayList;
import java.util.List;

public class SingleNumber1M1 {

    public static int singleNumber(int[] nums) {
        List<Integer> noDuplicatesList = new ArrayList<>();

        for (int y : nums) {
            if (!noDuplicatesList.contains(y)) {
                noDuplicatesList.add(y);
            } else {
                noDuplicatesList.remove(new Integer(y));
            }
        }


        return noDuplicatesList.get(0);
    }

    public static void main(String args[]) {
        int[] nums = {1, 2, 1, 2, 3};
        int x = SingleNumber1M1.singleNumber(nums);

        System.out.println(x);

    }
}
