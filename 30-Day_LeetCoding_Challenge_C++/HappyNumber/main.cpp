#include <bits/stdc++.h>

using namespace std;

int findSum(int num) {
    int x, sum = 0;

    while (num != 0) {
        x = num % 10;
        sum += x * x;
        num = num / 10;
    }
    return sum;
}

int main() {
    int num, x;
    unordered_set<int> visited;
    cin >> num;
    x=num;
    while (1) {
        x = findSum(x);
        if (x == 1) {
            cout << "true";
            break;
        }

        if (visited.count(x) == 1) {
            cout << "false";
            break;
        }
        visited.insert(x);
    }
    return 0;
}
