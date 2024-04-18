import java.util.Scanner;
public class Num1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        
        
        if (a > 0) {
            System.out.println("Positive number");
        } else if (a < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number equals zero");
        }
       
    }
}
