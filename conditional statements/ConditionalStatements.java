import java.util.*;
public class ConditionalStatements{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        if(num >= 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

        double temp = 103.5;

        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have fever");
        }

        System.out.println("Enter any number between 0 and 8 but not 0 and 8 : ");
        int day = sc.nextInt();

        switch (day) {
            case 1:System.out.println("monday");
                break;
            case 2:System.out.println("tuesday");
                break;
            case 3:System.out.println("wednesday");
                break;
            case 4:System.out.println("thursday");
                break;
            case 5:System.out.println("frieday");
                break;
            case 6:System.out.println("seturday");
                break;
            case 7:System.out.println("sunday");
                break;
            default:
                break;
        }

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("leap Year");
        }else if(year % 400 == 0){
            System.out.println("leap Year");
        }else{
            System.out.println("not a leap Year");
        }
    }

}