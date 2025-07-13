#include <iostream>
using namespace std;

bool isPalindrome(int x) {
    // 🔴 Step 1: Negative numbers are NOT palindromes
    if (x < 0) return false;

    int original = x;  // Store the original value to compare later
    int reversed = 0;

    // 🔁 Step 2: Reverse the number using % and /
    while (x > 0) {
        int lastDigit = x % 10;           // 🟦 Example: 121 % 10 = 1 (gets last digit)
        reversed = reversed * 10 + lastDigit; // ⬅️ Shift left and add digit
        x = x / 10;                        // 🟩 Example: 121 / 10 = 12 (remove last digit)
    }

    // ✅ Step 3: Check if original and reversed match
    return original == reversed;
}

int main() {
    int number = 121;
    if (isPalindrome(number))
        cout << number << " is a Palindrome ✅" << endl;
    else
        cout << number << " is NOT a Palindrome ❌" << endl;
    
    return 0;
}
