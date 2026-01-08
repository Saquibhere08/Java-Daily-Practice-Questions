//4. Write a program to check whether a number is even or odd.
import java.util.Scanner;
public class basics4 {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        if(num%2==0){ //condition for Odd and Even
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }
    
}
