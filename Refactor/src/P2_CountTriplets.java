import java.util.Scanner;

public class P2_CountTriplets {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int tripletCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] == arr[k]) {
                        tripletCount++;
                    }
                }
            }
        }

        System.out.println(tripletCount);

    }
}
