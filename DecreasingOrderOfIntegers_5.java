import java.util.Scanner;

public class DecreasingOrderOfIntegers_5 {

    public static void main(String[] args) {
        System.out.println("Enter three integers and display the integers in decreasing order: ");
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("So the decreasing order is");

        if ((a > b) && (b > c)) {
            System.out.println(a + "," + b + "," + c);
        } else if ((a > c) && (c > b)) {
            System.out.println(a + "," + c + "," + b);
        } else if ((b > a) && (a > c)) {
            System.out.println(b + "," + a + "," + c);
        } else if ((b > c) && (c > a)) {
            System.out.println(b + "," + c + "," + a);
        } else if ((c > b) && (b > a)) {
            System.out.println(c + "," + b + "," + a);
        } else {
            System.out.println(c + "," + a + "," + b);
        }
    }
}
