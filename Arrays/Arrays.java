import java.util.*;

public class Arrays {
    public static int largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int findKey(int arr[], int key) {

        int start = 0;
        int end = arr.length;
        int mid = end / 2;
        for (int i = 0; i < arr.length; i++) {

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }

        }
        return -1;
    }

    public static void printReverseArray(int arr[]) {
        int end = arr.length - 1;
        for (int i = 0; i <= end; i++) {
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;

            end--;
        }
        printArray(arr);
        return;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printPairs(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.println("the count of pairs is : " + count);
    }

    public static void subarrays(int arr[]) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int maxSum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    maxSum = maxSum + arr[k];
                }
                if (maxSum > sum) {
                    sum = maxSum;
                }
                System.out.println();
                System.out.println("The sum of the sub arr is : " + maxSum);

            }
            System.out.println();
        }
        System.out.println(sum);
    }

    public static void prefixSum(int arr[]){
        int prefix [] = new int[arr.length];
        int currSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(i == 0){
                prefix[i] = arr[i];
            }else{
                prefix[i] = prefix[i-1] + arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            int start = i;
            for(int j = i; j < arr.length; j++){
                int end = j;

                currSum = start == 0?prefix[end]: prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("You maximum sum is : "+maxSum);
    }

    public static void kadansSubArray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            currSum = currSum <= 0 ? 0:currSum;
            maxSum = maxSum < currSum? currSum:maxSum;
        }
        System.out.println("The maximum sum : "+ maxSum);
    }

    public static void trapedWater(int arr[]){
        int rightMax[] = new int[arr.length];
        int leftMax[] = new int[arr.length];

        for(int i = 0; i < arr.length;i++){
            if(i == 0){
                leftMax[i] = arr[i];
            }else{
                leftMax[i] = leftMax[i-1] < arr[i] ? arr[i]:leftMax[i-1];
            }
        }
        
        for(int i = arr.length-1; i >= 0;i--){
            if(i == arr.length-1){
                rightMax[i] = arr[i];
            }else{
                rightMax[i] = rightMax[i+1] < arr[i] ? arr[i]:rightMax[i+1];
            }
        }
        int trapedWater[] = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            trapedWater[i] = Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        printArray(leftMax);
        printArray(rightMax);
        printArray(trapedWater);
        return;
    }
   
    public static int heighestProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
    public static boolean distinctOrNot(int arr[]){
        for(int i = 0; i  < arr.length; i++){
            int key = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(key == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static int minimumValueIndex(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if(mid > 0 && arr[mid -1] > arr[mid]){
                return mid;
            }else if(arr[left] <= arr[mid] && arr[mid] > arr[right]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
   
    public static int findTarget(int arr[],int target,int si,int ei){
        int left = si;
        int right = ei;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
   
    public static int existsInRotation(int arr[],int target){
        int min = minimumValueIndex(arr);
        System.out.println(min);
        if(arr[min] <= target && target <= arr[arr.length-1]){
                return findTarget(arr, target, min, arr.length-1);
        }else{
                return findTarget(arr, target, 0, min);
        }

        
    }
    
    public static int totalTrapedWater(int arr[]){
        int rightMax [] = new int[arr.length];
        int leftMax [] = new int[arr.length];

        for(int i = 0; i < arr.length;i++){
            if(i == 0){
                leftMax[i] = arr[i];
            }else{
                leftMax[i] = leftMax[i-1] > arr[i] ? leftMax[i-1]:arr[i];
            }
          
        }
          for(int i = arr.length-1; i >= 0;i--){
            if(i == arr.length-1){
                rightMax[i] = arr[i];
            }else{
                rightMax[i] = rightMax[i+1] > arr[i] ? rightMax[i+1]:arr[i];
            }
            
        }
        
        int trapedWater = 0;
        int totalTrapedWater = 0;
        for(int i = 0; i < arr.length; i++){
            trapedWater = Math.min(leftMax[i],rightMax[i]) - arr[i];
            if(trapedWater > 0){
                totalTrapedWater += trapedWater;
            }
        }

        return totalTrapedWater;
    }
   
    public static void triplets(int arr[]){
        
    }
    public static void main(String[] args) {
        int arr[] = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };
        int sortedArr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int kadan [] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(largest(arr));
        System.out.println("----------------------------------");
        System.out.println("the key is on index : " + findKey(sortedArr, 4));
        System.out.println("----------------------------------");
        printArray(sortedArr);
        System.out.println("----------------------------------");
        printReverseArray(sortedArr);
        System.out.println("----------------------------------");
        printPairs(arr);
        System.out.println("----------------------------------");
        subarrays(sortedArr);
        System.out.println("----------------------------------");
        prefixSum(sortedArr);
        System.out.println("----------------------------------");
        kadansSubArray(kadan);
        prefixSum(kadan);
        kadansSubArray(sortedArr);
        System.out.println("----------------------------------");
        int height []= {4,2,0,6,3,2,5};
        trapedWater(height);
        System.out.println("----------------------------------");
        int price [] = {7,1,5,3,6,4};
        System.out.println(heighestProfit(price));
        System.out.println("----------------------------------");
        int num1 [] = {1,2,3,1};
        int num2 [] = {1,2,3,4};
        int num3 [] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(distinctOrNot(num1));
        System.out.println(distinctOrNot(num2));
        System.out.println(distinctOrNot(num3));
        System.out.println("----------------------------------");
        int nums [] = {4,5,6,7,0,1,2}; 
        //4,5,6,7,0,1,2 target = 0
        // 4,5,6,7,0,1,2 target = 3
        // 
        System.out.println(existsInRotation(nums, 3));
        System.out.println("----------------------------------");
        int height2[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height3[] = {4,2,0,3,2,5};
        System.out.println(totalTrapedWater(height2));
        System.out.println(totalTrapedWater(height3));
        System.out.println("----------------------------------");
        int numbers [] = {-1,0,1,2,-1,-4};
        triplets(numbers);
        System.out.println("----------------------------------");
    }
}
