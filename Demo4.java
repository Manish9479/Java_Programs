
class Add
{
    int a,b,c ;

    Add(int x, int y){

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

   public class Demo4 
    
   {
       public static void main(String[] args) 
        
    
        {
            int a =10 ; int b = 20;
            Add obj = new Add(a,b);
            
            obj.sum();
            obj.show();

        }
    }


