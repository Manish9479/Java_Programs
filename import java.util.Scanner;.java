import java.util.Scanner;

public class Student {

    private String Name;
    private String Roll;
    private String Branch;
    private int Semester;

    public void input(){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Please input your Name: ");
        Name = scan.nextLine();
      
        System.out.println("Please input your Roll No: ");
        Roll = scan.nextLine();
     
        System.out.println("Please input your Branch: ");
        Branch = scan.nextLine();
        
        System.out.println("Please input your Semester: ");
        Semester = scan.nextInt();
        System.out.println("\n");

    }

    public void output(){
        System.out.println("Name: " + Name);       
        System.out.println("Roll No: " + Roll);
        System.out.println("Branch: " + Branch);
        System.out.println("Semester: " + Semester);
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Student john = new Student();
        john.input();
        john.output();

        Student ram = new Student();
        ram.input();
        ram.output();

        Student ali = new Student();
        ali.input();
        ali.output();


    }
}