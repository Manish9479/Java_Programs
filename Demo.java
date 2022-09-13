import java.util.Scanner;
 class add
{
    int a,b,c ;

    void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No.");
        a=sc.nextInt();
        System.out.println("Enter Second No.");
        b=sc.nextInt();
    
    }

    void sum(){
        c=a+b;
    }

    void show()
    {
        System.out.println("Addition of A+B ="+c);
    }
}

  public class Demo 
    
   {
       public static void main(String[] args) 
        
    
        {
            add obj = new add();
            obj.input();
            obj.sum();
            obj.show();

        }
    }



