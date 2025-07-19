import java.util.*;

public class Functions {
    public static boolean isPrime(int number){
        if(number <= 0){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int number){
        for(int i = 1; i <= number; i++){
            if(isPrime(i)){
                System.out.print(" "+i);
            }
        }
        System.out.println();
        return;
    }

    public static int binaryToDecimal(int number){
        int decimalNum = 0;
        int pow = 0;
        while(number > 0){
            int div = number % 10;
            decimalNum = decimalNum + (div * (int)Math.pow(2, pow));
            pow++;
            number /= 10;
        }
        return decimalNum;
    }

    public static int decimalToBinary(int number){
        int binaryToNumber = 0;
        int pow = 0;
        while(number > 0){
            int rem = number % 2; 
            binaryToNumber = binaryToNumber + (rem *(int)(Math.pow(10,pow))); 
            number /= 2;
            pow++;
        }

        return binaryToNumber;
    }

    public static double average(int num1, int num2, int num3){
        double avg = ((double)(num1+num2+num3))/3;
        return avg;
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int number){
        int copy = number;
        int reverse = 0;
        while(copy > 0){
            int rem = copy % 10;
            reverse = (reverse * 10) + rem;
            copy /= 10;
        }
        if(number == reverse){
            return true;
        }
        return false;
        
    }
    
    public static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum = sum + rem;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        primeInRange(100);
        System.out.println(binaryToDecimal(111));
        System.out.println(decimalToBinary(4));
        System.out.println(average(19, 12, 12));
        System.out.println(isEven(21));
        System.out.println(isPalindrome(11312));
        System.out.println(Math.min(15,8));
        System.out.println(Math.max(15,8));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(32,2));
        System.out.println(Math.abs(-345));
        System.out.println(sumOfDigits(12345));
       
    }
}
