import java.util.Scanner;
public class Area_circle {
    public static void main (String[] args) {
        float Radius_circle;

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Radius of circle : ");
            Radius_circle = sc.nextInt();
            System.out.println("Area = " + Radius_circle*Radius_circle*3.14);
        }
    }


}

