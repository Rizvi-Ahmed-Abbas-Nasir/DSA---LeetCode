import java.util.Scanner;


public class palindrome {
    
    public static int numberPalindrome(int num){

        int reverse = 0;

        if(num < 0) return 0;

        while (num != 0) {
            int digit  = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }



        return reverse;
    }


    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();

        int rev = numberPalindrome(num);

        if (num == rev) {
            System.err.println("It is palindrome");
        }
        else{
                        System.err.println("It is not palindrome");

        }
        
    }
}
