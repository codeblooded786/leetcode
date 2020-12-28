import java.util.Scanner;

public class P4_MissingNumberInArray {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int arr[] = new int[n - 1];
        int x = 0;

        for (int i = 0; i < n - 1; i++) {
            int y = kb.nextInt();
            x = y ^ i + 1;
        }

        System.out.println(x);
    }
}

