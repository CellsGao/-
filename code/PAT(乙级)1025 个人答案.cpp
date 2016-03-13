#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    int n= (b - a) / 10;
    if (n % 10 >= 5) {
        n = n / 10 + 1;
    } else {
        n = n / 10;
    }

    int hour = 0, minute = 0, second = 0;
    hour = n / 3600;
    n = n % 3600;
    minute = n / 60;
    n = n % 60;
    second = n;

    printf("%02d:%02d:%02d", hour, minute, second);
    return 0;
}
