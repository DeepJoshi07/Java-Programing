import java.util.*;

public class Recursion {
    public static void printNumIncreasing(int num){
        if(num <= 0 ){
            return;
        }
        printNumIncreasing(num-1);
        System.out.println(num+" ");
    }
    
    public static void printNumdecreasing(int num){
        if(num <= 0){
            return;
        }
        System.out.println(num+" ");
        printNumdecreasing(num-1);
    }
    
    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        int ft = num * factorial(num-1);
        return ft;
    }

    public static int sumOfNum(int num){
        if(num == 1){
            return 1;
        }
        return num + sumOfNum(num-1);
    }
    
    public static int fibonachi(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonachi(num-1)+fibonachi(num-2);
    }
    
    public static boolean isArraySorted(int arr[],int start){
        if(start == arr.length-1){
            return true;
        }
        if(arr[start] > arr[start+1]){
            return false;
        }
        return isArraySorted(arr, start+1);
    }
    
    public static int firstOccurence(int arr[],int i,int key){
        if(i == arr.length-1){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccurence(arr, i+1, key);
    }
    
    public static int lastOccurence(int arr[],int i,int key){
        if(i == 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, i-1, key);
    }
    
    public static int power(int num,int x){
        if(x <= 0){
            return 1;
        }
        if(x % 2 != 0){
            int halfPow = power(num, x/2);
            return (halfPow * halfPow)*num;
        }
        int halfPow = power(num, x/2);
        return halfPow * halfPow;
    }
    public static void main(String[] args) {
        printNumIncreasing(10);
        System.out.println("-----------------------------------------");
        printNumdecreasing(10);
        System.out.println("-----------------------------------------");
        System.out.println(factorial(5));
        System.out.println("-----------------------------------------");
        System.out.println(sumOfNum(10));
        System.out.println("-----------------------------------------");
        System.out.println(fibonachi(7));
        System.out.println("-----------------------------------------");
        int arr1[] = {1,2,5,6,8,9,7,3,4};
        int arr2[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(isArraySorted(arr1,0));
        System.out.println(isArraySorted(arr2,0));
        System.out.println("-----------------------------------------");
        int arr3[] = {1,2,5,9,8,6,7,3,4};
        System.out.println(firstOccurence(arr3, 0, 9));
        int arr4[] = {1,2,3,4,1,2,3,6,2,5,9,1,9,0};
        System.out.println(lastOccurence(arr4, arr4.length-1, 2));
        System.out.println("-----------------------------------------");
        System.out.println(power(5,5));
        System.out.println("-----------------------------------------");

    }
}
