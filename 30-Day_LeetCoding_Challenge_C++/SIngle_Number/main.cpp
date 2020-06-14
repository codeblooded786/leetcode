#include <iostream>
#include <algorithm>
#include <map>

/*
The best solution is to use XOR. XOR of all array elements gives us the number with single occurrence. The idea is based on following two facts.
a) XOR of a number with itself is 0.
b) XOR of a number with 0 is number itself.
*/


using namespace std;

int main() {
    int arr[] = {4, 1, 2, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    /*sort(arr, arr + n);

    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    map<int,int> matrix;

    for (int j = 0; j <n ; ++j) {
        if(arr[j])
        matrix.insert(pair<int,int>(arr[j],1));
    }*/

    int num = arr[0];
    for (int i = 1; i < n; ++i) {
        num = num ^ arr[i];
    }
    cout << num;


    return 0;
}
