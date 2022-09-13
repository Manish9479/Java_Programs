 class add
{
    int a,b,c ;

    void input(int x , int y){

        a=x;
        b=y;
    
    }

    void sum(){
        c=a+b;
    }
    
    void show()
    {
        System.out.println("Addition of A+B ="+c);
    }
}



   public class Demo2 
    
   {
       public static void main(String[] args) 
        
    
        {
            add obj = new add();
            int a, b;
            a=10;
            b=20;
            
            obj.input(a,b);
            obj.sum();
            obj.show();

        }
    }

