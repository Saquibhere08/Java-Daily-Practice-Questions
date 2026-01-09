//1. Write a program to print first N natural numbers

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
2
