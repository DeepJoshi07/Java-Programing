import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        int ch = 65;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((char) ch) + " ");
                ch++;
            }
            System.out.println();
        }

        System.out.println("-------------------");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------");

        for (int i = 1; i <= num; i++) {
            for (int k = 0; k < num - i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
        System.out.println("-------------------");


         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num-i)+1; j++) {
                System.out.print(" "+j+" ");
            }

            System.out.println();
        }
        System.out.println("-------------------");


         int update = 1;
         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+update+" ");
                update++;
            }

            System.out.println();
        }
        System.out.println("-------------------");


         int zeroOrOne = 1;
         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+zeroOrOne+" ");
                if(zeroOrOne == 1){
                    zeroOrOne = 0;
                }else{
                    zeroOrOne = 1;
                }
            }
            zeroOrOne = 0;
            System.out.println();
        }
        System.out.println("-------------------");

    }
}