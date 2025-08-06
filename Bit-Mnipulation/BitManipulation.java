import java.util.*;

public class BitManipulation {

    public static int oddOrEven(int num){
        return (num & 1);
    }

    public static int getIthBit(int num,int i){
         if((num & (1<<i)) == 0) return 0;
         return 1;
    }

    public static int setIthBit(int num,int i){
        return (num | (1 << i ));
    }

    public static int clearIthBit(int num,int i){
        return (num & ~(1 << i));
    }

    public static int updateIthBit(int num,int i,int set){
        if((getIthBit(num, i) == 0 && set == 0) || (getIthBit(num, i) == 1 && set == 1)){
            return num;
        }else if(getIthBit(num, i) == 0 && set == 1){
            return num | (1 << i);
        }else{
            return num & ~(1 << i);
        }
    }

    public static int updateIthBit2(int num,int i,int set){
       if(set == 0){
        return clearIthBit(num, i);
       }else{
        return setIthBit(num, i);
       }
    }
    
    public static int clearIbits(int num,int i){
        return num & ~(1 << i);
    }
    
    public static int clearBitsInRange(int num,int start,int end){
        int range = (1 << end) | (1 << start)+1;
        return num | range;
    }
   
    public static boolean powerOfTwo(int num){
     if((num & (num-1)) == 0){
        return true;
     }
     return false;
   }
    
    public static int countSetBits(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
   
    public static int fastExponentiation(int num,int x){
        int ans = 1;
        while(x > 0){
            if((x & 1) == 1){
                ans = ans * num;
                num = num * num;
            }else{
                num = num * num;
            }
            x = x >> 1;
        }
        return ans;
    }
   
    public static void upperToLower(char ch){
        System.out.println((char)(ch | ' '));
    }
    public static void main(String[] args) {
        int num = 11; // 1
        System.out.println(oddOrEven(num));
        System.out.println("---------------------------------------");
        int num1 = 9; // 0
        System.out.println(getIthBit(num1,2));
        System.out.println("---------------------------------------");
        int num3 = 8; //10
        System.out.println(setIthBit(num3,1));
        System.out.println("---------------------------------------");
        int num4 = 15;
        System.out.println(clearIthBit(num4,2)); //11
        System.out.println("---------------------------------------");
        int num5 = 15;
        int num6 = 11;
        System.out.println(updateIthBit(num5,2,0)); // 11
        System.out.println(updateIthBit(num6,2,1)); // 15
        System.out.println("---------------------------------------");
         int num7 = 15;
        int num8 = 11;
        System.out.println(updateIthBit2(num7,2,0)); // 11
        System.out.println(updateIthBit2(num8,2,1)); // 15
        System.out.println("---------------------------------------");
        int num9 = 15;
        System.out.println(clearIbits(num9,2)); // 12
        System.out.println("---------------------------------------");
        int bitsRange = 2047;
        System.out.println(clearBitsInRange(bitsRange,2,8));
        System.out.println("---------------------------------------");
        System.out.println(powerOfTwo(1024));
        System.out.println("---------------------------------------");
        System.out.println(countSetBits(9));
        System.out.println("---------------------------------------");
        System.out.println(fastExponentiation(3, 5));
        System.out.println("---------------------------------------");
        int x = 12;
        int y = 15;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("the number X = "+x+"\nthe number Y = "+y);
        System.out.println("---------------------------------------");
        char ch = 'A';
        upperToLower(ch);
        System.out.println("---------------------------------------");

    }
}
