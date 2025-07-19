#include <iostream>
using namespace std;

bool isPalindrome(int x) {
    // ❌ Step 1: Negative numbers are not palindromes
    if (x < 0) return false;

    // 🔢 Step 2: Calculate divisor (div) to extract the leftmost digit
    int div = 1;
    while (x / div >= 10) {
        div *= 10;
    }

    // 🔁 Step 3: Compare digits from both ends
    while (x != 0) {
        int left = x / div;     // Leftmost digit
        int right = x % 10;     // Rightmost digit

        if (left != right) return false;

        // Remove both digits
        x = (x % div) / 10;     // Remove left and right
        div = div / 100;        // Reduce divisor by 2 digits
    }

    return true;
}

int main() {
    int number = 1221;
    if (isPalindrome(number))
        cout << number << " is a Palindrome ✅" << endl;
    else
        cout << number << " is NOT a Palindrome ❌" << endl;

    return 0;
}
