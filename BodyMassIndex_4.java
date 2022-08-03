import java.util.*;

public class BodyMassIndex_4 {

    public static void main(String[] args) {
        System.out.println("Enter a weight in pounds and height in inches and display BMI: ");
        Scanner sc = new Scanner(System.in);
        sc.close();

        double weight, height;
        weight = sc.nextDouble();
        height = sc.nextDouble();

        System.out.println("Weight = " + weight + "pound");
        System.out.println("Height = " + height + "inch");
        System.out.println("BMI = " + (weight * 0.453592) / ((height * 0.0254) * (height * 0.0254)) + "kg/m*m");
    }
}