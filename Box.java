// WAP to print volume of box.Box is class which have following set of attributes 
// 1. Height
// 2. Weight
// 3. Width

import java.util.Scanner;
public class Box {
    public static void main (String[] args) {
        float Height;
        float Length;
        float Width;

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Height of BOX : ");
            Height = sc.nextInt();
            System.out.println("Enter Weight of Box : ");
            Length = sc.nextInt();
            System.out.println("Enter Width of Box : ");
            Width = sc.nextInt();
            System.out.println("Volume  = " + Height*Length*Width );
        }
    }
}
