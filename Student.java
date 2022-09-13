import java.util.*;

class Student {

    private String name;
    private String roll_no;
    private String branch;
    private int semester ;
    

    public void input() {

        Scanner sc = new Scanner(System.in)
        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        roll_no = sc.nextInt();
        System.out.println("Enter your branch : ");
        branch = sc.nextLine();
        System.out.println("Enter Semester: ");
        semester = sc.nextLine();  

        
    }

     public void output() {
        System.out.println("name = " + name);
        System.out.println("roll no = " + roll_no);
        System.out.println("branch = " + branch);
        System.out.println("semester = " + semester);

    }

    public static void main  (String[] args) {
        Student John = new Student();
        John.inputS();
        John.output();

        Student Ram = new Student();
        Ram.inputS();
        Ram.output();

        Student Ali = new Student();
        Ali.inputS();
        Ali.output();

    }
   
   

}
