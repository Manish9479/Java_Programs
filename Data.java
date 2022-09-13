import java.util.Scanner;
public class Data {
    public static void main (String[] args) {
        int roll_no;
        float percentage;
        String name;
        String gender;
        String addr;
        boolean local;

        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter Roll No: ");
        roll_no = sc.nextInt();
        System.out.println("Enter Percentage: ");
        percentage = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Gender: ");
        gender = sc.nextLine();
        System.out.println("Enter Addr: ");
        addr = sc.nextLine();
        System.out.println("Enter Local: ");
        local = sc.nextBoolean();

        System.out.println("roll no = " + roll_no);
        System.out.println("percentage = " + percentage);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("address = " + addr);
        System.out.println("local = " + local);
        }
    }
}