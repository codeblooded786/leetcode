import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P1046_LastStoneWeight {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int arr[] = {2, 7, 4, 1, 8, 1};

        Arrays.stream(arr).boxed().toArray(Integer[]::new);
        IntStream.of(arr).boxed().toArray(Integer[]::new);


        List<Integer> arrayList = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        while (arrayList.size() > 1) {
            int x = arrayList.get(0);
            int y = arrayList.get(1);

            arrayList.remove(0);
            arrayList.remove(0);

            if (x > y) {
                arrayList.add(x - y);
            }
            if (y > x) {
                arrayList.add(y - x);
            }
            arrayList.sort(Collections.reverseOrder());
        }
        if (arrayList.size() == 1)
            System.out.println(arrayList.get(0));
        else
            System.out.println(0);

    }
}
