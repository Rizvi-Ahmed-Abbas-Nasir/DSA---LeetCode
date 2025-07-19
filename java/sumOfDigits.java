import java.util.Scanner;

public class sumOfDigits {
    
    public static int sumOfDigit(int num){
        int sum = 0;
        while (num != 0) {
            sum  +=  num % 10;
            num /= 10;
        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner sn =  new Scanner(System.in);

        int num = sn.nextInt();

        System.out.println(sumOfDigit(num));   
    }
}
