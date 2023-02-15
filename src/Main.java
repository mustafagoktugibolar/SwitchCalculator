
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String process = "1 - Add\n 2 - Substract\n 3 - Multiply\n 4 - Divide";

        System.out.print("Enter the first number : ");
        double n1 = sc.nextDouble();

        System.out.print("Enter the second number (Cant be zero): ");
        double n2 = sc.nextDouble();

        System.out.println(process);
        System.out.print("Choose Process :");
        int input = sc.nextInt();

        switch(input){
            case 1 :
                System.out.println("Result : " + (n1 + n2));
                break;

            case 2 :
                System.out.println("Result : " + (n1 - n2));
                break;
                
            case 3 :
                System.out.println("Result : " + (n1 * n2));
                break;
                
            case 4 : 
                if(n2 == 0){
                    System.out.println("Second number can't be zero");
                    break;
                }
                else{
                    System.out.println("Result : " + (n1 / n2)); 
                    break;
                }
                
                
            default :
                System.out.println("Unvalid process");
                break; 
        }  
    }
}
