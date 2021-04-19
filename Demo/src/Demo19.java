/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 05/02/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo19 {

    public static void main(String[] args) {

        //  a[1,12,15,26,38]
        //  b[2,13,17,30,45]

        int arr[] = {100, 200, 300, 350, 450};
        int brr[] = {7, 13, 17, 30, 900};

        //7,13,17,30,100,200
        int crr[] = new int[arr.length + brr.length];

//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[])
//
//        }
        int i = 0;
        int j = 0;
        int k = 0;

//        while (k <= (arr.length + brr.length) / 2) {
//
//            if (i < arr.length && arr[i] < brr[j]) {
//                crr[k++] = arr[i];
//                i++;
//            }
//            else if (j < brr.length ) {
//
//                crr[k++] = brr[j];
//                j++;
//            }
//
//        }

        int x = arr.length + brr.length;


        while (true)
        {
            if (i< arr.length && arr[i]<arr[j])
            {
                crr[k]=arr[i];
                i++;
            }
            else
            {
                crr[k]= brr[j];
                j++;
            }

            k++;

            if (k>x/2)
            {
                break;
            }

        }



        if (x % 2 == 0) {
            System.out.println((crr[x / 2] + crr[x / 2 - 1]) / 2);

        } else {
            System.out.println(crr[x / 2]);
        }


        //      input: aabbaaadd
        //     output: a-2,b-2,a-3,d-2
//
//        int arr[]={1,2,3,4,5};
//
//        int brr[]={}

//        String s = "aabbaaadd";
//
//        int i=0;
//
//
//        while (i<s.length())
//        {
//            char c = s.charAt(i);
//            int count=0;
//            while (i<s.length()&&c==s.charAt(i))
//            {
//                count++;
//                i++;
//            }
//
//            System.out.println(c+" "+count);
//
//        }
//

//
//        int arr[] = {1, 2, 3, 4, 5};
//
//        //arr[5]=6;
//
//
//        int brr[] = new int[6];
//
//
//        for (int i = 0; i < 5; i++) {
//            brr[i] = arr[i];
//        }
//
//        brr[5] = 6;


//
//        for (int x: brr) {
//
//            System.out.println(x);
//
//        }

    }


}
