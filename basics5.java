//5. Write a program to find the largest of three numbers.

public class basics5 {
    public static void main(String[] args) {
        int a = 20;
        int b = 456;
        int c = 66;

        int largest;

        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c; // guaranteed case
        }

        System.out.println("Largest value among 3 is: " + largest);
    }
}
