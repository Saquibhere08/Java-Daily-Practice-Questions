//3. Write a program to take two numbers as input and print their sum

import java.util.Scanner;

public class basics3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //using the Scanner class
        System.out.println("Enter num1= ");
        int m=sc.nextInt();

        System.out.println("Enter num2= ");
        int n=sc.nextInt();

        int sum = m+n;
        System.out.println("Sum  is: "+sum);


    }
    
}
