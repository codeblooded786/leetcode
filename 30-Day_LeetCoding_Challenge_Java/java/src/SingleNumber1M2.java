import java.util.HashMap;

public class SingleNumber1M2 {

    public static int singleNumber(int[] arr) {
        HashMap<Integer, Integer> hashTable = new HashMap<>();

        for (int i : arr) {
            hashTable.put(i, hashTable.getOrDefault(i, 0) + 1);
        }

        for (int i : arr) {
            if (hashTable.get(i) == 1) {
                return i;
            }
        }

        return 0;

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 2, 3};

        int x = SingleNumber1M2.singleNumber(arr);

        System.out.println(x);

    }
}
