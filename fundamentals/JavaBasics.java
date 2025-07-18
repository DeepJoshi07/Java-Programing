import java.util.*;

public class JavaBasics {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your name: ");
        // String myName = sc.nextLine();

        // System.out.println(myName);

        // int a = 23;
        // int b = 34;
        // System.out.println(a+b);

        // System.out.print("hello world");

        // int a = 23;
        // float b = 25.25f;

        // System.out.println((int)(a+b));

        // 1). Average of three numbers
        // System.out.println("Enter your first number :");
        // int num1 = sc.nextInt();
        // System.out.println("Enter your second number :");
        // int num2 = sc.nextInt();
        // System.out.println("Enter your third number :");
        // int num3 = sc.nextInt();

        // double avg = (num1+num2+num3)/3;

        // System.out.println("Your sum is : " + (num1+num2+num3));
        // System.out.println("Your avg is : " + avg);


        //  2). Area of Square

        // System.out.println("Enter the length : ");
        // int side = sc.nextInt();

        // System.out.println("the area of the square is : "+(side*side));


        // 3). Create the bill

        System.out.println("Enter the price of pen : ");
        int pen = sc.nextInt();
        System.out.println("Enter the price of pencil : ");
        int pencil = sc.nextInt();
        System.out.println("Enter the price of eraser : ");
        int eraser = sc.nextInt();

        System.out.println("Your total bill is : "+(pen+pencil+eraser));
        System.out.println("Your total bill with GST is : "+((pen+pencil+eraser)+(pen+pencil+eraser)*0.18));


        int $ = 12;

    }
}