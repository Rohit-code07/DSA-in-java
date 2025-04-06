import java.util.*;

public class circleCircumference { 
//Write a function that takes in the radius as input and returns the circumference of a circle.

    public static double circumference(float r){
      return 2* r * 3.14;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = sc.nextInt();
    double circum = circumference(radius);
    System.out.println(" circumference of circle:"+circum);
    }
}
