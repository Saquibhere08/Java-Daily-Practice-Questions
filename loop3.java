//3. Write a program to calculate factorial of a number.

import java.util.Scanner;

public class loop3{
    public static void main(String[] args) {

        int n,fac=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fac=fac*i; //factorial

        }
        System.out.println("Factorial of " + n + " is " + fac);
    }
}