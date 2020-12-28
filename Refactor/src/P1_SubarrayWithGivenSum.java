import java.util.Scanner;

public class P1_SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();

        while (t-- > 0) {
            int n = kb.nextInt();
            int s = kb.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {

                arr[i] = kb.nextInt();
            }

            boolean flag = false;
            int i, j = 0;
            for (i = 0; i < n; i++) {
                int sum = 0;
                for (j = i; j < n; j++) {
                    sum += arr[j];
                    if (sum == s) {
                        flag = true;
                        break;
                    }
                    if (sum>s)
                    {
                        break;
                    }
                }
                if (flag == true) {
                    break;
                }
            }
            if (flag == true) {
                System.out.println((i + 1) + " " + (j + 1));
            } else
                System.out.println(-1);
        }
    }
}


